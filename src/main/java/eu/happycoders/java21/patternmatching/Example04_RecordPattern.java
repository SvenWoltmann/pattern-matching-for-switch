package eu.happycoders.java21.patternmatching;

public class Example04_RecordPattern {

  record Pair<T>(T e1, T e2) {}

  public static void main(String[] args) {
    println(new Pair<>("Hello", "World"));
    println(new Pair<>(42, 47));
    println(new Pair<>(3.14159, 2.71828));
  }

  // I did not include line breaks in the print() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void println(Pair<?> p) {
    print(p);
    System.out.println();
  }

  static void print(Pair<?> p) {
    if (p instanceof Pair(String s1, String s2)) {
      System.out.printf("Lengths: (%s, %s)", s1.length(), s2.length());
    } else if (p instanceof Pair(Integer i1, Integer i2)) {
      System.out.printf("Squares: (%d, %d)", i1 * i1, i2 * i2);
    } else if (p instanceof Pair(var v1, var v2)) {
      System.out.printf("Some other pair: (%s, %s)", v1, v2);
    }
  }

}
