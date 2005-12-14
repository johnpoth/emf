/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ModelExporterWizard.java,v 1.2 2005/12/14 13:50:00 marcelop Exp $
 */
package org.eclipse.emf.exporter.ui.contribution.base;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ui.contribution.base.ModelConverterWizard;
import org.eclipse.emf.exporter.ExporterPlugin;
import org.eclipse.emf.exporter.ModelExporter;


/**
 * @since 2.2.0
 */
public abstract class ModelExporterWizard extends ModelConverterWizard
{
  protected static final String PREFERENCE_SAVE_EXPORTER = "ModelExporterWizard.SaveExporter";
  protected static final String PREFERENCE_SAVE_PACKAGE_URI = "ModelExporterWizard.SavePackageURI";
  
  public ModelExporter getModelExporter()
  {
    return (ModelExporter)getModelConverter();
  }
  
  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
    super.init(workbench, selection);
    
    Object object = selection.getFirstElement();
    
    try
    {
      if (object instanceof IFile)
      {
        URI uri = URI.createPlatformResourceURI(((IFile)object).getFullPath().toString(), true);
        getModelExporter().loadGenModel(uri);
      }
      else if (object instanceof GenModel)
      {
        getModelExporter().setGenModel((GenModel)object);
      }
   
      readPreferencesSettings();
      
      if (getModelExporter().getDirectoryURI() == null)
      {
        GenModel genModel = getModelExporter().getGenModel();
        if (genModel != null && genModel.eResource() != null)
        {
          URI uri = genModel.eResource().getURI().trimSegments(1);
          getModelExporter().setDirectoryURI(uri.toString() + "/");
        }
      }      
    }
    catch (DiagnosticException exception)
    {
      Diagnostic diagnostic = exception.getDiagnostic();
      ErrorDialog.openError
        (getShell(),
         GenModelEditPlugin.INSTANCE.getString("_UI_ModelProblems_title"),
         ExporterPlugin.INSTANCE.getString("_UI_InvalidModel_message"),
         BasicDiagnostic.toIStatus(diagnostic));
    }    
  }
  
  protected void readPreferencesSettings()
  {
    Preferences preferences = ExporterPlugin.getPlugin().getPluginPreferences();
    ModelExporter modelExporter = getModelExporter();

    modelExporter.setSaveEPackageArtifactURI(preferences.getBoolean(PREFERENCE_SAVE_PACKAGE_URI));
    modelExporter.setSaveExporter(preferences.getBoolean(PREFERENCE_SAVE_EXPORTER));    
  }

  protected void writePreferencesSettings()
  {
    Preferences preferences = ExporterPlugin.getPlugin().getPluginPreferences();
    ModelExporter modelExporter = getModelExporter();

    preferences.setValue(PREFERENCE_SAVE_PACKAGE_URI, modelExporter.isSaveEPackageArtifactURI());
    preferences.setValue(PREFERENCE_SAVE_EXPORTER, modelExporter.isSaveExporter());
    ExporterPlugin.getPlugin().savePluginPreferences();
  }

  protected void doPerformFinish(Monitor monitor) throws Exception
  {
    getModelExporter().export(monitor);
    getModelExporter().save();
    writePreferencesSettings();
  }  
}
