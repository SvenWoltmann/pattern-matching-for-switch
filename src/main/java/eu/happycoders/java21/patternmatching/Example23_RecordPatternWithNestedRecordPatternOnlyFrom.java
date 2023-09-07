package eu.happycoders.java21.patternmatching;

public class Example23_RecordPatternWithNestedRecordPatternOnlyFrom {

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
      case Path(Point2D(int x1, int y1), var to) ->
          System.out.printf("from: (%d, %d)%n", x1, y1);

      case Path(Point3D(int x1, int y1, int z1), var to) ->
          System.out.printf("from: (%d, %d, %d)%n", x1, y1, z1);

      default -> throw new IllegalArgumentException();
    }
  }

}
