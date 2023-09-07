package eu.happycoders.java21.patternmatching;

public class Example11_PatternVariableScopeInAColonSwitch {

  void foo(Object o) {
    switch (o) {
      case String s:
        String s2 = s;
        System.out.println("Copy of s: " + s2);
        break;

      case Integer i:
        System.out.println("An integer: " + i);
        String s = "I am a new string";
        String s2 = "I am also a new string"; // Not allowed!
        break;

      default:
        System.out.println("Something else");
    }
  }

}
