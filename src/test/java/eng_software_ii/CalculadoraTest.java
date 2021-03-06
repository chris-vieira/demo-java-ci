package eng_software_ii;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  @Test
  public void testeSoma() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = 5;
    double resultadoRetornado = calc.soma(2, 3);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testeSubtracao() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = -1;
    double resultadoRetornado = calc.subtracao(2, 3);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testeMultiplicacao() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = -6.369;
    double resultadoRetornado = calc.multiplicacao(2.123, -3);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testeDivisao() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = 2.123;
    double resultadoRetornado = calc.divisao(-6.369, -3);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testeDivisaoPosInfinity() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = Double.POSITIVE_INFINITY;
    double resultadoRetornado = calc.divisao(1, 0);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testeDivisaoNegInfinity() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = Double.NEGATIVE_INFINITY;
    double resultadoRetornado = calc.divisao(-1, 0);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test(expected = IllegalArgumentException.class)
  public void testeDivisaoException() {
    Calculadora calc = new Calculadora();
    double resultadoRetornado = calc.divisao_melhorada(-1, 0);
  }


  @Test
  public void testeModulus() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = 196;
    double resultadoRetornado = calc.modulus(2021, 365);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testePiValue() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = Math.PI;
    double resultadoRetornado = calc.pi_value();
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }

  
  @Test
  public void testeEulerValue() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = Math.exp(1.0);
    double resultadoRetornado = calc.e_value();
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


  @Test
  public void testePow() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = 8.0;
    double resultadoRetornado = calc.pow(2, 3);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


}
