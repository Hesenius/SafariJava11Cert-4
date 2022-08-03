package substitution;

class Q24Base {
  public int get() {
    return 0;
  }

  public CharSequence getValue() {
    return "";
  }
}

class Q24Sub extends Q24Base {
//  public long get() { return 1; }
//  public short get() { return 1; }
//  public Q24Base get() { return null; }


//  public int getValue(int x) {return 1;}
//  public CharSequence getValue() {return "Hello";}
  public String getValue() {return "Hello";}
//  public String getValue(int x) {return "Hello";}
}

public class Ex1 {
  public static void main(String[] args) {
    Q24Base qb = null;
    int x = qb.get();

    CharSequence cs = qb.getValue();
  }
}
