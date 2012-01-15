/**
 * Copyright (c) 2011-2012 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.ecore.xcore.formatting;


import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;

import com.google.inject.Inject;


/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class XcoreFormatter extends XbaseFormatter
{
  @Inject
  XbaseGrammarAccess xbaseGrammarAccess;

  @Override
  protected void configureFormatting(FormattingConfig c)
  {
    // configure(c, xbaseGrammarAccess);
    c.setAutoLinewrap(140);
    org.eclipse.emf.ecore.xcore.services.XcoreGrammarAccess f = (org.eclipse.emf.ecore.xcore.services.XcoreGrammarAccess)getGrammarAccess();
    for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}"))
    {
      c.setIndentation(pair.getFirst(), pair.getSecond());
      c.setLinewrap(1).before(pair.getFirst());
      c.setLinewrap(1).after(pair.getFirst());
      c.setLinewrap(1).before(pair.getSecond());
      c.setLinewrap(1).after(pair.getSecond());
    }
    for (Keyword comma : f.findKeywords(","))
    {
      c.setNoLinewrap().before(comma);
      c.setNoSpace().before(comma);
      c.setLinewrap().after(comma);
    }
    for (Keyword dot : f.findKeywords("."))
    {
      c.setNoSpace().around(dot);
    }
    for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("<", ">"))
    {
      c.setNoSpace().after(pair.getFirst());
      c.setNoSpace().before(pair.getSecond());
    }
    for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")"))
    {
      c.setNoSpace().after(pair.getFirst());
      c.setNoSpace().before(pair.getSecond());
    }
    c.setLinewrap(1).after(f.getXImportDirectiveRule());
    c.setLinewrap(2).after(f.getXPackageAccess().getImportDirectivesXImportDirectiveParserRuleCall_4_0());

    c.setNoSpace().before(f.getXGenericTypeAccess().getLessThanSignKeyword_1_0());

    c.setNoSpace().after(f.getXAnnotationAccess().getCommercialAtKeyword_0());
    c.setNoSpace().before(f.getXAnnotationAccess().getLeftParenthesisKeyword_2_0());
    c.setLinewrap(1).before(f.getXAnnotationRule());
    c.setLinewrap(1).after(f.getXAnnotationRule());
    c.setNoSpace().before(f.getXStringToStringMapEntryAccess().getEqualsSignKeyword_1());
    c.setNoSpace().after(f.getXStringToStringMapEntryAccess().getEqualsSignKeyword_1());

    c.setLinewrap(1).after(f.getXAnnotationDirectiveRule());
    c.setLinewrap(2).after(f.getXPackageAccess().getAnnotationDirectivesXAnnotationDirectiveParserRuleCall_5_0());

    c.setNoSpace().before(f.getXOperationAccess().getLeftParenthesisKeyword_7());
    c.setLinewrap(2).after(f.getXPackageAccess().getNameAssignment_3());
    c.setLinewrap(2).after(f.getXClassRule());
    c.setLinewrap(2).after(f.getXDataTypeRule());
    c.setLinewrap(2).after(f.getXEnumRule());
    c.setLinewrap(1).before(f.getXOperationRule());
    c.setLinewrap(1).after(f.getXOperationRule());
    c.setLinewrap(1).after(f.getXAttributeRule());
    c.setLinewrap(1).after(f.getXReferenceRule());
    c.setLinewrap(1).after(f.getXEnumLiteralRule());
    c.setNoSpace().before(f.getXClassAccess().getLessThanSignKeyword_4_0());
    c.setNoSpace().before(f.getXDataTypeAccess().getLessThanSignKeyword_3_0());

    c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
  }
}
