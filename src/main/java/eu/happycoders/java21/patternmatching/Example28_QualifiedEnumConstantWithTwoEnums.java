package eu.happycoders.java21.patternmatching;

public class Example28_QualifiedEnumConstantWithTwoEnums {

  enum CompassDirection { NORTH, SOUTH, EAST, WEST }

  enum VerticalDirection { UP, DOWN }

  public static void main(String[] args) {
    fly(CompassDirection.NORTH);
    fly(CompassDirection.SOUTH);
    fly(CompassDirection.EAST);
    fly(CompassDirection.WEST);
    fly(VerticalDirection.UP);
    fly(VerticalDirection.DOWN);
  }

  static void fly(Object o) {
    switch (o) {
      case CompassDirection.NORTH -> System.out.println("Flying north");
      case CompassDirection.SOUTH -> System.out.println("Flying south");
      case CompassDirection.EAST -> System.out.println("Flying east");
      case CompassDirection.WEST -> System.out.println("Flying west");
      case VerticalDirection.UP -> System.out.println("Gaining altitude");
      case VerticalDirection.DOWN -> System.out.println("Losing altitude");
      default -> {}
    }
  }
}
