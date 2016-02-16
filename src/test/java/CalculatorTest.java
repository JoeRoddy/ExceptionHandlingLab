import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    int actual;
    @Test
    public void addSpec(){
       actual = Calculator.add(10,-2);
        assertEquals("add() failed.",actual,8);
        System.out.println("add() passed");
    }
    @Test
    public void subtractSpec(){
        actual = Calculator.subtract(10,-2);
        assertEquals("subtract() failed",actual,12);
        System.out.println("subtract() passed");
    }
    @Test
    public void divideSpec(){
        double actually;
        try {
            actually = Calculator.divide(10, 0);
        } catch (DivisionByZeroException e){
            System.out.println("CANNOT DIVIDE BY ZERO");
            actually = 0;
        }
        assertTrue("divide() failed",actually==0);
        try {
            actually = Calculator.divide(10, 2);
        } catch (DivisionByZeroException e){
            System.out.println("CANNOT DIVIDE BY ZERO");
            actually = 0;
        }
        assertTrue("divide() failed",actually==5);
        System.out.println("divide() passed");
    }
    @Test
    public void multiplySpec(){
        actual = Calculator.multiply(10,-2);
        assertEquals("subtract() failed",actual,-20);
        System.out.println("subtract() passed");
    }
}
