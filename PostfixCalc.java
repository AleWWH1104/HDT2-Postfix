import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;

public class PostfixCalc {

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
            return "" ; // Manejo básico de excepciones: devuelve una cadena vacía si hay un error de lectura
        }
    }
    


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
            return 0; //operadores insuficientes en la pila
        }

        if (stack.isEmpty()) {
            System.err.println("Error: La pila está vacía al finalizar la evaluación.");
            return 0; //pila está vacia al realizar las operaciones
        }

        return stack.pop();
    }
   
    public static void main(String[] args) {
        String notacion = leerNotacion();
        if (notacion.equals("")){
            System.out.println("La expresion postfix no se puede realizar");
        }else{
            int resultado = poFixcalc(notacion);
            System.out.println(resultado);}
        
    }

        
        
}
    

