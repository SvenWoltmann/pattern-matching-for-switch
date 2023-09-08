package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example21_RecordPatternWithNestedTypePattern.Path;

public class Example23_RecordPatternWithNestedRecordPatternOnlyFrom {

  interface Point {}

  record Point2D(int x, int y) implements Point {}

  record Point3D(int x, int y, int z) implements Point {}

  record Path<T extends Point>(T from, T to) {}

  public static void main(String[] args) {
    println(new Path<>(new Point2D(3, 4), new Point2D(1, 5)));
    println(new Path<>(new Point3D(7, 1, 4), new Point3D(5, 10, 2)));
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Path<?> p) {
    print(p);
    System.out.println();
  }

  static void print(Path<?> p) {
    switch (p) {
      case Path(Point2D(int x1, int y1), var to) ->
          System.out.printf("from: (%d, %d)", x1, y1);

      case Path(Point3D(int x1, int y1, int z1), var to) ->
          System.out.printf("from: (%d, %d, %d)", x1, y1, z1);

      default -> throw new IllegalArgumentException();
    }
  }

}
