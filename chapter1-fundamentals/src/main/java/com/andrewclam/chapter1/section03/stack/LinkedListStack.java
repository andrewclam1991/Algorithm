package com.andrewclam.chapter1.section03.stack;

/**
 * Example textbook generic linked-list implementation of a {@link Stack}
 * See Algorithm 1.2 page 149
 *
 * Implementation note:
 * This class expands, allows null items.
 */
public class LinkedListStack<Item> implements Stack<Item>{
  /**
   * References the first node, top of the stack
   * Note: On creation will be null
   */
  private Node first = null;

  /**
   * Keeps count of number of {@link Node}s within the LinkedListStack
   */
  private int n; //

  /**
   * Private nested class to define a linkable node
   */
  private class Node{
    Item item;
    Node next;
  }

  /**
   * Implementation to push an {@link Item} onto the top of the {@link LinkedListStack}
   * @param item object of type {@link Item} to be pushed to the {@link LinkedListStack}
   */
  public void push(Item item){
    // Stores a reference the current first Node
    Node oldFirst = first;

    // Creates a new Node to store the pushed item
    first = new Node();
    first.item = item;

    // New node now links the stored reference
    first.next = oldFirst;

    // Increment item counter
    n++;
  }

  /**
   * Implementation to pop the {@link Item} from the top of the {@link LinkedListStack}
   * @return the {@link Item} from the top.
   */
  public Item pop(){
    // Stores a reference to the current first Node's item
    Item item = first.item;

    // Assign the next Node as the new first Node
    first = first.next;

    // Decrement item counter
    n--;

    return item;
  }

  /**
   * @return whether the {@link LinkedListStack} is empty
   */
  public boolean isEmpty(){ return n == 0 | first == null; }

  /**
   * @return the current size of the {@link LinkedListStack}
   */
  public int size(){ return n; }
}
