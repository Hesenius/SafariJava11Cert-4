package lambastuff;

interface Y {
  void doStuff3();
}
@FunctionalInterface
interface X extends Y {
//  void doStuff();
  default void doStuff2() {

  }
  static void doStuff4() {}
}

@FunctionalInterface
interface Z {
  void doStuff();
  // equals (and other object methods) don't count
  // --cannot implement with a lambda
  boolean equals(Object o);
}
public class MyFunctInter {
}
