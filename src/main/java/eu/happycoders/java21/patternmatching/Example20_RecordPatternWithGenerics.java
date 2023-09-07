package eu.happycoders.java21.patternmatching;

public class Example20_RecordPatternWithGenerics {

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
      case Path(Point from, Point to)
          when from instanceof Point2D from2D && to instanceof Point2D to2D ->
          System.out.printf("path: (%d, %d) -> (%d, %d)%n",
              from2D.x(), from2D.y(), to2D.x(), to2D.y());

      case Path(Point from, Point to)
          when from instanceof Point3D from3D && to instanceof Point3D to3D ->
          System.out.printf("path: (%d, %d, %d) -> (%d, %d, %d)%n",
              from3D.x(), from3D.y(), from3D.z(), to3D.x(), to3D.y(), to3D.z());

      default -> throw new IllegalArgumentException();
    }
  }

}
