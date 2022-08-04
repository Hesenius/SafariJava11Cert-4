package lambastuff;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


interface Selector {
  boolean test(String s);
}

class LongString implements Selector {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

class ShortString implements Selector {
  @Override
  public boolean test(String s) {
    return s.length() <= 3;
  }
}

public class Intro {

  public static List<String> getBySelector(List<String> in, Selector sel) {
    List<String> results = new ArrayList<>();
    for (String s : in) {
      if (sel.test(s)) {
        results.add(s);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");

    System.out.println(getBySelector(names, new LongString()));
    System.out.println("------------");
    System.out.println(getBySelector(names, new ShortString()));

    System.out.println("------------");
    System.out.println(getBySelector(names, new Selector() {
      @Override
      public boolean test(String s) {
        return s.length() > 3;
      }
    }));

    System.out.println("------------");
    // IF the "context" demands an interface
    // (compiler knows that we need an *object* that implements that interface
    // interface MUST declare EXACTLY ONE abstract method
    // AND that must be the only method we want to define
//
//    System.out.println(getBySelector(names,/* new Selector() {
//      @Override
//      public boolean test*/(String s) -> {
//        return s.length() > 3;
//      }
//    /*}*/));

    System.out.println(getBySelector(names, (String s) -> {
        return s.length() > 3;
      } ));

    Selector ss;
//    ss = (String s) -> {
//    ss = (@NotNull var s) -> {
//    ss = (var s) -> {
//    ss = (s) -> {
//    ss = s -> {
//      return s.length() > 3;
//    } ;
    ss = s -> s.length() > 3  ;
  }
}
