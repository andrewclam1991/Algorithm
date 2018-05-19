package com.andrewclam.chapter1.section03.stack;

/**
 * Example implementation of a fixed size {@link Stack}
 * @param <Item> type of item to store in the {@link Stack}
 */
public class FixedStack<Item> implements Stack<Item>{

  /**
   * array to store the array of {@link Item}s
   */
  private Item[] a;

  /**
   * tracks the current index of the array, starts at 0
   */
  private int n = 0;

  /**
   * Constructor to enforce a size
   * @param size determines the fixed size of a {@link Stack}
   */
  public FixedStack(int size){ a = (Item[]) new Object[size];}

  @Override
  public void push(Item item) { a[n++]=item; }

  @Override
  public Item pop() { return a[--n]; }

  @Override
  public boolean isEmpty() { return n == 0; }

  @Override
  public int size() { return n; }
}
