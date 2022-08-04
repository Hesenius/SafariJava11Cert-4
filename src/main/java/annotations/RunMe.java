package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD/*, ElementType.CONSTRUCTOR*/})
@Target(ElementType.METHOD)
//public @ interface RunMe {
public @interface RunMe {
  String name = "Weird"; // public static final by default
  String name() default "Unknown";
  int value();
  // primitives (but NOT wrappers)
  // String
  // Enums
  // Class
  // Annotations -- but must not be circular!!!
  // arrays of the above (note NOT arrays of arrays!!!)
  // NOPE, not StringBuilder.
//  StringBuilder name2();
}
