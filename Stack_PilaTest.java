import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class Stack_PilaTest {

    private UVGStack stack;

    @Before
    public void setUp() {
        stack = new Stack_Pila();
    }

    @Test
    public void testPushAndPop() {
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopFromEmptyStack() {
        assertTrue(stack.isEmpty());
        stack.pop();  // EmptyStackException
    }

    @Test
    public void testTop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
        assertFalse(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testTopEmptyStack() {
        assertTrue(stack.isEmpty());
        stack.top();  // EmptyStackException
    }

    @Test
    public void testIsEmptyInitially() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyAfterPushAndPop() {
        stack.push(7);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testMultiplePushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.pop());
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.pop());
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
}
