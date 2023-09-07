package eu.happycoders.java21.patternmatching;

public class Example35_DominanceChecks4 {

  public static void main(String[] args) {
    print("Hello");
    print("foo");
    print("fizzbuzz");
  }

  static void print(String string) {
    switch (string) {
      case "Hello" -> System.out.println("Hello back");
      case String s when s.length() > 5 -> System.out.println("long: " + s);
      case String s -> System.out.println("not so long: " + s);
    }
  }

}
