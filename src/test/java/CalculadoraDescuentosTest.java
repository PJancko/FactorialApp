package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.CalculadoraDescuentos;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {
    @Test
    void testDescuentoCero() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(100.00, calc.calcularPrecioFinal(100.00, 0));
    }

    @Test
    void testDescuentoTotal() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(0.00, calc.calcularPrecioFinal(100.00, 100));
    }

    @Test
    void testDescuentoNormal() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(80.00, calc.calcularPrecioFinal(100.00, 20));
    }

    @Test
    void testPrecioInvalido() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(0, 10);
        });
    }

    @Test
    void testDescuentoInvalido() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularPrecioFinal(100, 150);
        });
    }
}
