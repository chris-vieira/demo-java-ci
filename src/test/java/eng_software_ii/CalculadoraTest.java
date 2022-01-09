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


}
