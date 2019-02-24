package printerErrors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void test(){
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        String v="osmmaab";
        assertEquals("3/56", Printer.printerError(s));
        assertEquals("2/7", Printer.printerError(v));
    }

    @Test
    public void test2(){
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        String v="osmmaab";
        assertEquals("3/56", Printer.printerError2(s));
        assertEquals("2/7", Printer.printerError2(v));
    }
}
