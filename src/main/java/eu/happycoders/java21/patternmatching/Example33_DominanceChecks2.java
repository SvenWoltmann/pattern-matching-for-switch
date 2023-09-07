package eu.happycoders.java21.patternmatching;

public class Example33_DominanceChecks2 {

  static void print(Object o) {
    switch (o) {
      case String s -> System.out.println("a string: " + s);
      case String s when s.length() > 5 -> System.out.println("a long string: " + s); // Not allowed
      default -> System.out.println("something else");
    }
  }

}
