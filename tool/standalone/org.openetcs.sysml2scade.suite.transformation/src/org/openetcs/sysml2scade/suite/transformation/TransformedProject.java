package org.openetcs.sysml2scade.suite.transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Model;

import com.esterel.scade.api.OperatorKind;
import com.esterel.scade.api.Package;
import com.esterel.scade.api.ScadeFactory;
import com.esterel.scade.api.ScadePackage;
import com.esterel.scade.api.pragmas.codegen.CodegenPragmasFactory;
import com.esterel.scade.api.pragmas.codegen.CodegenPragmasPackage;
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory;
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage;
import com.esterel.scade.api.util.ScadeModelWriter;

public class TransformedProject extends ScadeModelWriter {

	public static void fillScadeModel(Package mainModel, Model sysmlModel, URI baseURI) {
		ResourceSet resourceSet = mainModel.eResource().getResourceSet();

 		ScadeFactory         theScadeFactory         = ScadePackage.eINSTANCE.getScadeFactory();
		EditorPragmasFactory theEditorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();
		CodegenPragmasFactory theCodegenPragmasFactory = CodegenPragmasPackage.eINSTANCE.getCodegenPragmasFactory();
		
		com.esterel.scade.api.Type TypeBool = (com.esterel.scade.api.Type)findObject(mainModel, "bool", ScadePackage.Literals.TYPE);
		com.esterel.scade.api.Type TypeInt  = (com.esterel.scade.api.Type)findObject(mainModel, "int",  ScadePackage.Literals.TYPE);
		com.esterel.scade.api.Type TypeReal = (com.esterel.scade.api.Type)findObject(mainModel, "real", ScadePackage.Literals.TYPE);
		
		URI uriPackage1 = baseURI.appendSegment("Package1.xscade");
		Resource resourcePackage1 = resourceSet.createResource(uriPackage1);
		
		com.esterel.scade.api.Package Package1 = theScadeFactory.createPackage();
		Package1.setName("Package1");
		
		mainModel.getPackage().add(Package1);
		resourcePackage1.getContents().add(Package1);
		
		com.esterel.scade.api.Operator Operator1 = theScadeFactory.createOperator();
		Operator1.setName("Operator1");
		Operator1.setKind(OperatorKind.NODE_LITERAL);
		Package1.getDeclaration().add(Operator1);
		
		com.esterel.scade.api.Variable Operator1_Input1 = theScadeFactory.createVariable();
		Operator1_Input1.setName("Input1");
		com.esterel.scade.api.NamedType Operator1_Input1_Type = theScadeFactory.createNamedType();
		Operator1_Input1_Type.setType(TypeBool);
		Operator1_Input1.setType(Operator1_Input1_Type);
		Operator1.getInput().add(Operator1_Input1);
		com.esterel.scade.api.Variable Operator1_Output1 = theScadeFactory.createVariable();
		Operator1_Output1.setName("Output1");
		com.esterel.scade.api.NamedType Operator1_Output1_Type = theScadeFactory.createNamedType();
		Operator1_Output1_Type.setType(TypeBool);
		Operator1_Output1.setType(Operator1_Output1_Type);
		Operator1.getOutput().add(Operator1_Output1);
		com.esterel.scade.api.pragmas.codegen.Pragma Operator1_KCGPragma = theCodegenPragmasFactory.createPragma();
		Operator1_KCGPragma.setData("name OP1"); // The C name of Operator1 will be "OP1".
		Operator1.getPragma().add(Operator1_KCGPragma);
		
	}

}
