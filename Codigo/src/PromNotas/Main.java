package PromNotas;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        double notaA;

        double notaB;

        double notaC;


        notaA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de sus tareas"));
        notaB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de medio curso"));
        notaC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de examen final"));

        PromNotas notas = new PromNotas(notaA, notaB, notaC);

        JOptionPane.showMessageDialog(null, "Su promedio es: "+notas.getPromedio());

    }

}
