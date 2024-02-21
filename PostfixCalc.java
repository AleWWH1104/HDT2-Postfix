import java.util.EmptyStackException;
import java.util.Stack;

public class PostfixCalc<T> {
    private static PostfixCalc instance= null;  
    
    /*Constructor */
    public PostfixCalc(){}

    /*Utilizacion de patron de diseno Singleton */
    public static PostfixCalc getInstance(){
        if (instance == null){
            instance = new PostfixCalc();
        }
        return instance;
    }

    public int poFixcalc(String notation) {
        Stack<T> stack = new Stack<>();
        char[] characters = notation.toCharArray();

        try {
            for (char x : characters) {
                if (Character.isDigit(x)) {
                    stack.push((T) (Object) (x - '0')); // Convertir char a int y luego a tipo T
                } else {
                    int op2 = (int) (Object) stack.pop();
                    int op1 = (int) (Object) stack.pop();

                    switch (x) {
                        case '+':
                            stack.push((T) (Object) (op1 + op2)); // Convertir int a tipo T
                            break;
                        case '-':
                            stack.push((T) (Object) (op1 - op2));
                            break;
                        case '*':
                            stack.push((T) (Object) (op1 * op2));
                            break;
                        case '/':
                            if (op2 == 0) {
                                throw new ArithmeticException("División por cero");
                            }
                            stack.push((T) (Object) (op1 / op2));
                            break;
                        default:
                            throw new IllegalArgumentException("Operador no reconocido: " + x);
                    }
                }
            }
        } catch (EmptyStackException e) {
            System.err.println("Error: Operadores insuficientes en la pila.");
            return 0; // Operadores insuficientes en la pila
        }

        return (int) (Object) stack.pop(); // Convertir tipo T a int y luego devolverlo
    }
}

