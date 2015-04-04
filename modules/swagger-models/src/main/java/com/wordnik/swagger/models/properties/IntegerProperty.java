package com.wordnik.swagger.models.properties;

import com.wordnik.swagger.models.Xml;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class IntegerProperty extends AbstractNumericProperty implements Property {
  protected Integer _default;

  public IntegerProperty() {
    super.type = "integer";
    super.format = "int32";
  }
  public IntegerProperty xml(Xml xml) {
    this.setXml(xml);
    return this;
  }

  public IntegerProperty example(Integer example) {
    this.setExample(String.valueOf(example));
    return this;
  }

  public IntegerProperty _default(String _default) {
    if(_default != null) {
      try {
        this._default = Integer.parseInt(_default);
      }
      catch (NumberFormatException e) {
        // continue;
      }
    }
    return this;
  }

  public static boolean isType(String type, String format) {
    if("integer".equals(type) && "int32".equals(format))
      return true;
    else return false;
  }

  public Integer getDefault() {
    return _default;
  }
  public void setDefault(Integer _default) {
    this._default = _default;
  }
  @JsonIgnore
  public void setDefault(String _default) {
    this._default(_default);
  }
}