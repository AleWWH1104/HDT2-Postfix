import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PostfixTest{

    private PostfixCalc postfixCalc;

    @Before
    public void setUp() {
        postfixCalc = new PostfixCalc();
    }

    @Test
    public void testPoFixcalcSuma() {
        assertEquals(5, postfixCalc.poFixcalc("23+"));
    }

    @Test
    public void testPoFixcalcResta() {
        assertEquals(2, postfixCalc.poFixcalc("53-"));
    }

    @Test
    public void testPoFixcalcMultiplicacion() {
        assertEquals(15, postfixCalc.poFixcalc("35*"));
    }

    @Test
    public void testPoFixcalcDivision() {
        assertEquals(2, postfixCalc.poFixcalc("84/"));
    }

    @Test(expected = ArithmeticException.class)
    public void testPoFixcalcDivisionPorCero() {
        postfixCalc.poFixcalc("80/");  // ArithmeticException division entre cero
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPoFixcalcOperadorNoReconocido() {
        postfixCalc.poFixcalc("23$");  //  IllegalArgumentException operador no reconocido
    }

    @Test
    public void testPoFixcalcOperadoresInsuficientes() {
        assertEquals(0, postfixCalc.poFixcalc("23+*"));  // devolver 0 debido a operadores insuficientes
    }

    @Test
    public void testPoFixcalcPilaVacia() {
        assertEquals(0, postfixCalc.poFixcalc(""));  // devolver 0 debido a que la pila vacia
    }

}