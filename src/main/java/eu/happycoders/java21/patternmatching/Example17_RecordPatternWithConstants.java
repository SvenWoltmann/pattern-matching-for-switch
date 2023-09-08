package eu.happycoders.java21.patternmatching;

public class Example17_RecordPatternWithConstants {

  record Point(int x, int y) {}

  static void print(Point p) {
    switch (p) {
      case Point(0, int y) -> System.out.print("x-axis"); // Not allowed
      case Point(int x, 0) -> System.out.print("y-axis"); // Not allowed
      case Point(int x, int y) -> System.out.print("somewhere else");
    }
  }

}
