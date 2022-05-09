package IntCompuesto;

public class IntCompuesto {

    private double c;

    private double i;

    private double t;

    public IntCompuesto(double i, double c, double t) {
        this.c = c;
        this.i = i;
        this.t = t;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getInteres(){

        double interes;

        interes = i/100;

        return interes;
    }

    public double getPotencia(){

        double potencia;

        potencia = Math.pow(1 + getInteres(),t);

        return potencia;
    }

    public double getTotal(){

        double total;

        total = c * getPotencia();

        return total;
    }
}
