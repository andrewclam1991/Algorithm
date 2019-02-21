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
  public void whenStackExceedsCapacity_stackGrows(){
    // When stack of some object is created
    ResizableStack<String> stack = new ResizableStack<>(3);
    // Assert stack size is 5
    assert stack.size() == 3;
    stack.push("a");
    stack.push("b");
    stack.push("c");
    stack.push("overflow?");
    // Assert stack size is not 3
    System.out.println(stack.size());
    assert stack.size() != 3;
    stack.push("something");
    stack.push("something");
    stack.push("something");
    System.out.println(stack.size());
  }
}
