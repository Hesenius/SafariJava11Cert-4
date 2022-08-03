package overloads;

//  static void doStuff(int x, double y) {}        // Method B

public class Ex1 {
//  static void doStuff(int x, int y) {}         // Method A
//static void doStuff(long x, int y) {}        // Method C
//  static void doStuff(int x, long y) {}        // Method B
  static void doStuff(int ... x) {}            // Method D
//  static void doStuff(Integer x, Integer y) {} // Method E
  static void doStuff(Long x, Integer y) {} // Method E
  static void doStuff(Number x, Integer y) {} // Method E
//  static void doStuff(Integer x, Number y) {} // Method E

  public static void main(String[] args) {
    doStuff(1L, 2);

//    Long i = 1;
    Object i = 1;
  }
}
