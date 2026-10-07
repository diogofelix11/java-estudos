package entities;

public class Habitante {

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double impostoDeRenda() {

        double imposto = 0;
        if (salario < 2000.0) {
            imposto = 0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        return imposto;
    }
}



