package eu.happycoders.java21.patternmatching;

public class Example30_ExhaustivenessNotRecognized {

  public static void main(String[] args) {
    printLength("Hello world!");
  }

  static void printLength(String string) {
    switch (string) {
      case String s when s.length() < 5 -> System.out.println("short");
      case String s when s.length() == 5 -> System.out.println("medium");
      case String s when s.length() > 5 -> System.out.println("long");
    }
  }

}
