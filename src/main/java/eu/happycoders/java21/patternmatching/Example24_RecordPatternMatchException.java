package eu.happycoders.java21.patternmatching;

import java.util.Objects;

public class Example24_RecordPatternMatchException {

  record Point(Integer x, Integer y) {
    public Integer x() {
      Objects.requireNonNull(x);
      return x;
    }
  }

  public static void main(String[] args) {
    print(new Point(null,null));
  }

  static void print(Point p) {
    switch (p) {
      case Point(Integer x, Integer y) -> System.out.printf("(%d, %d)", x, y);
    }
  }

}
