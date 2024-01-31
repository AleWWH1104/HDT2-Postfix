import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
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
     * Método principal que lee la expresión postfix desde el archivo y realiza la evaluación.
     * Imprime el resultado o un mensaje indicando que la expresión no se puede realizar.
     *
     * @param args Argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {
        String notacion = leerNotacion();
        PostfixCalc calc = new PostfixCalc();
        if (notacion.equals("")) {
            System.out.println("La expresión postfix no se puede realizar");
        } else {
            int resultado = calc.poFixcalc(notacion);
            System.out.println(resultado);
        }
    }
}