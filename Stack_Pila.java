import java.util.Stack;

public class Stack_Pila implements UVGStack {
    private Stack<Integer> stack;

    public Stack_Pila() {
        stack = new Stack<>();
    }

    @Override
    public void push(int x) {
        stack.push(x);   
    }

    @Override
    public int pop() {
        return stack.pop();
    }

    @Override
    public int top() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
        }
    
    
}
