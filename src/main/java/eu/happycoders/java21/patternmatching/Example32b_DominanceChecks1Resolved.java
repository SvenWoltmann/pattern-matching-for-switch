package eu.happycoders.java21.patternmatching;

public class Example32b_DominanceChecks1Resolved {

  static void print(Object o) {
    switch (o) {
      case Integer i -> System.out.print("an integer: " + i);
      case Number n -> System.out.print("a number: " + n);
      default -> System.out.print("something else");
    }
  }

}
