package util;

public class ConversorDeMoeda {

    public static final double IOF = 0.06;

    public static double dolarFinal(double dollar, double compraDollar){
        return compraDollar * dollar * (1 + IOF);
    }

}
