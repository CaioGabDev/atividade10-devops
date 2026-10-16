package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcPotenciaTest {

    @Test
    void testarCalcularPotencia() {

        CalcPotencia calc = new CalcPotencia();

        double potencia = calc.calcularPotencia(220, 5);

        // P = 220 * 5 = 1100 W
        assertEquals(1100.0, potencia, 0.0001);
    }

    @Test
    void testarCalcularPotenciaDecimal() {

        CalcPotencia calc = new CalcPotencia();

        double potencia = calc.calcularPotencia(127, 2.5);

        // P = 127 * 2.5 = 317.5 W
        assertEquals(317.5, potencia, 0.0001);
    }
}
