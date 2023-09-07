package eu.happycoders.java21.patternmatching;

public class Example03_SealedClasses {

  record Point(int x, int y) {}

  sealed interface Shape permits Rectangle, Circle {}

  record Circle(Point center, int radius) implements Shape {}

  record Rectangle(Point topLeft, Point bottomRight) implements Shape {}
}
