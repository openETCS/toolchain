package antexecutor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class DocumentationTest extends TestCase {
	
	File folder = new File(System.getProperty("user.dir"));
	String rootDir = folder.getParent();
	
	public DocumentationTest(String testName) {
		super(testName);
	}    
       
    @Test
	public void testCloneIsOk() {
    	System.out.println("TestCloneIsOk");
		boolean cloneDirectoriesCreated = false;
		boolean mdFilesCreated = false, mediawikiFilesCreated = false, mdMediawikiFilesCreated = false;
		//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "clone");
		//Test correctness of cloned-repository directory structure
		File folderClonedRepository = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"cloned_repository");
		File folderClonedRepository_Git = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"cloned_repository"+'\\'+".git");
		File folderClonedRepository_Data = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"cloned_repository"+'\\'+"data");
		File folderClonedRepository_Images = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"cloned_repository"+'\\'+"images");
		if (folderClonedRepository.exists() && folderClonedRepository_Git.exists() && folderClonedRepository_Data.exists() && folderClonedRepository_Images.exists()) {
			cloneDirectoriesCreated = true;
		}
		else{
			cloneDirectoriesCreated = false;
		}
		//Test if cloned_repository contains .md and .mediawiki files
		if(cloneDirectoriesCreated){
			File[] filesInClonedRepository = folderClonedRepository.listFiles();
			int i;
			String ext;
			for (int x=0;x<filesInClonedRepository.length;x++){
				  i = filesInClonedRepository[x].getName().lastIndexOf('.');
				  if(i>0 && i<filesInClonedRepository[x].getName().length()-1){
					  ext = filesInClonedRepository[x].getName().substring(i+1, filesInClonedRepository[x].getName().length());
					  if(ext.equals("md")){
						  mdFilesCreated = true;
					  }
					  if(ext.equals("mediawiki")){
						  mediawikiFilesCreated = true;
					  }
					  if(mdFilesCreated && mediawikiFilesCreated){
						  mdMediawikiFilesCreated = true;
						  break;
					  }else{
						  mdMediawikiFilesCreated = false;
					  }					  
				  }
				}
		}		
		assertTrue(cloneDirectoriesCreated && mdMediawikiFilesCreated);			
	}
    
    @Test
   	public void testDocumentationCreationIsOk() {
    	System.out.println("testDocumentationCreationIsOk");
    	File fileMediawikiTxt = null;
    	File[] filesInDocumentationFolder;
    	int i;
		String ext, fileName;
		List <String> nameOfFilesInDocumentationFolder = new ArrayList <String>();
		boolean documentationDirectoryCreated = false;
    	boolean mediawikiFileCorrectlyCreated = false, mediawikiFileCreated = false;
		
    	//Test if documentation directory is correctly created    	
    	//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "reset_folders");
    	File folderDocumentation = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation");
    	if (folderDocumentation.exists()){
    		documentationDirectoryCreated = true;
    	}
    	//Test if mediawiki_files.txt file has been created
    	if(documentationDirectoryCreated){
    		fileMediawikiTxt = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation"+'\\'+"mediawiki_files.txt");
    		if(fileMediawikiTxt.exists()){    			
        		mediawikiFileCreated = true;
        	}
    	}
    	//Test if mediawiki_files.txt file contains the name of .mediawiki files in documentation folder
    	if(mediawikiFileCreated){
    		filesInDocumentationFolder = folderDocumentation.listFiles();
        	
    		for (int x=0;x<filesInDocumentationFolder.length;x++){
    			  i = filesInDocumentationFolder[x].getName().lastIndexOf('.');
    			  if(i>0 && i<filesInDocumentationFolder[x].getName().length()-1){
    				  ext = filesInDocumentationFolder[x].getName().substring(i+1, filesInDocumentationFolder[x].getName().length());				  
    				  if(ext.equals("mediawiki")){
    					  nameOfFilesInDocumentationFolder.add(filesInDocumentationFolder[x].getName().substring(0, i));
    				  }			  
    			  }
    			}
    		try {
    			FileReader fr = new FileReader(fileMediawikiTxt);
    			BufferedReader br = new BufferedReader(fr);
    			
    			while((fileName = br.readLine()) != null){
    					for(String item:nameOfFilesInDocumentationFolder){
        					if(item.equals(fileName)){
        						mediawikiFileCorrectlyCreated = true;
        						break;
        					}
        					else{
        						mediawikiFileCorrectlyCreated = false;
        					}
        				}    				  				
    				if(!mediawikiFileCorrectlyCreated){
    					break;
    				}
    			}    			
    			br.close();
    			fr.close();
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	 
    	assertTrue(mediawikiFileCorrectlyCreated);
    }
    @Test
   	public void testGenerateHelp() {
    	System.out.println("testGenerateHelp");
    	int i;
		String ext, fileName;
		boolean generateHelpIsOk = false;
    	boolean mediawikiExists = false, htmlExists = false, xmlExists = false;
    	//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "generate-help");
    	File folderDocumentation = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation");
    	File fileMediawikiTxt = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation"+'\\'+"mediawiki_files.txt");
    	File[] filesInDocumentationFolder = folderDocumentation.listFiles();    	
    	
    	//Test if .html, .mediawiki and .xml files exist for file names in mediawiki_files.txt
		try {
			FileReader fr = new FileReader(fileMediawikiTxt);
			BufferedReader br = new BufferedReader(fr);
			
			while((fileName = br.readLine()) != null){
				
					for (int x=0;x<filesInDocumentationFolder.length;x++){
						  i = filesInDocumentationFolder[x].getName().lastIndexOf('.');
						  if(i>0 && i<filesInDocumentationFolder[x].getName().length()-1){
							  ext = filesInDocumentationFolder[x].getName().substring(i+1, filesInDocumentationFolder[x].getName().length());
							  if(filesInDocumentationFolder[x].getName().substring(0, i).equals(fileName)){
								  if(ext.equals("mediawiki")){
									  mediawikiExists = true;
								  }else if(ext.equals("html")){
									  htmlExists = true;
								  }
							  }else if(filesInDocumentationFolder[x].getName().substring(0, i).equals(fileName + "-toc")){
								  if(ext.equals("xml")){
									  xmlExists = true;
								  }
							  }
						  }
						}
					if(mediawikiExists && htmlExists && xmlExists){
						generateHelpIsOk = true;
						mediawikiExists = false;
						htmlExists = false;
						xmlExists = false;
					}
					else{
						System.out.println("It is not ok");
						generateHelpIsOk = false;
						break;						
					}
				  	
			}    			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(generateHelpIsOk);
    }
    
    @Test
   	public void testGenerateFo() {
    	System.out.println("testGenerateFo");
    	int i;
    	boolean generateFoIsOk = false, generateOpenETCSToolchainMediawikiIsOk = false; 
    	
    	//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "generate-fo");
    	File folderDocumentation = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation");
    	File[] filesInDocumentationFolder = folderDocumentation.listFiles();
    	
    	//Test if OpenETCS Toolchain.fo and OpenETCS Toolchain.mediawiki files have been created
    	for (int x=0;x<filesInDocumentationFolder.length;x++){
			  i = filesInDocumentationFolder[x].getName().lastIndexOf('.');
			  if(i>0 && i<filesInDocumentationFolder[x].getName().length()-1){
				  if(filesInDocumentationFolder[x].getName().equals("OpenETCS Toolchain.mediawiki")){
					  generateOpenETCSToolchainMediawikiIsOk = true;
				  }
				  if(filesInDocumentationFolder[x].getName().equals("OpenETCS Toolchain.fo")){
					  generateFoIsOk = true;
				  }
			  }
			}
    	assertTrue(generateOpenETCSToolchainMediawikiIsOk && generateFoIsOk);
    }	
    
    @Test
   	public void testGenerateOpenETCSPDF() {
    	System.out.println("testGenerateOpenETCSPDF");
    	int i;
    	boolean generateOpenETCSPDFIsOk = false;
    	//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "generate-pdf");
    	File folderDocumentation = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\' +"bin"+'\\'+"documentation");
    	File[] filesInDocumentationFolder = folderDocumentation.listFiles();
    	
    	//Test if OpenETCS Toolchain.pdf file has been created
    	for (int x=0;x<filesInDocumentationFolder.length;x++){
    		i = filesInDocumentationFolder[x].getName().lastIndexOf('.');
    		if(i>0 && i<filesInDocumentationFolder[x].getName().length()-1){
    			if(filesInDocumentationFolder[x].getName().equals("OpenETCS Toolchain.pdf")){
    				generateOpenETCSPDFIsOk = true;
    			}
    		}
    	}
    	
    	assertTrue(generateOpenETCSPDFIsOk);
    }
    
    @Test
   	public void testGenerateTocDinamically() {
    	System.out.println("testGenerateTocDinamically");
    	int i;
    	boolean generatePluginXmlIsOk = false, generateTocXmlIsOk = false;
    	//executeAntTask(rootDir + '\\' + "org.openetcs.documentation2" + '\\' + "build2.xml", "generate-toc");
    	File rootFolder = new File(rootDir + '\\' + "org.openetcs.documentation" + '\\');
    	File[] filesInRootFolder = rootFolder.listFiles();    	
    	
    	//Test if plugin.xml and toc.xml files have been created
    	for (int x=0;x<filesInRootFolder.length;x++){
    		i = filesInRootFolder[x].getName().lastIndexOf('.');
    		if(i>0 && i<filesInRootFolder[x].getName().length()-1){
    			if(filesInRootFolder[x].getName().equals("plugin.xml")){
    				generatePluginXmlIsOk = true;
    			}
    			if(filesInRootFolder[x].getName().equals("toc.xml")){
    				generateTocXmlIsOk = true;
    			}
    		}
    	}
    	
    	assertTrue(generatePluginXmlIsOk && generateTocXmlIsOk);
    } 
}
