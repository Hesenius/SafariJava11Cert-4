package vars;

// BAD!
//class var {}
public class UsingVar {
  void doMoreStuff() {
    // "keywords" cannot be used as identifiers
//    int goto = 99;
    var var = 99; // context sensitive "something"
    // var is a "pseudo-type"
  }
  // var is not permitted for fields
//  var x = 99;
  void doStuff() {
    // limited scope, in a method
    var x = 99; // x is DEFINITELY INT
    // NOT DYNAMIC TYPING, but "type inferencing"
    // MUST BE INITIALIZED
//    x = "Hello";
    System.out.println(x);
    long y = 3_000_000_000L;
  }
//  void doOtherStuff() {
//    System.out.println(x); // what is x
//  }

  void doMoreStuff(int [] vals){}
  void useMoreStuff() {
    int [] v = {};
    doMoreStuff(v);
//    doMoreStuff({}); // nope!
    doMoreStuff(new int []{}); // good
  }
}
