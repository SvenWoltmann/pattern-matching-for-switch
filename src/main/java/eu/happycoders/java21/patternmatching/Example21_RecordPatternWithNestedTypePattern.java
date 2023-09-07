package eu.happycoders.java21.patternmatching;

public class Example21_RecordPatternWithNestedTypePattern {

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
      case Path(Point2D from, Point2D to) -> System.out.printf("path: (%d, %d) -> (%d, %d)%n",
          from.x(), from.y(), to.x(), to.y());

      case Path(Point3D from, Point3D to) ->
          System.out.printf("path: (%d, %d, %d) -> (%d, %d, %d)%n",
              from.x(), from.y(), from.z(), to.x(), to.y(), to.z());

      default -> throw new IllegalArgumentException();
    }
  }

}
