package eu.happycoders.java21.patternmatching;

public class Example09c_CaseNullDefault {

  public static void main(String[] args) {
    System.out.println(describe("The quick brown fox jumps over the lazy dog"));
    System.out.println(describe("Hello!"));
    System.out.println(describe(47));
    System.out.println(describe(new Object()));
    System.out.println(describe(null));
  }

  static String describe(Object o) {
    return switch (o) {
      case String s when s.length() > 10 -> "A long string: %s...".formatted(s.substring(0, 10));
      case String s -> "A not so long string: " + s;
      case Integer i -> "An integer whose square is: " + i * i;
      case null, default -> "Something else";
    };
  }

}
