package com.andrewclam.ch1fundamentals.section03.stack;

import org.junit.Test;

public class ResizableStackTest {

  @Test
  public void testCreateStack_defaultSize(){
    // When stack of String is created
    ResizableStack<String> stack = new ResizableStack<>();
    // Assert stack size is 10
    assert stack.size() == 10;
  }

  @Test
  public void testCreateStackWithSize_sizeIsSame(){
    // When stack of some object is created
    ResizableStack<String> stack = new ResizableStack<>(3);
    // Assert stack size is 3
    assert stack.size() == 3;
  }

  @Test
  public void whenMoreItemsThanCapacityArePushed_stackGrows(){
    // When stack of some object is created
    ResizableStack<String> stack = new ResizableStack<>(3);
    // Assert stack size is at first at 3
    assert stack.size() == 3;
    stack.push("a");
    stack.push("b");
    stack.push("c");
    stack.push("overflow?");
    // When pushes another item that would exceed the capacity 3
    // Assert stack size is no longer 3, and that it is in fact larger
    System.out.println(stack.size());
    assert stack.size() != 3 && stack.size() > 3;
    stack.push("something");
    stack.push("something");
    stack.push("something");
    System.out.println(stack.size());
  }

  @Test
  public void whenMoreThanHalfOfTheItemsArePopped_stackShrinks(){
    // When stack of some object is created
    ResizableStack<Integer> stack = new ResizableStack<>(10);
    // And when it is initialized with 10 items
    for(int i = 0; i < 10; i++){
      stack.push(i);
    }
    // Assert the stack size is at first 10
    assert stack.size() == 10;

    // When stack is popped 5 times
    for(int i = 0; i < 5; i++){
      stack.pop();
    }

    // Assert that the stack is now half its original size
    assert stack.size() == 5;
  }
}
