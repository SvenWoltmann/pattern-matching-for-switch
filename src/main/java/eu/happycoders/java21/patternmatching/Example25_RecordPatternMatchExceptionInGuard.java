package eu.happycoders.java21.patternmatching;

public class Example25_RecordPatternMatchExceptionInGuard {

  record Point(Integer x, Integer y) {}

  public static void main(String[] args) {
    print(new Point(null, null));
  }

  static void print(Point p) {
    switch (p) {
      case Point(Integer x, Integer y) when x == 0 -> System.out.print("x-axis");
      case Point(Integer x, Integer y) -> System.out.print("somewhere else");
    }
  }

}
