package com.andrewclam.chapter1.queue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Example textbook generic linked-list implementation of a {@link Queue}
 * that also supports iteration via the {@link Iterable} interface
 * See Algorithm Text 1.3 page 151
 *
 * Implementation note:
 * This class expands, allows null items, and is iterable
 */
public class LinkedListQueue<Item> implements Queue<Item>, Iterable<Item>{

  /**
   * The first added {@link Node}, at the first of the {@link Queue<>}
   */
  private Node first;

  /**
   * The last added {@link Node}, at the end of the {@link Queue<>}
   */
  private Node last;

  /**
   * Tracks number of {@link Node} within the {@link Queue<>}
   */
  private int n;

  /**
   * Private nested class to define a linkable node
   */
  private class Node{
    Item item;
    Node next;
  }

  @Override
  public void enqueue(Item item) {
    // Add item to the end of the queue
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;

    // Check if the queue is empty
    if (isEmpty()){
      // Happens when the item is first added to the queue
      // should assign the newly added Node as the first node.
      first = last;
    }else{
      // Otherwise, link the current last Node as the previous
      // last item's next Node
      oldLast.next = last;
    }
    // Increment queue size
    n++;
  }

  @Override
  public Item dequeue() {
    // Remove item from the start of the queue
    Item item = first.item;
    // Assign the next node in queue as the new first
    first = first.next;
    // Decrement queue size
    n--;
    //
    if(isEmpty()) last = null;
    return item;
  }

  @Override
  public boolean isEmpty() { return n == 0; }

  @Override
  public int size() { return n; }

  @Override
  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  @Override
  public void forEach(Consumer<? super Item> consumer) {

  }

  // TODO implement this
  @Override
  public Spliterator<Item> spliterator() {
    throw new UnsupportedOperationException("Not supported yet.");
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
