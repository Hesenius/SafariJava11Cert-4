package vars;

import java.util.function.Predicate;

class X {
  {
    System.out.println(this.x);
//    System.out.println(x);
  }
  void doStuff() {
    int x = 99;
    System.out.println(this.x);
    System.out.println(x);
  }
  int x;

  void doMoreStuff() {
    int x = 99;
    Object obj = new Object() {
      int x;
      void doMoreStuff() {

      }
    };
  }
}

public class Scope {
  {
    int x = 99;
    // lambdas do NOT create a new "this"
    // and does not benefit from the special case
    // described for duplicate variables in nested classes
    // option D (fails)
//    Predicate<String> ps = x -> true;
//    Predicate<String> ps = new Predicate<String>() {
//      @Override
//      public boolean test(String x) {
//        return true;
//      }
//    };
  }

  public static void main(String[] args) {
    { int x; }
    { int x; }
  }
}
