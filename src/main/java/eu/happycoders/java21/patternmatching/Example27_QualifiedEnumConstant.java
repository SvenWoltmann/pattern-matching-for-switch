package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example26_UnqualifiedEnumConstant.CompassDirection;

public class Example27_QualifiedEnumConstant {

  enum CompassDirection { NORTH, SOUTH, EAST, WEST }

  public static void main(String[] args) {
    flyln(CompassDirection.NORTH);
    flyln(CompassDirection.SOUTH);
    flyln(CompassDirection.EAST);
    flyln(CompassDirection.WEST);
  }

  // I did not include line breaks in the fly() method to
  // a) make the lines shorter and
  // b) make them better readable in a printed magazine
  static void flyln(Object o) {
    fly(o);
    System.out.println();
  }

  static void fly(Object o) {
    switch (o) {
      case CompassDirection.NORTH -> System.out.print("Flying north");
      case CompassDirection.SOUTH -> System.out.print("Flying south");
      case CompassDirection.EAST -> System.out.print("Flying east");
      case CompassDirection.WEST -> System.out.print("Flying west");
      default -> {}
    }
  }

}
