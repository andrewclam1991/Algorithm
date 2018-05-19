package com.andrewclam.chapter1.section3.bag;

import java.util.Iterator;

/**
 * Example textbook generic linked-list implementation of a {@link Bag}
 * that also supports iteration via the {@link Iterable} interface
 * See Algorithm Text 1.3 page 155
 *
 * Implementation note:
 * This class expands, allows null items, and is iterable
 */
class LinkedListBag<Item> implements Bag<Item>, Iterable<Item> {

  private Node first;
  private int n;

  private class Node{
    Item item;
    Node next;
  }

  @Override
  public void add(Item item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    n++;
  }

  @Override
  public boolean isEmpty() {
    return n == 0;
  }

  @Override
  public int size() {
    return n;
  }

  @Override
  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  /**
   * Implementation of an {@link Iterator<>}
   */
  private class ListIterator implements Iterator<Item>{

    private Node current = first;

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Item next() {
      Item item = current.item;
      current = current.next;
      return item;
    }
  }

}
