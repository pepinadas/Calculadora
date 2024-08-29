package org.example.operaciones;

import junit.framework.TestCase;
import org.junit.Test;


public class MultiplicacionTest extends TestCase {

    @Test
    public void TestMulti() {
        Multiplicacion mul = new Multiplicacion();
        System.out.println("En test");
        assertEquals(2, mul.ejecutar(1,2));
        assertEquals(mul.ejecutar(1,2), 2);
    };

}