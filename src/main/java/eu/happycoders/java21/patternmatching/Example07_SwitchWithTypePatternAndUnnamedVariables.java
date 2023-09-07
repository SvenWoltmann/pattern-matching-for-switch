package eu.happycoders.java21.patternmatching;

// Contains a preview feature (unnamed variables), run as follows:
// javac --enable-preview -source 21 Example07_SwitchWithTypePatternAndUnnamedVariables.java

public class Example07_SwitchWithTypePatternAndUnnamedVariables {

  public static void main(String[] args) {
    print(47);
    print(3.14f);
    print(2.71828d);
    print((byte) 100);
  }

  static void print(Number n) {
    switch (n) {
      case Integer _ -> System.out.println("It's an Integer.");
      case Float _ -> System.out.println("It's a Float.");
      case Double _ -> System.out.println("It's a Double.");
      default -> System.out.println("It's some other number.");
    }
  }

}
