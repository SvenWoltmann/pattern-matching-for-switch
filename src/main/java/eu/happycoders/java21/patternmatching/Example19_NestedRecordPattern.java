package eu.happycoders.java21.patternmatching;

public class Example19_NestedRecordPattern {

  record Point(int x, int y) {}

  record Path(Point from, Point to) {}

  public static void main(String[] args) {
    print(new Point(2, 3));
    print(new Path(new Point(3, 4), new Point(1, 5)));
  }

  static void print(Object o) {
    switch (o) {
      case Point(int x, int y) -> System.out.printf("point: (%d, %d)%n", x, y);
      case Path(Point(int x1, int y1), Point(int x2, int y2)) ->
          System.out.printf("path: (%d, %d) -> (%d, %d)%n", x1, y1, x2, y2);
      default -> {}
    }
  }

}
