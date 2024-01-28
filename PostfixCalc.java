
public class PostfixCalc {

    public String leerNotacion(){
        return "";
    }


    public static int poFixcalc(String notacion){
        Stack_Pila stack = new Stack_Pila();
        char caracteres[] = notacion.toCharArray();
        for (char x : caracteres){
            if (x >= '0' && x <= '9'){
                stack.push((int)(x - '0'));
            }else {
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
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }
   
    



   
    public static void main(String[] args) {
        String notacion = "42+351-*+";
        int resultado = poFixcalc(notacion);
        System.out.println(resultado);
        
    }

        
        
}
    

