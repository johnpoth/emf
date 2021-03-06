/**
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.test.tools.merger;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Each test method in this class works with same directory as {@link JMergerTest}.
 * <p>
 * This test should contain special test cases that require special code executed for them.
 * <p>
 */
@RunWith(Parameterized.class)
public class JMergerASTTest extends JMergerTest
{
  /**
   * Name of the expected output file when AST facade implementation is used.
   * @see #getTestSpecificExpectedOutput()
   */
  public static final String AST_EXPECTED_OUTPUT_FILENAME = "ASTMergerExpected.java";

  public JMergerASTTest(String label, File dataDirectory)
  {
    super(dataDirectory);
  }

  @Parameters(name="Merging {0}")
  public static Collection<Object[]> parameters()
  {
    return JMergerTest.parameters("AST");
  }

  @Override
  protected void instanceTest(FacadeHelper facadeHelper)
  {
    assertTrue(ASTFacadeHelper.class.isInstance(facadeHelper));
  }

  @Override
  protected FacadeHelper instanciateFacadeHelper()
  {
    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
    return facadeHelper;
  }

  @Override
  protected File getTestSpecificExpectedOutput()
  {
    return new File(dataDirectory, AST_EXPECTED_OUTPUT_FILENAME);
  }
}
