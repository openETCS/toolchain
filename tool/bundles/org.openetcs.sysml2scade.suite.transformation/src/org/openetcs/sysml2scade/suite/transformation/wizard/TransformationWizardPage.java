package org.openetcs.sysml2scade.suite.transformation.wizard;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class TransformationWizardPage extends WizardPage implements StringConstants {

	private Combo projectNameWidget;
	private Text modelNameWidget;
	private Button checkModel;
	private List<String> targets;

	protected TransformationWizardPage(String pageName, List<String> targets) {
		super(pageName);
		setTitle(pageName);
		setPageComplete(false);
		setDescription(UI_WIZARDPAGE_DESCRIPTION);
		setErrorMessage(UI_WIZARDPAGE_EMSG_NAME);
		this.targets = targets;
	}
	
	@Override
	public void createControl(Composite parent) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "de.fraunhofer.esk.ernest.core.cdt.help_general");
		
		// Create composite for widgets
		Composite composite = new Composite(parent, SWT.NONE);
		
		// Create layout for wizard page
		GridLayout gl = new GridLayout(2, false);
		composite.setLayout(gl);

		GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);

		// Project
		new Label(composite, SWT.NONE).setText(UI_WIZARDPAGE_PROJECTNAME);
		projectNameWidget = new Text(composite, SWT.BOLD | SWT.BORDER);
		projectNameWidget.setLayoutData(gridData);
		projectNameWidget.addListener(SWT.CHANGED, new Listener() {
			@Override
			public void handleEvent(Event e) {
				if (!projectNameWidget.getText().equals("")) {
					setPageComplete(true);
					setErrorMessage(null);
				} else {
					setPageComplete(false);
					setErrorMessage(UI_WIZARDPAGE_EMSG_NAME);
				}
			}
		});


		new Label(composite, SWT.None).setText(UI_WIZARDPAGE_MODELNAME);
		modelNameWidget = new Text(composite, SWT.BOLD | SWT.BORDER);
		modelNameWidget.setLayoutData(gridData);

		// Check model
		GridData spanData = new GridData(GridData.FILL, GridData.END, true, false);
		spanData.horizontalSpan = 2;
		// spanData.grabExcessVerticalSpace = true;
		checkModel = new Button(composite, SWT.CHECK);
		checkModel.setText(UI_WIZARDPAGE_CHECK_MODEL);
		checkModel.setLayoutData(spanData);
		checkModel.setSelection(true);
		
		
		setControl(composite);
	}
	
	public String getProjectName() {
		return projectNameWidget.getText();
	}
	
	public String getModelName() {
		return modelNameWidget.getText();
	}
	
	public boolean performModelCheck() {
		return checkModel.getSelection();
	}
}
