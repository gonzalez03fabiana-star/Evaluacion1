/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluda.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class PracticaEvaluda1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitud de informacion
        String nombre = JOptionPane.showInputDialog("Indique su nombre: ");
        String apellido = JOptionPane.showInputDialog("Indique su apellido: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Indique su salario mensual:"));
        
        
        //Impuestos
        double sem = salario * 0.0925;
        double ivm = salario * 0.0508;
        
        //Calcular el impuesto del salario 
        double impuestoSalario = 0.0;
        if (salario > 922000 && salario < 1352000){
            impuestoSalario = salario * 0.010;}
            else if (salario > 1352000 && salario < 2373000)
            impuestoSalario = salario * 0.015;
            else if (salario > 2373000){
                impuestoSalario = salario * 0.020;
            }
        
        //Deducciones 
        double deducciones = sem + ivm + impuestoSalario;
        double asociacion = salario - deducciones * 0.025;
        
        double totalPagar = deducciones + asociacion;
        
        //Resultados
        JOptionPane.showMessageDialog(null, "La empresa debera abonar: " + deducciones, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Para la empresa se debera abonar: " + asociacion, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
    }
    

