package com.example.demo;

public class OuterClass {

  public static int OUTER_STATIC_VALUE = 10;

  class InnerClass {

    public static void publicMethod() {
      System.out.println("outer static value = " + OUTER_STATIC_VALUE);
    }
  }

  static class StaticInnerClass {

    public static void publicMethod() {
      System.out.println("outer static value = " + OUTER_STATIC_VALUE);
    }
  }
}
