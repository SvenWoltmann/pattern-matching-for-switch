package eu.happycoders.java21.patternmatching;

public class Example27_QualifiedEnumConstant {

  enum CompassDirection { NORTH, SOUTH, EAST, WEST }

  public static void main(String[] args) {
    fly(CompassDirection.NORTH);
    fly(CompassDirection.SOUTH);
    fly(CompassDirection.EAST);
    fly(CompassDirection.WEST);
  }

  static void fly(Object o) {
    switch (o) {
      case CompassDirection.NORTH -> System.out.println("Flying north");
      case CompassDirection.SOUTH -> System.out.println("Flying south");
      case CompassDirection.EAST -> System.out.println("Flying east");
      case CompassDirection.WEST -> System.out.println("Flying west");
      default -> {}
    }
  }

}
