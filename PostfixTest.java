// import org.junit.Before;
// import org.junit.Test;
// import static org.junit.Assert.assertEquals;

// /**
//  * Clase de prueba para la clase PostfixCalc.
//  * 
//  * @author Iris Ayala & David Dominguez
//  * @version 1.0
//  * @since 2024-01-25
//  */
// public class PostfixTest {

//     private PostfixCalc postfixCalc;

//     /**
//      * Configuración inicial antes de cada prueba.
//      */
//     @Before
//     public void setUp() {
//         postfixCalc = new PostfixCalc();
//     }

//     /**
//      * Prueba para la operación de suma en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcSuma() {
//         assertEquals(5, postfixCalc.poFixcalc("23+"));
//     }

//     /**
//      * Prueba para la operación de resta en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcResta() {
//         assertEquals(2, postfixCalc.poFixcalc("53-"));
//     }

//     /**
//      * Prueba para la operación de multiplicación en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcMultiplicacion() {
//         assertEquals(15, postfixCalc.poFixcalc("35*"));
//     }

//     /**
//      * Prueba para la operación de división en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcDivision() {
//         assertEquals(2, postfixCalc.poFixcalc("84/"));
//     }

//     /**
//      * Prueba para verificar la excepción ArithmeticException al dividir por cero.
//      */
//     @Test(expected = ArithmeticException.class)
//     public void testPoFixcalcDivisionPorCero() {
//         postfixCalc.poFixcalc("80/");  // Debe lanzar ArithmeticException por división entre cero
//     }

//     /**
//      * Prueba para verificar la excepción IllegalArgumentException para operador no reconocido.
//      */
//     @Test(expected = IllegalArgumentException.class)
//     public void testPoFixcalcOperadorNoReconocido() {
//         postfixCalc.poFixcalc("23$");  // Debe lanzar IllegalArgumentException por operador no reconocido
//     }

//     /**
//      * Prueba para verificar el manejo de operadores insuficientes en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcOperadoresInsuficientes() {
//         assertEquals(0, postfixCalc.poFixcalc("23+*"));  // Debe devolver 0 debido a operadores insuficientes
//     }

//     /**
//      * Prueba para verificar el manejo de una pila vacía en notación postfix.
//      */
//     @Test
//     public void testPoFixcalcPilaVacia() {
//         assertEquals(0, postfixCalc.poFixcalc(""));  // Debe devolver 0 debido a que la pila está vacía
//     }
// }
