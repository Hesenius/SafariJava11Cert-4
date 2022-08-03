package innerstuff;


public class Ex1 {
  int x = 10;
  int y = 0;
//  static class NestedStat {
//
//  }

  class Nested {
    int x = 20;
    public Nested() {
//    public Nested(Ex1 Ex1.this) {
//    public Nested(@NotNull Ex1 Ex1.this) {

    }

    public void showX() {
      System.out.println(x);
      System.out.println(Ex1.this.x);
      System.out.println(Ex1.this.y);
    }
  }
  public static void main(String[] args) {
    Ex1 outer = new Ex1();
//    Ex1.Nested inner = outer.new Nested(); // create a nested "tied to" outer
    Ex1.Nested inner = new Ex1().new Nested();

    // in scope of Ex1, can elide that part!

//    Nested inner = outer.new Nested(); // create a nested "tied to" outer
//    NestedStat nested = new NestedStat();
//    NestedStat nested = new NestedStat();
  }
}
