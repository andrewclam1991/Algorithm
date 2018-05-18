package com.andrewclam.chapter1.queue;

/**
 * API for a FIFO {@link Queue}
 * @param <Item> type of {@link Item} to store
 */
public interface Queue<Item> {
  void enqueue(Item item);
  Item dequeue();
  boolean isEmpty();
  int size();
}
