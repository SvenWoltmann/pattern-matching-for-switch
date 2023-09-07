package eu.happycoders.java21.patternmatching;

public class Example06_SwitchWithTypePatternAndUnusedVariables {

  public static void main(String[] args) {
    print(47);
    print(3.14f);
    print(2.71828d);
    print((byte) 100);
  }

  static void print(Number n) {
    switch (n) {
      case Integer i -> System.out.println("It's an Integer.");
      case Float f -> System.out.println("It's a Float.");
      case Double d -> System.out.println("It's a Double.");
      default -> System.out.println("It's some other number.");
    }
  }
}
