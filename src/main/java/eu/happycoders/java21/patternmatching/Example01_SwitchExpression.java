package eu.happycoders.java21.patternmatching;

public class Example01_SwitchExpression {

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      System.out.printf("f(%d) = %d%n", i, fibonacci(i));
    }
  }

  static int fibonacci(int i) {
    return switch (i) {
      case 0, 1 -> i;
      default -> fibonacci(i - 1) + fibonacci(i - 2);
    };
  }
}
