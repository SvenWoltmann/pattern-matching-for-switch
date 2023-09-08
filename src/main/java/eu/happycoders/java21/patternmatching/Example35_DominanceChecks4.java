package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example22_RecordPatternWithNestedRecordPattern.Path;

public class Example35_DominanceChecks4 {

  public static void main(String[] args) {
    println("Hello");
    println("foo");
    println("fizzbuzz");
  }

  static void println(String string) {
    print(string);
    System.out.println();
  }

  static void print(String string) {
    switch (string) {
      case "Hello" -> System.out.print("Hello back");
      case String s when s.length() > 5 -> System.out.print("long: " + s);
      case String s -> System.out.print("not so long: " + s);
    }
  }

}
