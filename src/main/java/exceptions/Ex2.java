package exceptions;

class AC implements AutoCloseable {
  private String name;

  public AC(String name) {
    this.name = name;
  }

  @Override
  public void close() {
    System.out.print("Closing " + name);
  }
}

public class Ex2 {
  public static void main(String[] args) {

    var ac0 = new AC("zero");
    try (var ac1 = new AC("one");
         var ac2 = new AC("two");
         ac0;) { // new with Java 9
//      ac1 = null;
    }
//    ac0 = null;
  }
}
