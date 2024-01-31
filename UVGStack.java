/**
 * Interfaz que define las operaciones básicas de una pila de números enteros.
 * 
 * @author Iris Ayala & David Dominguez
 * @version 1.0
 * @since 2024-01-25
 */
public interface UVGStack {

    /**
     * Agrega un elemento al tope de la pila.
     *
     * @param item Elemento a ser agregado a la pila.
     */
    void push(int item);

    /**
     * Elimina y devuelve el elemento en el tope de la pila.
     *
     * @return Elemento en el tope de la pila.
     */
    int pop();

    /**
     * Devuelve el elemento en el tope de la pila sin eliminarlo.
     *
     * @return Elemento en el tope de la pila.
     */
    int top();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario.
     */
    boolean isEmpty();
}
