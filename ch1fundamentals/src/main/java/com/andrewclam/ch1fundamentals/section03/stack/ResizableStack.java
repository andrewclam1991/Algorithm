package com.andrewclam.ch1fundamentals.section03.stack;

/**
 * Implements a {@link Stack} that expands and shrinks base on runtime
 * halves
 * @param <V>
 */
public class ResizableStack<V> implements Stack<V>{

  private V[] array;

  /**
   * tracks the current index of the array, starts at 0
   */
  private int i = 0;

  /**
   * Constructs array default stack with array size 10
   */
  public ResizableStack(){
    array = (V[]) new Object[10];
  }

  /**
   * Constructs array default stack with a param size
   * @param size initial stack size
   */
  public ResizableStack(int size){
    array = (V[]) new Object[size];
  }

  @Override
  public void push(V v) {
    if (i >= size()){
      V[] biggerArray = (V[]) new Object[size() * 2];
      System.arraycopy(array, 0, biggerArray, 0, array.length);
      array = biggerArray;
    }
    array[i++] = v;
  }

  @Override
  public V pop() {
    if (i < size() / 2){
      V[] smallerArray = (V[]) new Object[size() / 2];
      System.arraycopy(array, 0, smallerArray, 0, array.length);
      array = smallerArray;
    }
    return array[i--];
  }

  @Override
  public boolean isEmpty() {
    return i == 0;
  }

  @Override
  public int size() {
    return array.length;
  }
}
