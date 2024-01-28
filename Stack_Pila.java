import java.util.Stack;

public class Stack_Pila implements UVGStack {
    private Stack<Character> stack;

    @Override
    public void push(char x) {
        stack.push(x);   
    }

    @Override
    public char pop() {
        return stack.pop();
    }

    @Override
    public char top() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
        }
    
    
}
