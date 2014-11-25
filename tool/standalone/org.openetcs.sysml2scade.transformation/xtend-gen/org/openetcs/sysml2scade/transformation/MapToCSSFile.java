package org.openetcs.sysml2scade.transformation;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MapToCSSFile {
  public static CharSequence createCSSFile(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@charset \"UTF-8\";");
    _builder.newLine();
    return _builder;
  }
}
