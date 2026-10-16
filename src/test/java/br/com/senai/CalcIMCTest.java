package br.com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    // Anotacao para dizer que a funcao e de teste
    @Test
    void testarCalcularIMC() {

        CalcIMC calc = new CalcIMC();

        double resultado = calc.calcularIMC(80.0, 1.80);

        // 80 / (1.80 * 1.80) = 24.69
        // o terceiro parametro e a margem de erro aceita para numeros decimais
        assertEquals(24.69, resultado, 0.01);
    }

    @Test
    void testarCalcularIMCPesoAltura2() {

        CalcIMC calc = new CalcIMC();

        double resultado = calc.calcularIMC(60.0, 1.50);

        // 60 / (1.50 * 1.50) = 26.666...
        assertEquals(26.67, resultado, 0.01);
    }
}
