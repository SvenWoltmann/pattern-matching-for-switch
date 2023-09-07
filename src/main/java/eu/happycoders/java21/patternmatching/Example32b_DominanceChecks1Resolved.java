package eu.happycoders.java21.patternmatching;

public class Example32b_DominanceChecks1Resolved {

  static void print(Object o) {
    switch (o) {
      case Integer i -> System.out.println("an integer: " + i);
      case Number n -> System.out.println("a number: " + n);
      default -> System.out.println("something else");
    }
  }

}
