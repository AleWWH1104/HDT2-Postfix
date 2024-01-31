import java.util.Stack;

/**
 * Implementación de la interfaz UVGStack utilizando la clase Stack de Java.
 * Proporciona operaciones básicas de una pila para números enteros.
 * 
 * @author Iris Ayala & David Dominguez
 * @version 1.0
 * @since 2024-01-25
 */
public class Stack_Pila implements UVGStack {

    private Stack<Integer> stack;

    /**
     * Constructor que inicializa la pila.
     */
    public Stack_Pila() {
        stack = new Stack<>();
    }

    /**
     * Agrega un elemento al tope de la pila.
     *
     * @param x Elemento a ser agregado a la pila.
     */
    @Override
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Elimina y devuelve el elemento en el tope de la pila.
     *
     * @return Elemento en el tope de la pila.
     */
    @Override
    public int pop() {
        return stack.pop();
    }

    /**
     * Devuelve el elemento en el tope de la pila sin eliminarlo.
     *
     * @return Elemento en el tope de la pila.
     */
    @Override
    public int top() {
        return stack.peek();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
