package eu.happycoders.java21.patternmatching;

public class Example13_PatternVariableShadowingField {

  static String s = "Hello";

  public static void main(String[] args) {
    println("Hello world");
    println(1701);
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Object o) {
    print(o);
    System.out.println();
  }

  static void print(Object o) {
    switch (o) {
      case String s -> System.out.print(s);
      case null, default -> System.out.print(s);
    }
  }

}
