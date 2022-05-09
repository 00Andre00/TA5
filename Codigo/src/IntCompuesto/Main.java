package IntCompuesto;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        double varA;

        double varB;

        double varC;

        varA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capital"));
        varB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes mensual"));
        varC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los meses"));

        IntCompuesto compuesto = new IntCompuesto(varA, varB, varC);

        JOptionPane.showMessageDialog(null, "El importe total es: S/"+compuesto.getTotal());

    }
}
