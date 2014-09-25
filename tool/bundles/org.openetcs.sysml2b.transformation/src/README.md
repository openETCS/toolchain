#SysMLtoB: translator from SysML to Classical B

*Software architecture & development*: Thomas Bardot

*Architecture & design*: David Mentré

##Tool presentation
The tool consists in an Acceleo project. Its aim is to automatically translate the architecture of a SysML model to a B software. The behavior of the SysML model is not translated.

###Input
The tool takes as input a SysML model made with Papyrus which is compliant with some several modeling rules. 
For example, all flow ports shall have "in" or "out" direction, shall be typed with a primitive type, a data type or an enumeration. All the flow ports shall be linked to a previous flow port (flow port with "in" direction), or with one or several next flow port(s) (flow port with "out" direction). Also,  an initial value shall be defined for each flow port.
Only the blocks, parts, flow ports, block properties and constraints, instance specifications (with slots), data types, enumerations and primitive types are translated in B code.

###Outputs
The tool produces as outputs several B modules which each correspond to an instance of a block. Two exceptions : a root module is created at the top level of the hierarchical tree and  a "DefTypes" module which contains the definition of the model enumerations is created. Def_Types is the only one module that is seen by the implementation of the other modules.

## Example
A simple SysML model which is compatible with the translator tool is provided. It is called CoffeeMachine and represents, obviously, a very simple architecture of a coffee machine's software.
Follow these steps in order to translate the SysML model of CoffeeMachine into a B model:

1. Install Acceleo: in the OpenETCS toolchain or in an Eclipse Kepler platform, go to Help/Install New Software and type this URL:  [http://download.eclipse.org/releases/kepler/]. Then go to "modeling", select Acceleo 3.4.2, click Next and install it.
2.  After having imported the Acceleo "SysMLTransform" project and the Papyrus "CoffeeMachine" project, Right click on SysMLTransform/src/SysMLTransform.common.main/m_MainSysMLTransform.mtl. Select Run As -> Run Configurations. 
3. Create a new Acceleo Application. The project is *SysMLTransform*, the Main class is * SysMLTransform.common.main.M_MainSysMLTransform*, the Model is * /Test_SImpleCoffeeMachineModel/model.uml*. As target, select the folder in which you want to generate the B files. It is recommended to use the folder */Test_SImpleCoffeeMachineModel/B code* where five B implementation files are present. These files where manually modified in order to define a simple behavior for the coffee machine example. The translator tool will not overwrite these files.
4. Run this Acceleo Application. Thirteen files have to be generated. 

Now you can import these B files into a B software project in the *Atelier B* tool. You can download a free version of *Atelier B* here: [http://www.atelierb.eu/telecharger-latelier-b/].

