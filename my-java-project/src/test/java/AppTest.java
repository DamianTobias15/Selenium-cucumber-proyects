package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSum() {
        int result = 2 + 3;
        assertEquals("La suma debe ser 5", 5, result);
    }
}
