package eu.happycoders.java21.patternmatching;

public class Example18_RecordPatternWithGuards {

  record Point(int x, int y) {}

  public static void main(String[] args) {
    print(new Point(0, 10));
    print(new Point(5, 5));
    print(new Point(8, 0));
  }

  static void print(Point p) {
    switch (p) {
      case Point(int x, int y) when x == 0 -> System.out.println("x-axis");
      case Point(int x, int y) when y == 0 -> System.out.println("y-axis");
      case Point(int x, int y) -> System.out.println("somewhere else");
    }
  }

}
