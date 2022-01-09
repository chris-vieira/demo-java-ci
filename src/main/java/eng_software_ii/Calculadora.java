package eng_software_ii;
import java.lang.Math.*;

public class Calculadora {

  public double soma(double x, double y) {
    return x + y;
  }

  public double subtracao(double x, double y) {
    return x - y;
  }

  public double multiplicacao(double x, double y) {
    return x * y;
  }

  public double divisao(double x, double y) {
    double val = Double.POSITIVE_INFINITY;

    try {
      val = x / y;
    } catch (ArithmeticException ae) {
      if (x < 0)
        val = Double.NEGATIVE_INFINITY;
        throw new ArithmeticException("Error: Don't divide a number by zero!");
    }

    return val;
  }

  public double modulus(double x, double y) {
    return x % y;
  }


  public double pi_value() {
    return Math.PI;
  }
  
  public double e_value() {
    return Math.exp(1.0);
  }

  public double pow(double x, double y) {
    return Math.pow(x, y);
  }


}
