package equality;

// this class compiled separately and contained in
// a separate jarfile
/*public*/ class X {
  // put in the "constant pool" by the CLASSLOADER
  public static String h = "Hello";
}

public class Ex1 {
  public static void main(String[] args) {
    String s1 = "Hello"; // in the "constant pool"
    String s2 = new StringBuilder("Hello").toString();
    String s3 = s2.intern();

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
    System.out.println(s1 == s3);
    System.out.println(X.h == s1);

//    String sx = "hello";
//    String sx1 = sx.toLowerCase();
//    System.out.println(sx == sx1);

    System.out.println("------------------");
    String a = "ab";
    /*final */String a1 = "a";
    final String b1 = "b";
    String b = a1 + b1;
    System.out.println(a==b);
  }
}
