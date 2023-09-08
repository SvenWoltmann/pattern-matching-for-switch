package eu.happycoders.java21.patternmatching;

public class Example33_DominanceChecks2 {

  static void print(Object o) {
    switch (o) {
      case String s -> System.out.print("a string: " + s);
      case String s when s.length() > 5 -> System.out.print("a long string: " + s); // Not allowed
      default -> System.out.print("something else");
    }
  }

}
