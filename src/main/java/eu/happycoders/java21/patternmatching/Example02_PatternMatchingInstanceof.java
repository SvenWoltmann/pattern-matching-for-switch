package eu.happycoders.java21.patternmatching;

public class Example02_PatternMatchingInstanceof {

  public static void main(String[] args) {
    print("The quick brown fox jumps over the lazy dog");
    print("Hello!");
    print(47);
    print(new Object());
  }

  static void print(Object o) {
    if (o instanceof String s && s.length() > 10) {
      System.out.printf("A long string: %s...%n", s.substring(0, 10));
    } else if (o instanceof String s) {
      System.out.println("A not so long string: " + s);
    } else if (o instanceof Integer i) {
      System.out.println("An integer whose square is: " + i * i);
    }
  }
}
