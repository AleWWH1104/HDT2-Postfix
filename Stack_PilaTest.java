import org.junit.Before;
import org.junit.Test;
import java.util.EmptyStackException;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la implementación de la pila (Stack_Pila) que implementa UVGStack.
 * 
 * @author Iris Ayala & David Dominguez
 * @version 1.0
 * @since 2024-01-25
 */
public class Stack_PilaTest {

    private UVGStack stack;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @Before
    public void setUp() {
        stack = new Stack_Pila();
    }

    /**
     * Prueba para verificar la operación de push y pop en la pila.
     */
    @Test
    public void testPushAndPop() {
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    /**
     * Prueba para verificar la excepción EmptyStackException al hacer pop desde una pila vacía.
     */
    @Test(expected = EmptyStackException.class)
    public void testPopFromEmptyStack() {
        assertTrue(stack.isEmpty());
        stack.pop();  // Debe lanzar EmptyStackException
    }

    /**
     * Prueba para verificar la operación de top en la pila.
     */
    @Test
    public void testTop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
        assertFalse(stack.isEmpty());
    }

    /**
     * Prueba para verificar la excepción EmptyStackException al hacer top desde una pila vacía.
     */
    @Test(expected = EmptyStackException.class)
    public void testTopEmptyStack() {
        assertTrue(stack.isEmpty());
        stack.top();  // Debe lanzar EmptyStackException
    }

    /**
     * Prueba para verificar si la pila está vacía inicialmente.
     */
    @Test
    public void testIsEmptyInitially() {
        assertTrue(stack.isEmpty());
    }

    /**
     * Prueba para verificar si la pila está vacía después de realizar push y pop.
     */
    @Test
    public void testIsEmptyAfterPushAndPop() {
        stack.push(7);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    /**
     * Prueba para verificar operaciones múltiples de push y pop en la pila.
     */
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
