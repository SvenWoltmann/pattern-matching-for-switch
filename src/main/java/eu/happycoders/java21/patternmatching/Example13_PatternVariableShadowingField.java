package eu.happycoders.java21.patternmatching;

public class Example13_PatternVariableShadowingField {

  static String s = "Hello";

  public static void main(String[] args) {
    print("Hello world");
    print(1701);
  }

  static void print(Object o) {
    switch (o) {
      case String s -> System.out.println("s = " + s);
      default -> System.out.println("s = " + s);
    }
  }

}
