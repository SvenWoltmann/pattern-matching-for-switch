package eu.happycoders.java21.patternmatching;

public class Example08_SwitchWithGuardedTypePattern {

  public static void main(String[] args) {
    print("The quick brown fox jumps over the lazy dog");
    print("Hello!");
    print(47);
    print(new Object());
    print(null);
  }

  static void print(Object o) {
    switch (o) {
      case String s when s.length() > 10 ->
          System.out.println("A long string: " + s.substring(0, 10) + "...");
      case String s -> System.out.println("A not so long string: " + s);
      case Integer i -> System.out.println("An integer whose square is: " + i * i);
      default -> System.out.println("Something else");
    }
  }

}
