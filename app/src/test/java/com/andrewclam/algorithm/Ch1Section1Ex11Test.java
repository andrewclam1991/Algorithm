package com.andrewclam.algorithm;

import com.andrewclam.chapter1.section1.E11_Parse2DBooleanArrayContent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Tests
 * {@link com.andrewclam.chapter1.section1.E11_Parse2DBooleanArrayContent}
 */
public class Ch1Section1Ex11Test {
  private boolean[][] mTestArray1;
  private boolean[][] mTestArray2;
  private boolean[][] mRandomTestArray1;

  @Before
  public void init() {
    mRandomTestArray1 = generateRandomTestArray(123,123);

    mTestArray1 = new boolean[][]{
        {true, true, false, false},
        {false, false, true, true},
        {true, false, false, true}
    };

    mTestArray2 = new boolean[][]{
        {true,true},
        {false,false}
    };

    // Print the requirement
    System.out.print(E11_Parse2DBooleanArrayContent.getRequirement() + "\n");
  }

  @After
  public void cleanup(){
    // Print a end new line
    System.out.print("\n");
  }

  @Test
  public void testPrintResult(){
    // Given there are test two-dimensional arrays of booleans
    // When such array is provided to the method
    String result1 = E11_Parse2DBooleanArrayContent.fun(mRandomTestArray1);
    String result2 = E11_Parse2DBooleanArrayContent.fun(mTestArray1);
    String result3 = E11_Parse2DBooleanArrayContent.fun(mTestArray2);
    // Prints result to logger
    System.out.print("Random array 1 result: \n");
    System.out.print(result1 + "\n");
    System.out.print("Test array 1 result: \n");
    System.out.print(result2 + "\n");
    System.out.print("Test array 2 result: \n");
    System.out.print(result3 + "\n");
  }

  @Test
  public void testWithEmptyArray(){
    // Given there is an empty array
    boolean[][] mEmptyArray = new boolean[][]{};
    // When such array is provided to the method
    String result = E11_Parse2DBooleanArrayContent.fun(mEmptyArray);
    // result is empty and prints nothing
    assert result.isEmpty();
    System.out.print(result);
  }

  /**
   * Generates a random boolean array given the sizes, smallest
   * possible randomly 2d array is of size 1x1; uses {@link Random}
   * @param rowLimit upper limit of desired rows
   * @param columnLimit upper limit of desired columns
   */
  private boolean[][] generateRandomTestArray(int rowLimit, int columnLimit){
    Random rand = new Random();
    int rows = rand.nextInt(rowLimit) + 1;
    int cols = rand.nextInt(columnLimit) + 1;
    boolean[][] randomArray = new boolean[rows][cols];
    for(int i = 0; i < randomArray.length; i++){
      for(int j = 0; j < randomArray[i].length; j++){
        randomArray[i][j] = rand.nextBoolean();
      }
    }
    return randomArray;
  }

  private boolean[][] generateRandomTestArrayWithLowLimits(int rowLowLimit, int rowHighLimit,
                                                           int colLowLimit, int colHighLimit){
    Random rand = new Random();
    int rows = rand.nextInt(rowHighLimit) + rowLowLimit;
    int cols = rand.nextInt(colLowLimit) + colHighLimit;
    boolean[][] randomArray = new boolean[rows][cols];
    for(int i = 0; i < randomArray.length; i++){
      for(int j = 0; j < randomArray[i].length; j++){
        randomArray[i][j] = rand.nextBoolean();
      }
    }
    return randomArray;
  }
}

