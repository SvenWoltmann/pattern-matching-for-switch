package eu.happycoders.java21.patternmatching;

public class Example12_PatternVariableShadowingOuterScopeVariable {

  void print(Object o) {
    String s = "Hello";
    switch (o) {
      case String s -> System.out.println("A string: " + s); // Not allowed
      default -> System.out.println("Something else");
    }
  }

}
