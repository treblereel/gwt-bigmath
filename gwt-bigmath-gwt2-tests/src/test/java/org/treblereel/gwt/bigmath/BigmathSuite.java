package org.treblereel.gwt.bigmath;

import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;

/** @author Dmitrii Tikhomirov Created by treblereel 5/6/20 */
public class BigmathSuite {

  public static Test suite() {
    GWTTestSuite suite = new GWTTestSuite("MyTest suite for all cellview classes");
    suite.addTestSuite(BigComplexMathTest.class);
    return suite;
  }
}
