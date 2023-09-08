package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example18_RecordPatternWithGuards.Point;

public class Example19_NestedRecordPattern {

  record Point(int x, int y) {}

  record Path(Point from, Point to) {}

  public static void main(String[] args) {
    println(new Point(2, 3));
    println(new Path(new Point(3, 4), new Point(1, 5)));
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Example18_RecordPatternWithGuards.Point p) {
    print(p);
    System.out.println();
  }

  static void print(Object o) {
    switch (o) {
      case Point(int x, int y) -> System.out.printf("point: (%d, %d)", x, y);
      case Path(Point(int x1, int y1), Point(int x2, int y2)) ->
          System.out.printf("path: (%d, %d) -> (%d, %d)", x1, y1, x2, y2);
      default -> {}
    }
  }

}
