package com.andrewclam.chapter1.queue;

/**
 * API for a FIFO {@link Queue}
 * @param <Item> type of {@link Item} to store
 */
public interface Queue<Item> {
  /**
   * Add item to the end of the {@link Queue}
   * @param item item to be added
   */
  void enqueue(Item item);

  /**
   * @return item that is at the start of the {@link Queue}
   */
  Item dequeue();

  /**
   * @return whether the {@link Queue} is empty
   */
  boolean isEmpty();

  /**
   * @return current size of the {@link Queue}
   */
  int size();
}
