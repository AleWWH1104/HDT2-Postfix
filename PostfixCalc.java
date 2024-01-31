import java.util.EmptyStackException;

/**
 * Esta clase proporciona métodos para realizar la evaluación de expresiones en notación postfix.
 * La expresión postfix se lee desde un archivo llamado "datos.txt".
 * 
 * @author Iris Ayala & David Dominguez
 * @version 1.0
 * @since 2024-01-25
 */
public class PostfixCalc  {
    /**
     * Evalúa la expresión en notación postfix y devuelve el resultado.
     *
     * @param notacion Expresión en notación postfix.
     * @return Resultado de la evaluación de la expresión postfix.
     */
    public int poFixcalc(String notacion) {
        Stack_Pila stack = new Stack_Pila();

        char caracteres[] = notacion.toCharArray();
        try {
            for (char x : caracteres) {
                if (x >= '0' && x <= '9') {
                    stack.push((int) (x - '0'));
                } else {
                    int op2 = stack.pop();
                    int op1 = stack.pop();

                    switch (x) {
                        case '+':
                            stack.push(op1 + op2);
                            break;
                        case '-':
                            stack.push(op1 - op2);
                            break;
                        case '*':
                            stack.push(op1 * op2);
                            break;
                        case '/':
                            if (op2 == 0) {
                                throw new ArithmeticException("División por cero");
                            }
                            stack.push(op1 / op2);
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

        return stack.pop();
    }
   
}
