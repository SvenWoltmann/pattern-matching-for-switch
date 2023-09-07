package eu.happycoders.java21.patternmatching;

public class Example16_RecordPattern {

  record Point(int x, int y) {}

  record Path(Point from, Point to) {}

  public static void main(String[] args) {
    print(new Point(2, 3));
    print(new Path(new Point(3, 4), new Point(1, 5)));
  }

  static void print(Object o) {
    switch (o) {
      case Point(int x, int y) -> System.out.printf("point: (%d, %d)%n", x, y);
      case Path(var from, var to) ->
          System.out.printf("path: (%d, %d) -> (%d, %d)%n",
              from.x(), from.y(), to.x(), to.y());
      default -> {}}
  }

}
