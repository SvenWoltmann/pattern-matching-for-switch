package eu.happycoders.java21.patternmatching;

public class Example15_RecordWithTypePattern {

  record Point(int x, int y) {}

  record Path(Point from, Point to) {}

  public static void main(String[] args) {
    print(new Point(2, 3));
    print(new Path(new Point(3, 4), new Point(1, 5)));
  }

  static void print(Object o) {
    switch (o) {
      case Point p -> System.out.printf("point: (%d, %d)%n", p.x(), p.y());
      case Path p -> System.out.printf("path: (%d, %d) -> (%d, %d)%n",
          p.from().x(), p.from().y(), p.to().x(), p.to().y());
      default -> {}
    }
  }

}
