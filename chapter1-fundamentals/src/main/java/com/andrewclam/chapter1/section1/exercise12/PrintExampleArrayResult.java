package com.andrewclam.chapter1.section1.exercise12;

/**
 * Solution(s) of
 * Exercise 1.1.12, pg 56
 * What does the following code fragment print?
 * int[] a = new int[10];
 * for (int i = 0; i < 10; i++)
 * a[i] = 9 - 1;
 * for (int i = 0; i < 10; i++)
 * a[i] = a[a[i]];
 * for (int i = 0; i < 10; i++)
 * System.out.println(a[i]);
 */
public class PrintExampleArrayResult {

  /**
   * Note: Think about the answer before running the code
   * Okay, line comments are my thought process
   * May 29 2018 - Sat 12:22 PST
   * @return a string result of the fun()
   */
  public static String fun() {
    // "Initial thought, just a trick and fun puzzle.
    // in other words, it is designed to break your head (rompecabezas)"

    // "After thought, create a string builder to store the result for test"
    StringBuilder sb = new StringBuilder();

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
      // "a[a[i]], when i is 0, "
      a[i] = a[a[i]];

    for (int i = 0; i < 10; i++)
      sb.append(a[i]);
    return sb.toString();
  }
}
