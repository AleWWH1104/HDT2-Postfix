import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;

/**
 * Esta clase proporciona métodos para realizar la evaluación de expresiones en notación postfix.
 * La expresión postfix se lee desde un archivo llamado "datos.txt".
 * 
 * @author Iris Ayala & David Dominguez
 * @version 1.0
 * @since 2024-01-25
 */
public class PostfixCalc {

    /**
     * Lee la expresión en notación postfix desde el archivo "datos.txt" y la devuelve como una cadena.
     *
     * @return Expresión en notación postfix leída desde el archivo.
     */
    public static String leerNotacion() {
        try {
            FileReader fileReader = new FileReader("datos.txt"); // Nombre del archivo con la expresión postfix
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder notacionBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                notacionBuilder.append(line);
            }
            bufferedReader.close();

            String notacion = notacionBuilder.toString().replaceAll("\\s+", "");

            if (notacion.isEmpty()) {
                System.out.println("El archivo está vacío.");
                return ""; // Devuelve una cadena vacía en caso de archivo vacío
            } else {
                return notacion;
            }
        } catch (IOException e) {
            return ""; // Manejo básico de excepciones: devuelve una cadena vacía si hay un error de lectura
        }
    }

    /**
     * Evalúa la expresión en notación postfix y devuelve el resultado.
     *
     * @param notacion Expresión en notación postfix.
     * @return Resultado de la evaluación de la expresión postfix.
     */
    public static int poFixcalc(String notacion) {
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

        if (stack.isEmpty()) {
            System.err.println("Error: La pila está vacía al finalizar la evaluación.");
            return 0; // La pila está vacía al realizar las operaciones
        }

        return stack.pop();
    }

    /**
     * Método principal que lee la expresión postfix desde el archivo y realiza la evaluación.
     * Imprime el resultado o un mensaje indicando que la expresión no se puede realizar.
     *
     * @param args Argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {
        String notacion = leerNotacion();
        if (notacion.equals("")) {
            System.out.println("La expresión postfix no se puede realizar");
        } else {
            int resultado = poFixcalc(notacion);
            System.out.println(resultado);
        }
    }
}
