package controls;

import java.util.ArrayList;
import java.util.List;

enum Day {
  // public static final values of Day type
  MONDAY(0), TUESDAY;
  static int funct() {
    System.out.println("called during instance init");
    return 99;
  }
  int x = funct();
  // constructors are private by default
  // and MUST BE PRIVATE
  /*public */Day() {
    System.out.println("constructor");
  }
  Day(int x) {}
  public void doStuff() {}
}

public class Ex1 {
  public static void main(String[] args) {

    final int x = 99;
    switch (x) {
      case 100: // treated as conditional compilation
        System.out.println("never");
    }

    final boolean b = false;
    // true/false type conditions are permitted
    // to result in unreachable code
    // effectively "conditional compilation"
    if (b) {
      System.out.println("unexpected");
    }

    Day x1 = Day.MONDAY;
    // at Java 11 we can switch on
    // int (and things assignable to int)
    // String, and enum
    switch (x1) {
//      case Day.MONDAY: NOPE!!!! (really???)
      case MONDAY:
    }

    int x2 = 99;
    int x3 = 0;
    boolean b1 = true;
    outer: while (x2 > 97) {
      inner: while (x3 != 2) {
      // side-effects x++ < j--
//        if (b1) break;
//        if (b1) break inner;
//        if (b1) break outer;
//        if (b1) continue outer;

        // rest of loop body
      }
   // NO CODE HERE
    }
    // xxx
  }

  void oddStuff() {
    // can't do this with var
    // multiple variable decls of one (base) type
//    for (int i = 99, j = 100, x, ia[]=new int[]{};;) {}
    // sequence of expression-statements
    for (
        System.out.println("Hello"),
        System.out.println("Hello")
        ;;
        System.out.println("Hello"),
        System.out.println("Hello")
        ) {}

//    List<String> ls = new ArrayList<>();
////    boolean success = ls.add("Fred");
//    // expression-statement
//    ls.add("Fred");
//    int x = 99;
//    x++;
//    new ArrayList();
  }
}
