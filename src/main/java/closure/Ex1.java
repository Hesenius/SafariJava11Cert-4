package closure;

import java.util.function.Predicate;

public class Ex1 {
  public void doStuff() {
    int len = 3;
//    Predicate<String> ps = new Predicate<String>() {
//      @Override
//      public boolean test(String s) {
//        return s.length() > len; // line n1
//      }
//    };
    Predicate<String> ps = (String s) -> {
        return s.length() > len; // line n1
      } ;
    // line n2
//    len++;
    StringBuilder compareTo = new StringBuilder("Hello");
    Predicate<String> ps2 =
        s -> s.length() > compareTo.length();
//    compareTo = null;
    compareTo.append(" world!");

//    Integer len2 = 3;
    int [] len2a = {3};
    Predicate<String> ps3 = (String s) -> {
//      return s.length() > len2;
      return s.length() > len2a[0];
    };
//    len2++; // len2 = len2 + 1; REASSIGNS reference len2
    len2a[0]++;
  }
}
