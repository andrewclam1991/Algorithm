package com.andrewclam.chapter1.stack;

/**
 * Example generic linked-list implementation of a {@link Stack}
 * See Algorithm 1.2 page 149
 *
 * Implementation note:
 * This class expands allows null values
 */
public class LinkedLIstStack<Item> implements Stack<Item>{
  /**
   * References the first node, top of the stack
   * Note: On creation will be null
   */
  private Node first = null;

  /**
   * Keeps count of number of {@link Node}s within the LinkedLIstStack
   */
  private int n;

  /**
   * Private nested class to define linkable node
   */
  private class Node{
    Item item;
    Node next;
  }

  /**
   * Implementation to push an {@link Item} onto the top of the {@link LinkedLIstStack}
   * @param item object of type {@link Item} to be pushed to the {@link LinkedLIstStack}
   */
  public void push(Item item){
    // Stores a reference the current first item
    Node oldFirst = first;

    // Creates a new Node to store the pushed item
    first = new Node();
    first.item = item;

    // New node now links the stored reference
    first.next = oldFirst;
    n++;
  }

  /**
   * Implementation to pop the {@link Item} from the top of the {@link LinkedLIstStack}
   * @return the {@link Item} from the top.
   */
  public Item pop(){
    // Remove item from the top of the stack
    Item item = first.item;
    first = first.next;
    n--;
    return item;
  }

  /**
   * @return whether the {@link LinkedLIstStack} is empty
   */
  public boolean isEmpty(){ return n == 0 | first == null; }

  /**
   * @return the current size of the {@link LinkedLIstStack}
   */
  public int size(){ return n; }
}
