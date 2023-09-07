package eu.happycoders.java21.patternmatching;

public class Example05_SwitchWithTypePattern {

  public static void main(String[] args) {
    print("The quick brown fox jumps over the lazy dog");
    print("Hello!");
    print(47);
    print(new Object());
  }

  static void print(Object o) {
    switch (o) {
      case String s -> {
        if (s.length() > 10) {
          System.out.println("A long string: " + s.substring(0, 10) + "...");
        } else {
          System.out.println("A not so long string: " + s);
        }
      }
      case Integer i -> System.out.println("An integer whose square is: " + i * i);
      default -> System.out.println("Something else");
    }
  }
}
