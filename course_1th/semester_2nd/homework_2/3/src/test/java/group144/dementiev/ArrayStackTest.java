package group144.dementiev;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {
    @Test
    public void getSize() {
        Stack stack = new ListStack();
        assertEquals(0, stack.getSize());
        stack.push(1);
        assertEquals(1, stack.getSize());
        stack.push(2);
        assertEquals(2, stack.getSize());
        stack.pop();
        assertEquals(1, stack.getSize());
    }

    @Test
    public void push() {
        Stack stack = new ListStack();
        assertEquals(0, stack.getSize());
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void pop() {
        Stack stack = new ListStack();
        assertEquals(0, stack.getSize());
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.getSize());
        assertEquals(0, stack.pop());
    }

    @Test
    public void clear() {
        Stack stack = new ListStack();
        assertEquals(0, stack.getSize());
        stack.push(1);
        assertEquals(1, stack.pop());
        stack.push(1);
        stack.push(2);
        stack.clear();
        assertEquals(0, stack.getSize());
    }
}