package eu.happycoders.java21.patternmatching;

public class Example04_RecordPattern {

  record Pair<T>(T e1, T e2) {}

  public static void main(String[] args) {
    print(new Pair<>("Hello", "World"));
    print(new Pair<>(42, 47));
    print(new Pair<>(3.14159, 2.71828));
  }

  static void print(Pair<?> p) {
    if (p instanceof Pair(String s1, String s2)) {
      System.out.printf("Lengths: [%s, %s]%n", s1.length(), s2.length());
    } else if (p instanceof Pair(Integer i1, Integer i2)) {
      System.out.printf("Squares: [%d, %d]%n", i1 * i1, i2 * i2);
    } else if (p instanceof Pair(var v1, var v2)) {
      System.out.printf("Some other pair: [%s, %s]%n", v1, v2);
    }
  }


}
