package com.andrewclam.ch1fundamentals.section01.exercise12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests
 * {@link ArrayPuzzle}
 */
public class ArrayPuzzleTest {
  @Before
  public void init() {
    // Print the requirement
    System.out.print(ArrayPuzzle.getRequirement() + "\n");
  }

  @After
  public void cleanup(){
    // Print a end new line
    System.out.print("\n");
  }

  @Test
  public void testPrintResult(){
    String result = ArrayPuzzle.fun();
    System.out.print(result);
    System.out.print("Wah? a histogram, pyramid series?! nifty");
    // AFTER THOUGHT:

  }

  @Test
  public void testPrintResultSetMax(){
    String result = ArrayPuzzle.fun(59);
    System.out.print(result);
  }
}

