package eu.happycoders.java21.patternmatching;

public class Example10_PatternVariableScope {

  void foo(Object o) {
    switch (o) {
      case String s -> {
        int i = Integer.parseInt(s);
        int temp = 0;
        // ...
      }
      case Integer i -> {
        String s = String.valueOf(i);
        int temp = 0;
        // ...
      }
      default -> {}
    }
  }

}
