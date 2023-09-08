package eu.happycoders.java21.patternmatching;

public class Example32_DominanceChecks1 {

  static void print(Object o) {
    switch (o) {
      case Number n -> System.out.print("a number: " + n);
      case Integer i -> System.out.print("an integer: " + i); // Not allowed
      default -> System.out.print("something else");
    }
  }

}
