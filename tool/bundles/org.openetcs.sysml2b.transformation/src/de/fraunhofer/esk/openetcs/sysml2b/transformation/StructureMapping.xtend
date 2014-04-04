package de.fraunhofer.esk.openetcs.sysml2b.transformation

import org.eclipse.papyrus.sysml.blocks.Block
import org.eclipse.uml2.uml.Class
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.emf.common.util.EList
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.ParameterDirectionKind
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Comment
import org.eclipse.uml2.uml.Property

class StructureMapping {
	def createMachine(Block block, Comment comment)'''
	/* Automatically generated by SysML to B Transformator.
	 *
	 * DO NOT EDIT!
	 */
	 
	�IF comment != null�
	/*
	   �comment.body�
	   
	 */
	�ENDIF�
	MACHINE
		�block.base_Class.name�
	�block.createVariables�
	�block.createImports�
	�block.createInvariants�
	�block.createInitialization�
	�block.createOperations�
	'''
	
	def String createOperations(Block block)'''
	�IF block.hasOperations�
	
	OPERATIONS
		�FOR operation : block.base_Class.ownedOperations�
		�IF operation.hasOutParameter��FOR par : operation.ownedOutParameters SEPARATOR ', '��par.name��ENDFOR� <-- �ENDIF��operation.name��IF operation.hasInParameter� (�FOR par : operation.ownedInParameters SEPARATOR ', '��par.name��ENDFOR�)�ENDIF� =
		�IF operation.hasParameter�
		PRE
			�FOR par : operation.ownedParameters SEPARATOR ' & '�
			�par.name� : �par.type.name�
			�ENDFOR�
		THEN
			skip
		END;
		
		�ELSE� 
		BEGIN
			skip
		END;
		
		�ENDIF�
	�ENDFOR�
	�ELSE�
	
	�ENDIF�
	END
	'''
	
	def String createInitialization(Block block)'''
	�IF block.hasInitialization�
	
	INITIALIZATION
		�FOR variable : block.base_Class.getValues�
		�IF variable.defaultValue instanceof InstanceValue�
		�variable.name� := �(variable.defaultValue as InstanceValue).instance.name�
		�ENDIF�
		�ENDFOR�
	�ENDIF�
	'''
	
	def String createInvariants(Block block)'''
	�IF block.hasInvariant�
	
	INVARIANT
		�FOR variable : block.base_Class.getValues SEPARATOR ' &\n'��variable.name� : �variable.type.name��ENDFOR�
	�ENDIF�
	'''
	
	def String createVariables(Block block)'''
	�IF block.hasVariables�
	
	VARIABLES
		�FOR variable : block.base_Class.getValues SEPARATOR ',\n'��variable.name��ENDFOR�
	�ENDIF�
	'''
	
	def String createImports(Block block)'''
	�IF block.hasImports�
	
	IMPORTS
		�FOR part : block.getSysMLBlocks SEPARATOR ', '��part.name�.�part.type.name��ENDFOR�
	�ENDIF�
	'''
	
	def EList<org.eclipse.uml2.uml.Property> getSysMLBlocks(Block block) {
		val newList = new BasicEList<org.eclipse.uml2.uml.Property>
		
		for (p : block.base_Class.parts) {
			if (p.isSysMLBlock) {
				newList.add(p)
			}
		}
		
		return newList
	}
	
	def boolean getIsSysMLBlock(Property property) {
		property.getAppliedStereotype("SysML::Blocks::Block") != null
	}

	def boolean hasParameter(Operation operation) {
		return !operation.ownedParameters.empty;
	}
	
	def EList<Parameter> ownedInParameters(Operation operation) {
		var values = new BasicEList<Parameter>
		
		for (Parameter par : operation.ownedParameters) {
			if (par.direction == ParameterDirectionKind.IN_LITERAL) {
				values.add(par);
			}
		}
		
		return values;
	}
	
	def EList<Parameter> ownedOutParameters(Operation operation) {
		var values = new BasicEList<Parameter>
		
		for (Parameter par : operation.ownedParameters) {
			if (par.direction == ParameterDirectionKind.OUT_LITERAL) {
				values.add(par);
			}
		}
		
		return values;		
	}
	
	def boolean hasOperations(Block block) 
	{
		return !block.base_Class.ownedOperations.empty;
	}
	
	def boolean hasInitialization(Block block)
	{
		for (org.eclipse.uml2.uml.Property p : block.base_Class.ownedAttributes) {
			if (p.defaultValue != null) {
				return true;
			}
		}
		
		return false;
	}
	
	def boolean hasInvariant(Block block)
	{
		return block.hasVariables;
	}
	
	def boolean hasImports(Block block)
	{
		return !block.sysMLBlocks.empty;
	}
	
	def boolean hasVariables(Block block)
	{
		return !block.base_Class.ownedAttributes.empty;
	}
	
	def boolean hasInParameter(Operation operation)
	{
		return !operation.ownedInParameters.empty;
	}
	
	def boolean hasOutParameter(Operation operation)
	{
		return !operation.ownedOutParameters.empty;
	}
	
	/*
	 * Returns UML Values which are properties with aggregation of 
	 * type Composite and which have no associations
	 */
	def EList<org.eclipse.uml2.uml.Property> getValues(Class cls)
	{
		var values = new BasicEList<org.eclipse.uml2.uml.Property>
		
		for (attribute : cls.ownedAttributes) {
			if (attribute.aggregation == AggregationKind.COMPOSITE_LITERAL &&
				attribute.association == null) {
				values.add(attribute)					
			}
		}
		
		return values
	}
	
}