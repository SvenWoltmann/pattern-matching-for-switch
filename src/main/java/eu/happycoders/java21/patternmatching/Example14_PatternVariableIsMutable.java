package eu.happycoders.java21.patternmatching;

public class Example14_PatternVariableIsMutable {

  public static void main(String[] args) {
    print("Hello world");
  }

  static void print(Object o) {
    switch (o) {
      case String s -> {
        s = "A different string now";
        System.out.println(s);
      }
      default -> System.out.println("Something else");
    }
  }

}
