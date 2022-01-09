package eng_software_ii;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  @Test
  public void testeSoma1() {
    Calculadora calc = new Calculadora();
    int resultadoEsperado = 5;
    int resultadoRetornado = calc.soma(2,3);
    assertEquals(resultadoEsperado, resultadoRetornado);
  }

}
