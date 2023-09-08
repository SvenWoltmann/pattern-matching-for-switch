package eu.happycoders.java21.patternmatching;

public class Example12_PatternVariableShadowingOuterScopeVariable {

  void print(Object o) {
    String s = "Hello";
    switch (o) {
      case String s -> System.out.print("A string: " + s); // Not allowed
      default -> System.out.print("Something else");
    }
  }

}
