/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public final class ImageStyle {
  public final static ImageStyle Default = new ImageStyle("Default", AdaptiveCardObjectModelJNI.ImageStyle_Default_get());
  public final static ImageStyle Person = new ImageStyle("Person");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImageStyle swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImageStyle.class + " with value " + swigValue);
  }

  private ImageStyle(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImageStyle(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImageStyle(String swigName, ImageStyle swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImageStyle[] swigValues = { Default, Person };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

