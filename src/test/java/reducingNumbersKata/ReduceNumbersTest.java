package reducingNumbersKata;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReduceNumbersTest {

    @Test
    public void test(){
        assertEquals(7, ReduceNumbers.reduce(16));
        assertEquals(6, ReduceNumbers.reduce(942));
        assertEquals(6, ReduceNumbers.reduce(132189));
    }

    @Test
    public void test2() {
        assertEquals(811181, new ReduceNumbers().squareDigits(9119));
        assertEquals(811181, new ReduceNumbers().squareDigits2(9119));
        assertEquals(811181, new ReduceNumbers().squareDigits3(9119));
        assertEquals(811181, new ReduceNumbers().squareDigits4(9119));
    }
}
