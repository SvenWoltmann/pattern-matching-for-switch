package eu.happycoders.java21.patternmatching;

public class Example31_ExhaustiveWithUnconditionalPattern {

  public static void main(String[] args) {
    printLength("Hello world!");
    printLength("x");
  }

  static void printLength(String string) {
    switch (string) {
      case String s when s.length() < 5 -> System.out.print("short");
      case String s when s.length() == 5 -> System.out.print("medium");
      case String s when s.length() > 5 -> System.out.print("long");
      case String s -> {}
    }
  }

}
