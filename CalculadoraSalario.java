public class CalculadoraSalario {
    public double calculadoraINSS(double salarioBruto) {
        if(salarioBruto<=1320) {
            double faixa1 = salarioBruto*0.075;
            double recolher = faixa1;
            return recolher;
        } else if(salarioBruto<=2571.29) {
            double faixa1 =  (1320*0.075);
            double faixa2 = (salarioBruto-1320.01)*0.09;
            return faixa1+faixa2;
        } else if(salarioBruto<=3856.94)  {
            double faixa1 =  (1320*0.075);
            double faixa2 = (2571.29-1320.01)*0.09;
            double faixa3 = (salarioBruto-2571.29)*0.12;
            return faixa1+faixa2+faixa3;
        } else if(salarioBruto<=7507.49) {
            double faixa1 =  (1320*0.075);
            double faixa2 = (2571.29-1320.01)*0.09;
            double faixa3 = (3856.94-2571.29)*0.12;
            double faixa4 = (salarioBruto-3856.94)*0.14;
            return faixa1+faixa2+faixa3+faixa4;
        } else {
            double faixa1 =  (1320*0.075);
            double faixa2 = (2571.29-1320.01)*0.09;
            double faixa3 = (3856.94-2571.29)*0.12;
            double faixa4 = (7507.49-3856.94)*0.14;
            return faixa1+faixa2+faixa3+faixa4;
        }
    }
}
