package annotations;

//@RunMe
public class UnitUnderTest {
//  @RunMe
  private String name = "Odd";

//  @RunMe(value=99)
  @RunMe(99)
  public void test1() {
    System.out.println("Test1");
  }

//  NOPE!!!! @RunMe(2, name="Bert")
  @RunMe(/*expected = RuntimeException.class, */value=2, name="Bert")
  private void test2() {
    System.out.println("Test2");
  }

  public void test3() {
    System.out.println("Test 3");
  }

  @Override
  public String toString() {
    return "UnitUnderTest{" +
        "name='" + name + '\'' +
        '}';
  }
}
