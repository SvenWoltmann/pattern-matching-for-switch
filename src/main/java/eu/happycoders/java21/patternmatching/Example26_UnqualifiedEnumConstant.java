package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.CompassDirection;
import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.Direction;
import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.VerticalDirection;

public class Example26_UnqualifiedEnumConstant {

  enum CompassDirection { NORTH, SOUTH, EAST, WEST }

  public static void main(String[] args) {
    fly(CompassDirection.NORTH);
    fly(CompassDirection.SOUTH);
    fly(CompassDirection.EAST);
    fly(CompassDirection.WEST);
  }

  static void fly(CompassDirection d) {
    switch (d) {
      case NORTH -> System.out.println("Flying north");
      case SOUTH -> System.out.println("Flying south");
      case EAST -> System.out.println("Flying east");
      case WEST -> System.out.println("Flying west");
    }
  }

  static void fly2(CompassDirection d) {
    switch (d) {
      case NORTH -> System.out.println("Flying north");
      case SOUTH -> System.out.println("Flying south");
      case EAST -> System.out.println("Flying east");
      case WEST -> System.out.println("Flying west");
      default -> {}
    }
  }
}
