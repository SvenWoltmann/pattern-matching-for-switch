package eu.happycoders.java21.patternmatching;

public class Example29_SealedClassesWithQualifiedEnums {

  sealed interface Direction permits CompassDirection, VerticalDirection {}

  enum CompassDirection implements Direction { NORTH, SOUTH, EAST, WEST }

  enum VerticalDirection implements Direction { UP, DOWN }

  public static void main(String[] args) {
    System.out.println(fly(CompassDirection.NORTH));
    System.out.println(fly(CompassDirection.SOUTH));
    System.out.println(fly(CompassDirection.EAST));
    System.out.println(fly(CompassDirection.WEST));
    System.out.println(fly(VerticalDirection.UP));
    System.out.println(fly(VerticalDirection.DOWN));
  }

  static String fly(Direction d) {
    return switch (d) {
      case CompassDirection.NORTH -> "Flying north";
      case CompassDirection.SOUTH -> "Flying south";
      case CompassDirection.EAST -> "Flying east";
      case CompassDirection.WEST -> "Flying west";
      case VerticalDirection.UP -> "Gaining altitude";
      case VerticalDirection.DOWN -> "Losing altitude";
    };
  }

}
