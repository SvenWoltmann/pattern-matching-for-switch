package eu.happycoders.java21.patternmatching;

public class Example30_ExhaustivenessNotRecognized {

  public static void main(String[] args) {
    printLength("Hello world!");
  }

  static void printLength(String string) {
    switch (string) { // Not allowed: default branch missing
      case String s when s.length() < 5 -> System.out.print("short");
      case String s when s.length() == 5 -> System.out.print("medium");
      case String s when s.length() > 5 -> System.out.print("long");
    }
  }

}
