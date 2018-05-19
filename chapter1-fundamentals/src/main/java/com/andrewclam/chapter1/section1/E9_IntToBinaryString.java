package com.andrewclam.chapter1.section1;

/**
 * Solution(s) of
 * Exercise 1.1.9, pg 55
 * Write a code fragment that puts the binary representation of a
 * positive integer n into a String s.
 */
public final class E9_IntToBinaryString {

  /**
   * @param n positive integer
   * @return the {@link String} that outputs the binary representation of
   * {@code n}
   */
  public static String IntToBinaryString(int n) {
    StringBuilder s = new StringBuilder();
    for (int i = n; i > 0; i /= 2) {
      s.insert(0, (n % 2));
    }
    return s.toString();
  }

}
