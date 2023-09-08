package eu.happycoders.java21.patternmatching;

public class Example16_RecordPattern {

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
      case Point(int x, int y) -> System.out.printf("point: (%d, %d)", x, y);
      case Path(var from, var to) ->
          System.out.printf("path: (%d, %d) -> (%d, %d)",
              from.x(), from.y(), to.x(), to.y());
      default -> {}}
  }

}
