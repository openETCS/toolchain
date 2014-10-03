package org.openetcs.sysml.report;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlGenerator {
  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html><body>");
    _builder.newLine();
    _builder.append("<h1>Report for ");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<table border=1>");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<th>Name</td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<th>Location</td>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<th>Comment</td>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    {
      EList<Element> _allOwnedElements = model.allOwnedElements();
      for(final Element e : _allOwnedElements) {
        {
          if ((e instanceof PrimitiveType)) {
            final PrimitiveType ne = ((PrimitiveType) e);
            _builder.newLineIfNotEmpty();
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<td>");
            String _name_1 = ne.getName();
            _builder.append(_name_1, "	");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("<td>");
            String _qualifiefdLocation = this.qualifiefdLocation(ne);
            _builder.append(_qualifiefdLocation, "	");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("<td>TODO</td>");
            _builder.newLine();
            _builder.append("</tr>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</body></html>");
    _builder.newLine();
    return _builder;
  }
  
  public String qualifiefdLocation(final PrimitiveType type) {
    final String location = type.getQualifiedName();
    int _lastIndexOf = location.lastIndexOf("::");
    final String newlocation = location.substring(0, _lastIndexOf);
    return newlocation;
  }
}
