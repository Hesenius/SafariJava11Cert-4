package exceptions;

import java.io.IOException;
import java.sql.SQLException;

class Base {
  void doBaseStuff() throws Exception {
    System.out.println("doBaseStuff");
  }
}
class Sub extends Base {
  void doBaseStuff() throws IOException {
    System.out.println("doSubStuff");
  }
}

public class Ex3 {
  public static void main(String[] args) {
    Base b = null;//new Sub();
    try {
      b.doBaseStuff();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
