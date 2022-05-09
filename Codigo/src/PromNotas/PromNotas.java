package PromNotas;

public class PromNotas {

    private double pta;

    private double emc;

    private double efc;

    public PromNotas(double pta, double emc, double efc) {
        this.pta = pta;
        this.emc = emc;
        this.efc = efc;
    }

    public double getPta() {
        return pta;
    }

    public void setPta(double pta) {
        this.pta = pta;
    }

    public double getEmc() {
        return emc;
    }

    public void setEmc(double emc) {
        this.emc = emc;
    }

    public double getEfc() {
        return efc;
    }

    public void setEfc(double efc) {
        this.efc = efc;
    }

    public double getPromedio(){

        double promedio;

        promedio = Math.round(getPta() + getEmc() + getEfc())/3;

        return promedio;
    }
}
