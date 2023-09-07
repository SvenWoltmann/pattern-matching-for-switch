package eu.happycoders.java21.patternmatching;

public class Example22_RecordPatternWithNestedRecordPattern {

  interface Point {}

  record Point2D(int x, int y) implements Point {}

  record Point3D(int x, int y, int z) implements Point {}

  record Path<T extends Point>(T from, T to) {}

  public static void main(String[] args) {
    print(new Path<>(new Point2D(3, 4), new Point2D(1, 5)));
    print(new Path<>(new Point3D(7, 1, 4), new Point3D(5, 10, 2)));
  }

  static void print(Path<?> p) {
    switch (p) {
      case Path(Point2D(int x1, int y1), Point2D(int x2, int y2)) ->
          System.out.printf("path: (%d, %d) -> (%d, %d)%n",
              x1, y1, x2, y2);

      case Path(Point3D(int x1, int y1, int z1), Point3D(int x2, int y2, int z2)) ->
          System.out.printf("path: (%d, %d, %d) -> (%d, %d, %d)%n",
              x1, y1, z1, x2, y2, z2);

      default -> throw new IllegalArgumentException();
    }
  }

}
