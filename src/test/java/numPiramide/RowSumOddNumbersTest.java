package numPiramide;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RowSumOddNumbersTest {




    @Test
    public void test2(){
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers2(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers2(42));
        assertEquals(125, RowSumOddNumbers.rowSumOddNumbers2(5));
    }

    @Test
    public void givenRowHasNumbers(){
        assertArrayEquals(new int[]{31, 33, 35, 37, 39, 41}, RowSumOddNumbers.findAllRowNum(6));
        assertArrayEquals(new int[]{7,9,11}, RowSumOddNumbers.findAllRowNum(3));
    }

    @Test
    public void givenRowHasFirstNumber(){
        assertEquals(43,RowSumOddNumbers.findFirstRowNum(7));
        assertEquals(31,RowSumOddNumbers.findFirstRowNum(6));
        assertEquals(7,RowSumOddNumbers.findFirstRowNum(3));
    }

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
        assertEquals(125, RowSumOddNumbers.rowSumOddNumbers(5));
    }
}
