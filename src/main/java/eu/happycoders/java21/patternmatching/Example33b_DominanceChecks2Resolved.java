package eu.happycoders.java21.patternmatching;

public class Example33b_DominanceChecks2Resolved {

  static void print(Object o) {
    switch (o) {
      case String s when s.length() > 5 -> System.out.println("a long string: " + s);
      case String s -> System.out.println("a string: " + s);
      default -> System.out.println("something else");
    }
  }

}
