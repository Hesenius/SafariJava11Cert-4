package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestHarness {
  public static void main(String[] args) throws Throwable {
    String classToTest = "annotations.UnitUnderTest";

    Class<?> cl = Class.forName(classToTest);

    System.out.println("Class loaded: " + cl.getName());
    Method[] methods = cl.getDeclaredMethods();
    Constructor<?> cons = cl.getConstructor();
    Object obj = cons.newInstance();
    System.out.println("object is: " + obj);
    for (Method m : methods) {
      System.out.println("> " + m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("**** RUNME found, name = " + annot.name()
        + ", value = " + annot.value());
        m.setAccessible(true);
        m.invoke(obj);
      }
    }
  }
}
