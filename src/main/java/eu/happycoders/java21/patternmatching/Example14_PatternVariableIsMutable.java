package eu.happycoders.java21.patternmatching;

public class Example14_PatternVariableIsMutable {

  public static void main(String[] args) {
    println("Hello world");
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
      case String s -> {
        s = "A different string now";
        System.out.print(s);
      }
      case null, default -> System.out.print("Something else");
    }
  }

}
