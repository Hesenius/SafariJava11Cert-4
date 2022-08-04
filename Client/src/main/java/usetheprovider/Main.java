package usetheprovider;

//import localstuff.BreakTheRules;

import utils.ProvideData;

import java.lang.reflect.Field;

public class Main {
//  public static String getSecretMessage() {
//    return localstuff.MyDefaultData.secretmessage;
//  }
  public static void main(String[] args) throws Throwable {
    System.out.println("Main starting");
    System.out.println("Message is: " + utils.ProvideData.message);
//    System.out.println(BreakTheRules.getSecretMessage());

    Class<?> cl = ProvideData.class;
    Field f = cl.getDeclaredField("privateMessage");
    f.setAccessible(true);
    System.out.println("Found field " + f);

    String msg = (String)(f.get(null));
    System.out.println("secret message text is " + msg);
  }
}
