package eu.happycoders.java21.patternmatching;

public class Example15_RecordWithTypePattern {

  record Point(int x, int y) {}

  record Path(Point from, Point to) {}

  public static void main(String[] args) {
    println(new Point(2, 3));
    println(new Path(new Point(3, 4), new Point(1, 5)));
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Object o) {
    print(o);
    System.out.println();
  }

  static void print(Object o) {
    switch (o) {
      case Point p -> System.out.printf("point: (%d, %d)", p.x(), p.y());
      case Path p -> System.out.printf("path: (%d, %d) -> (%d, %d)",
          p.from().x(), p.from().y(), p.to().x(), p.to().y());
      default -> {}
    }
  }

}
