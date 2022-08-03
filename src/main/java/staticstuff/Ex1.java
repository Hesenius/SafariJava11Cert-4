package staticstuff;

public class Ex1 {
  private static int s1 = 10;
  private int s2 = 20;

//  public void showIt() {
  public void showIt(Ex1 this) {
    // explicit receiver param permits annotation of "this"
//  public void showIt(@NotNull Ex1 this) {
    System.out.println(s2);
    System.out.println(this.s2);
    System.out.println(s1);
    System.out.println(Ex1.s1);
  }
  public static void showItSt(Ex1 it) {
//    System.out.println(s2);
//    System.out.println(this.s2);
    System.out.println(it.s2);
    System.out.println(s1);
    System.out.println(Ex1.s1);
  }
}
