package com.andrewclam.chapter1.bag;

/**
 * API for a {@link Bag}
 * @param <Item> type of {@link Item} to store
 */
public interface Bag<Item> {
  void add(Item item);
  boolean isEmpty();
  int size();
}
