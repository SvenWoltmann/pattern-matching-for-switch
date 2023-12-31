package eu.happycoders.java21.patternmatching;

public class Example34_DominanceChecks3 {

  static void print(String string) {
    switch (string) {
      case String s when s.length() > 5 -> System.out.print("long: " + s);
      case String s when s.length() > 10 -> System.out.print("very long: " + s);
      default -> System.out.print("short");
    }
  }

}
