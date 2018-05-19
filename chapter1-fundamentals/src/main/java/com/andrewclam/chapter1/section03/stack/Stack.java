package com.andrewclam.chapter1.section03.stack;

/**
 * API of a Pushdown (LIFO) {@link Stack}
 * @param <Item> type of {@link Item} to store
 */
public interface Stack<Item> {
  /**
   * pushes an {@link Item} onto the top of the {@link Stack}
   * @param item object of type {@link Item} to be pushed to the {@link Stack}
   */
  void push(Item item);

  /**
   * @return the {@link Item} at the top of the {@link Stack}
   */
  Item pop();

  /**
   * @return whether the {@link Stack} is empty
   */
  boolean isEmpty();

  /**
   * @return the number of {@link Item} within the {@link Stack}
   */
  int size();
}
