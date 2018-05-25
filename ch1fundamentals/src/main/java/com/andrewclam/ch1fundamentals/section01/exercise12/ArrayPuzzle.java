package com.andrewclam.ch1fundamentals.section01.exercise12;

/**
 * Thought process(es) of
 * Exercise 1.1.12, pg 56
 * What does the following code fragment print?
 * int[] a = new int[10];
 * for (int i = 0; i < 10; i++)
 * a[i] = 9 - o;
 * for (int i = 0; i < 10; i++)
 * a[i] = a[a[i]];
 * for (int i = 0; i < 10; i++)
 * System.out.println(a[i]);
 */
public class ArrayPuzzle {

  /**
   * Note: Think about the answer before running the code
   * Okay, line comments are my thought process
   * May 29 2018 - Sat 12:22 PST
   *
   * @return a string result of the fun()
   */
  public static String fun() {
    // "Initial thought, just a trick and fun puzzle.
    // in other words, it is designed to break your head (rompecabezas)"

    // "After thought, create a string builder to store the result for test"
    StringBuilder sb = new StringBuilder();
    sb.append("Result: ");

    // "Okay, there is a new int of size 10"
    int[] a = new int[10];

    // "Start a counter with i, it looks like an index counter"
    for (int i = 0; i < 10; i++)
      // "this loop will iterate 10 times, from 0 to 9, perfect"
      // "the a[i] will iterate all elements, since it is an int[] of size 10"
      // "well, it seems all elements are getting assigned to some strange number"
      // "when i == 0, 9 - i == 9 ,
      // "when i == 1, 9 - i == 8 ...
      // "when i == 9, 9 - i == 0
      // "ha, each a[i] is assigned flipped index?"
      a[i] = 9 - i;

    // "Huh? another counter, umk"
    for (int i = 0; i < 10; i++)
      // "this loop is exact same as the above loop, forget about reuse, this is a puzzle after-all"
      // "each element in a[] will be assigned...hummm"
      // "when i is 0, a[i] == 9, so a[a[i]] == a[9], which was set and == 0,
      // "when i is 1, a[i] == 8, so a[a[i]] == a[8], which was set and == 1...
      // "when i is 9, a[i] == 0, so a[a[i]] == a[0], which was set and == 9
      a[i] = a[a[i]];

    for (int i = 0; i < 10; i++)
      // "this is another one of the same sequential loop"
      // "ANSWER: I expect the string to print out 0,1...9
      // "ACTUAL: see test..nice"
      sb.append(a[i]).append(",");
    return sb.toString();
  }

  /**
   * Variant of the algorith where the array max can be supplied
   * @param max supplied max size of the array
   * @return fun string result
   */
  public static String fun(int max) {
    StringBuilder sb = new StringBuilder();
    sb.append("Result: ");

    int[] a = new int[max];
    for (int i = 0; i < max; i++) {
      a[i] = (max - 1) - i; // max off-one
    }

    for (int i = 0; i< max; i++) {
      a[i] = a[a[i]];
    }

    for (int i = 0; i< max; i++) {
      sb.append(a[i]).append(",");
    }
    return sb.toString();
  }

  public static String getRequirement() {
    return " * Exercise 1.1.12, pg 56\n" +
        "What does the following code fragment print?\n" +
        "int[] a = new int[10];\n" +
        "for (int i = 0; i < 10; i++)\n" +
        " a[i] = 9 - i;\n" +
        "for (int i = 0; i < 10; i++)\n" +
        " a[i] = a[a[i]];\n" +
        "for (int i = 0; i < 10; i++)\n" +
        " System.out.println(a[i]);";
  }
}
