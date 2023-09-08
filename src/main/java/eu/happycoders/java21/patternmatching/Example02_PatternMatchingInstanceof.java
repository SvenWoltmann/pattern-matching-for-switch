package eu.happycoders.java21.patternmatching;

import org.w3c.dom.ls.LSOutput;

public class Example02_PatternMatchingInstanceof {

  public static void main(String[] args) {
    println("The quick brown fox jumps over the lazy dog");
    println("Hello!");
    println(47);
    println(new Object());
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Object o) {
    print(o);
    System.out.println();
  }

  static void print(Object o) {
    if (o instanceof String s && s.length() > 10) {
      System.out.printf("A long string: %s...", s.substring(0, 10));
    } else if (o instanceof String s) {
      System.out.print("A not so long string: " + s);
    } else if (o instanceof Integer i) {
      System.out.print("An integer whose square is: " + i * i);
    }
  }
}
