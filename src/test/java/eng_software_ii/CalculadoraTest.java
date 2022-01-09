package eng_software_ii;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  @Test
  public void testeSoma() {
    Calculadora calc = new Calculadora();
    double resultadoEsperado = 5;
    double resultadoRetornado = calc.soma(2, 3);
    //assertEquals(resultadoEsperado, resultadoRetornado);
    assertEquals(resultadoEsperado, resultadoRetornado, 0.000001);
  }


}
