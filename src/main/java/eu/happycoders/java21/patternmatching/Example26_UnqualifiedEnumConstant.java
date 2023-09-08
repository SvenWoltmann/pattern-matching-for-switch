package eu.happycoders.java21.patternmatching;

import eu.happycoders.java21.patternmatching.Example23_RecordPatternWithNestedRecordPatternOnlyFrom.Path;
import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.CompassDirection;
import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.Direction;
import eu.happycoders.java21.patternmatching.Example29_SealedClassesWithQualifiedEnums.VerticalDirection;

public class Example26_UnqualifiedEnumConstant {

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
  static void flyln(CompassDirection d) {
    fly(d);
    System.out.println();
  }

  static void fly(CompassDirection d) {
    switch (d) {
      case NORTH -> System.out.print("Flying north");
      case SOUTH -> System.out.print("Flying south");
      case EAST -> System.out.print("Flying east");
      case WEST -> System.out.print("Flying west");
    }
  }

}
