import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {
    CalculadoraSalario salario = new CalculadoraSalario();
    @Test
    @DisplayName("Calcula INSS com salário = 1300")
    public void INSSCT01() {
        double resultadoAtual= salario.calculadoraINSS(1300);
        Assertions.assertEquals(97.50,resultadoAtual,0.01);
    }

    @Test
    @DisplayName("Calcula INSS com salário = 1500")
    public void INSSCT02() {
        double resultadoAtual= salario.calculadoraINSS(1500);
        Assertions.assertEquals(115.20,resultadoAtual,0.01);
    }

    @Test
    @DisplayName("Calcula INSS com salário = 3000")
    public void INSSCT03() {
        double resultadoAtual= salario.calculadoraINSS(3000);
        Assertions.assertEquals(263.06,resultadoAtual,0.01);
    }

    @Test
    @DisplayName("Calcula INSS com salário = 6000")
    public void INSSCT04() {
        double resultadoAtual= salario.calculadoraINSS(6000);
        Assertions.assertEquals(665.92,resultadoAtual,0.01);
    }

    @Test
    @DisplayName("Calcula INSS com salário = 10000")
    public void INSSCT05() {
        double resultadoAtual= salario.calculadoraINSS(10000);
        Assertions.assertEquals(876.97,resultadoAtual,0.01);
    }

}