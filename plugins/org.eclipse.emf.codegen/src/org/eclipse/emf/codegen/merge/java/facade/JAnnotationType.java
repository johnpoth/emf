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
package org.eclipse.emf.codegen.merge.java.facade;

/**
 * Annotation type declaration as defined by JLS3 9.6.
 * <blockquote><pre><em>
 * AnnotationTypeDeclaration:
 * &nbsp;&nbsp;     InterfaceModifiers<sub>opt</sub> &#64; interface Identifier AnnotationTypeBody
 * 
 * AnnotationTypeBody:
 * &nbsp;&nbsp;</em>{<em> AnnotationTypeElementDeclarations<sub>opt</sub> </em>}
 * </pre></blockquote>
 * 
 * @see <a href="http://java.sun.com/docs/books/jls/third_edition/html/interfaces.html">Section 9.6</a>
 * @since 2.3.0
 */
public interface JAnnotationType extends JAbstractType
{
  // Empty
}
