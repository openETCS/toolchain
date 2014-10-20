package org.openetcs.datadictionary.transform.ui;

import java.io.File;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 * Configuration dialog for Bitwalker transform.
 *
 */
public class TransformationDialog extends TitleAreaDialog {

	static String[] FILE_EXTENSIONS = { "*.xml" };
	static String[] FILE_NAMES = { "Bitwalker xml" };

	private String[] mFiles;	
	private String mModelName;
	private String mProjectName;
	private ListViewer mListViewer;
	private Text mTxtModelName;
	private Text mTxtProjectName;

	/**
	 * Create the dialog
	 * 
	 * @param parentShell shell to be used.
	 */
	public TransformationDialog(final Shell parentShell) {
		super(parentShell);		
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout(1, false);
		composite.setLayout(layout);
		
		mListViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		List list = mListViewer.getList();
		GridData gd_list = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_list.heightHint = 80;
		list.setLayoutData(gd_list);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		composite_1.setLayout(new GridLayout(4, false));
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Project name");
		
		mTxtProjectName = new Text(composite_1, SWT.BORDER);
		mTxtProjectName.setText("DataDictionary");
		mTxtProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnRemove = new Button(composite_1, SWT.NONE);
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) mListViewer.getSelection();
				if (selection.size() > 0) {
					for (Object file : selection.toArray()) {		        
						mListViewer.remove((String)file);
					}
				}
			}
		});
		btnRemove.setBounds(0, 0, 69, 25);
		btnRemove.setText("Remove");
		
		Button btnAdd = new Button(composite_1, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
				FileDialog dialog = new FileDialog(getShell(), SWT.MULTI);
				dialog.setFilterExtensions(FILE_EXTENSIONS);
				dialog.setFilterNames(FILE_NAMES);				
				
				if (dialog.open() != null) {
					StringBuffer buf = new StringBuffer();
			        String[] files = dialog.getFileNames();
			        String filter = dialog.getFilterPath();
			        for (String file : files) {			        	
			        	buf.append(filter);
			            if (buf.charAt(buf.length() - 1) != File.separatorChar) {
			            	buf.append(File.separatorChar);
			            }
			            buf.append(file);
			            mListViewer.remove(buf.toString());
			            mListViewer.add(buf.toString());
			            buf.setLength(0);
			        }
				}		        
			}
		});
		btnAdd.setBounds(0, 0, 69, 25);
		btnAdd.setText("Add");
		
		Label lblModelName = new Label(composite_1, SWT.NONE);
		lblModelName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModelName.setText("Model name");
		
		mTxtModelName = new Text(composite_1, SWT.BORDER);
		mTxtModelName.setText("DataDictionary");
		mTxtModelName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		mModelName = mTxtModelName.getText();
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		return composite;
	}


	/**
	 * Get Bitwalker files (available after widget is disposed).
	 * 
	 * @return get Bitwalker files.
	 */
	public String[] getFiles() {
		return mFiles;		
	}

	/**
	 * Get model name (available after widget is disposed).
	 * 
	 * @return model name.
	 */
	public String getModelName() {
		return mModelName;		
	}
	
	/**
	 * Get project name (available after widget is disposed).
	 * 
	 * @return project name.
	 */
	public String getProjectName() {
		return mProjectName;		
	}
	
	@Override
	public void create() {
		super.create();
		setTitle("Generate the DataDictionary model.");
		setMessage("Select bitwalker files to transform.");
	}
		
	@Override
	protected Point getInitialLocation(Point initialSize) {
		Shell parentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Rectangle shellBounds = parentShell.getBounds();
		Point shellCenter = new Point(shellBounds.x + shellBounds.width / 2, (shellBounds.y + shellBounds.height) / 2);
		return new Point(shellCenter.x - initialSize.x / 2, shellCenter.y - initialSize.y / 2);
	}

	@Override
	protected void okPressed() {
		mFiles = mListViewer.getList().getItems();
		mModelName = mTxtModelName.getText();
		mProjectName = mTxtProjectName.getText();
		super.okPressed();
	}
}
