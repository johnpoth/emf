/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: StaticSequenceTest.java,v 1.4 2005/03/17 23:28:31 nickb Exp $
 */
package org.eclipse.emf.test.performance.sdo.accessor;


import java.net.URL;
import java.util.List;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.sdo.EDataGraph;
import org.eclipse.emf.ecore.sdo.EProperty;
import org.eclipse.emf.ecore.sdo.SDOFactory;
import org.osgi.framework.Bundle;

import com.example.sdo.epo.PurchaseOrder;
import com.example.sdo.epo.Supplier;
import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Sequence;


public class StaticSequenceTest extends DynamicSequenceTest
{

  protected static Properties props = new Properties();
  protected static int iterations;

  /**
   * By calculating the value of iterations based on the value in the accompanying iterations.properties file,
   * changing the values of the iterations can be done all in one place instead of throughout this file.
   * Additionally, static fields are no longer required to define ITERATIONS_* constants.
   * @param name
   */
  public StaticSequenceTest(String name)
  {
    super(name);
	int it = Integer.parseInt("0"+props.getProperty(StaticIPOSDOAccessorTest.class.getName()+"."+name));
	iterations = it > 0 ? it : 1;
  }

  public static Test suite()
  {
    TestSuite testSuite = new TestSuite();

	try {
		Bundle bundle = Platform.getBundle("org.eclipse.emf.test.performance");
		URL url = Platform.find(bundle, new Path("iterations.properties"));
		props.load(url.openStream());
	} catch (Exception e) {
		e.printStackTrace();
	}
	//props.list(System.out);
	testSuite.addTest(new DynamicIPOSDOAccessorTest("testGetIterationsCount"));

    // TODO tune warmup.

    testSuite.addTest(new StaticSequenceTest("getSequenceByGenerated").setWarmUp(1000).setRepetitions(REPETITIONS));
    testSuite.addTest(new StaticSequenceTest("getDerivedByGenerated").setWarmUp(1000).setRepetitions(REPETITIONS));

    testSuite.addTest(new StaticSequenceTest("getSequenceWithEGet").setWarmUp(1000).setRepetitions(REPETITIONS));
    testSuite.addTest(new StaticSequenceTest("getDerivedWithEGet").setWarmUp(1000).setRepetitions(REPETITIONS));

    testSuite.addTest(new StaticSequenceTest("getSequence").setWarmUp(1000).setRepetitions(REPETITIONS));
    testSuite.addTest(new StaticSequenceTest("getDerived").setWarmUp(1000).setRepetitions(REPETITIONS));

    return testSuite;
  }

  protected void setUp() throws Exception
  {
    super.setUp();
  }

  protected void supplierSetup()
  {
    initSupplier();
    initModel();
  }

  protected void initSupplier()
  {
    SDOFactory sdoFactoryInstance = SDOFactory.eINSTANCE;
    EDataGraph dataGraph = sdoFactoryInstance.createEDataGraph();

    Supplier supplier = epoFactoryInstance.createSupplier();
    this.supplier = (DataObject)supplier;
    supplier.setName("The Supplier");

    PurchaseOrder po = epoFactoryInstance.createPurchaseOrder();
    po.setComment("po1");
    supplier.getPriorityOrders().add(po);

    po = epoFactoryInstance.createPurchaseOrder();
    po.setComment("po2");
    supplier.getStandardOrders().add(po);
  }

  private void initModel()
  {
    List properties = supplier.getType().getProperties();
    ordersProp = (Property)properties.get(1);
    ordersFeat = ((EProperty)ordersProp).getEStructuralFeature();
    priorityOrdersProp = (Property)properties.get(2);
    priorityOrdersFeat = ((EProperty)priorityOrdersProp).getEStructuralFeature();
    standardOrdersProp = (Property)properties.get(3);
    standardOrdersFeat = ((EProperty)standardOrdersProp).getEStructuralFeature();
  }

  public void getSequenceByGenerated()
  {
    Supplier supplier = (Supplier)this.supplier;
    Sequence ordersValue = this.sequenceValue;

    startMeasuring();
    for (int i = 0; i < iterations; i++)
    {
      if (ordersValue != this)
      {
        // TODO ideally, we'd want to call different methods (which return Sequence).
        ordersValue = supplier.getOrders();
      }
    }
    stopMeasuring();
  }

  public void getDerivedByGenerated()
  {
    Supplier supplier = (Supplier)this.supplier;
    List derivedValue = this.derivedValue;

    startMeasuring();
    for (int i = 0; i < iterations; i++)
    {
      if (derivedValue != this)
      {
        derivedValue = supplier.getPriorityOrders();
        derivedValue = supplier.getStandardOrders();
      }
    }
    stopMeasuring();
  }

  public void testGetIterationsCount()
  {
	  System.out.println("testGetIterationsCount: "+iterations);
  }

}
