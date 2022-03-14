import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    
    @Test
    public void print(){
        printer = new Printer(10,200);
        assertEquals(8, printer.print(1, 2));
        assertEquals(198, printer.toner);
    }
}
