package initializations;

class Q25Base {

  // IF zero coded constructors???
  // compiler generates the "default" constructor
  // - zero args (unless this is an instance inner class)
  // - accessibility of the enclosing class (unless it's an enum->private)
  // - "looks like an empty body"
  Q25Base() {
    // if a constructor does not START WITH either this(...) or super(...)
    // then the compiler makes it start with super() [specifically zero args!]
    // super(); // Object
    // run instance init!
    //...
  }

  Q25Base(int x) {}

  int x = 99; // initialized instance variable
  { System.out.println("x is " + x); } // instance initializer

  void doStuff() {}

  int y; // initializations require an EXPRESSION
  // instance initializers can have exception handling, loops, conditions
  // etc.
  { y = x + 10; }

}
class Q25Sub extends Q25Base {
  /*static */int aValue = 10;
  Q25Sub(int x) {
    super(/*this.aValue -- NOPE!!! */);
    // instance initialization
    System.out.println("in constructor, x is " + x);
  }

  Q25Sub() {
    this(90, 9); // delegate "sideways" to another overloaded constructor
    // do not perform instance init...
  }

  Q25Sub(int x, int y) {
    this(/*aValue + y NOPE!*/99);
    // carry on ...
  }
   public static void go() { new Q25Sub(1); }
}

public class Ex1 {
  public static void main(String[] args) {
    Q25Sub.go();
  }
}
