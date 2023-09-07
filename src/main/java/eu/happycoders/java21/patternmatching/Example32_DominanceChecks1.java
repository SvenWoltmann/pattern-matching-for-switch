package eu.happycoders.java21.patternmatching;

public class Example32_DominanceChecks1 {

  static void print(Object o) {
    switch (o) {
      case Number n -> System.out.println("a number: " + n);
      case Integer i -> System.out.println("an integer: " + i); // Not allowed
      default -> System.out.println("something else");
    }
  }

}
