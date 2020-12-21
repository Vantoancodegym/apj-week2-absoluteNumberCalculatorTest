import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Test number 0")
    void testFindAbsoluteNumber0(){
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number 1")
    void testFindAbsoluteNumer1(){
        int number=1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number -1")
    void testFindAbsoluteNagative1(){
        int number=-1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

}