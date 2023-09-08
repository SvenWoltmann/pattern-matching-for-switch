package eu.happycoders.java21.patternmatching;

public class Example18_RecordPatternWithGuards {

  record Point(int x, int y) {}

  public static void main(String[] args) {
    println(new Point(0, 10));
    println(new Point(5, 5));
    println(new Point(8, 0));
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Point p) {
    print(p);
    System.out.println();
  }

  static void print(Point p) {
    switch (p) {
      case Point(int x, int y) when x == 0 -> System.out.print("x-axis");
      case Point(int x, int y) when y == 0 -> System.out.print("y-axis");
      case Point(int x, int y) -> System.out.print("somewhere else");
    }
  }

}
