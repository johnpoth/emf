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
 * $Id: StaticBidirectionalTest.java,v 1.2 2005/03/17 23:28:31 nickb Exp $
 */
package org.eclipse.emf.test.performance.sdo.accessor;


import java.net.URL;
import java.util.List;
import java.util.Properties;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.sdo.EProperty;
import org.osgi.framework.Bundle;

import com.example.sdo.library.Book;
import com.example.sdo.library.Writer;
import commonj.sdo.DataObject;
import commonj.sdo.Property;


public class StaticBidirectionalTest extends DynamicBidirectionalTest
{

  protected static Properties props = new Properties();
  protected static int iterations;

  /**
   * By calculating the value of iterations based on the value in the accompanying iterations.properties file,
   * changing the values of the iterations can be done all in one place instead of throughout this file.
   * Additionally, static fields are no longer required to define ITERATIONS_* constants.
   * @param name
   */
  public StaticBidirectionalTest(String name)
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

    testSuite.addTest(new StaticBidirectionalTest("setAdaptedByGenerated").setWarmUp(0).setRepetitions(REPETITIONS_10));
    // TODO tune warmup
    testSuite.addTest(new StaticBidirectionalTest("setByGenerated").setWarmUp(1000).setRepetitions(REPETITIONS_10));
    testSuite.addTest(new StaticBidirectionalTest("setWithESet").setWarmUp(1000).setRepetitions(REPETITIONS_10));

    return testSuite;
  }

  protected void setUp() throws Exception
  {
    super.setUp();
  }

  protected void libSetup()
  {
    initLib();

    //serializeDataGraph();

    initModel();
  }

  protected void initLib()
  {
    //SDOFactory sdoFactoryInstance = SDOFactory.eINSTANCE;
    //EDataGraph dataGraph = sdoFactoryInstance.createEDataGraph();

    // DocumentRoot root = ipoFactoryInstance.createDocumentRoot();

    //Library lib = libFactoryInstance.createLibrary();
    //lib.setName("The Open Library");

    Writer writer = libFactoryInstance.createWriter();
    this.writer0 = (DataObject)writer;
    writer.setName("Mr. new writer 0");

    Book book = libFactoryInstance.createBook();
    this.book0 = (DataObject)book;
    book.setTitle("The New Title 0");
    book.setAuthor(writer);

    writer = libFactoryInstance.createWriter();
    this.writer1 = (DataObject)writer;
    writer.setName("Mr. new writer 1");

    book = libFactoryInstance.createBook();
    this.book1 = (DataObject)book;
    book.setTitle("The New Title 1");
    book.setAuthor(writer);

    // root.setPurchaseOrder(po);
    //dataGraph.setERootObject((EObject)root);
    //dataGraph.setEChangeSummary(sdoFactoryInstance.createEChangeSummary());
  }

  private void initModel()
  {
    List bookProperties = book1.getType().getProperties();
    authorProp = (Property)bookProperties.get(3);
    authorFeat = ((EProperty)authorProp).getEStructuralFeature();

    List writerProperties = writer1.getType().getProperties();
    bookProp = (Property)writerProperties.get(1);
    bookFeat = ((EProperty)bookProp).getEStructuralFeature();
  }

  public void setByGenerated()
  {
    Book book0 = (Book)this.book0;
    Writer writer0 = (Writer)this.writer0;
    Writer writer1 = (Writer)this.writer1;

    startMeasuring();
    for (int i = 0; i < iterations; i++)
    {
      book0.setAuthor(writer1);
      book0.setAuthor(writer0);
    }
    stopMeasuring();
  }

  public void setAdaptedByGenerated()
  {
    Writer writer0 = (Writer)this.writer0;
    Writer writer1 = (Writer)this.writer1;
    Book book0 = (Book)this.book0;
    Book book1 = (Book)this.book1;
    ((Notifier)book0).eAdapters().add(adapter);
    ((Notifier)book0).eAdapters().add(adapter);
    ((Notifier)writer0).eAdapters().add(adapter);
    ((Notifier)writer1).eAdapters().add(adapter);

    startMeasuring();
    for (int i = 0; i < iterations; i++)
    {
      book0.setAuthor(writer1);
      book0.setAuthor(writer0);
    }
    stopMeasuring();
  }

  public void testGetIterationsCount()
  {
	  System.out.println("testGetIterationsCount: "+iterations);
  }

}
