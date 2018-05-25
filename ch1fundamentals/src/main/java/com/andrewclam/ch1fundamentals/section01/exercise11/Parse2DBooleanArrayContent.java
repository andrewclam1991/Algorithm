package com.andrewclam.ch1fundamentals.section01.exercise11;

/**
 * Solution(s) of
 * Exercise 1.1.11, pg 56
 * Write a code fragment that prints the contents of a 2D boolean array, using *
 * to represent {@code true} and a space to represent {@code false}. Include row
 * and column numbers.
 */
public final class Parse2DBooleanArrayContent {

  /**
   * @return exercise requirement, pretty print
   */
  public static String getRequirement(){
    return "Exercise 1.1.11, pg 56\n" +
        "Write a code fragment that prints the contents of a 2D boolean array, using *\n" +
        "to represent {@code true} and a space to represent {@code false}. Include row\n" +
        "and column numbers.";
  }

  /**
   * @param a two-dimensional array of booleans
   * @return the contents of a 2D boolean array, * represents true, space
   * represents false
   */
  public static String fun(boolean[][] a){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        sb.append("[row:");
        sb.append(i);
        sb.append(" col:");
        sb.append(j);
        sb.append(" val:");
        if (a[i][j]){
          sb.append("*");
        }else{
          sb.append(" ");
        }
        // readability, close each parse value
        sb.append("]");
      }
      // create a new line for each entry
      sb.append("\n");
    }
    return sb.toString();
  }
}
