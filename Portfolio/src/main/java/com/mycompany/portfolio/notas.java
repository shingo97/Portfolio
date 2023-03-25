/*
INTERFACES GRÁFICAS CON JAVA
 */
 /*
 * Interfaces gráficas con Java
 * 
 * Java contiene múltiples elementos que nos permite trabajar de manera gráfica y amigable la interacción del usuario con el programa.
 * Empezare con esa interacción gráfica con el elemento javax.swing.JOptionPane, el cual nos permitirá la entrada y salida de datos a través de ventanas emergentes.
 */
/**
 *
 * @author Alexander Valdes Martinez
 */
package com.mycompany.portfolio;

import javax.swing.JOptionPane;

public class notas {

    public static void main(String[] args) {

        double nota1, nota2, examen, definitiva;

        /*Pedir datos con JOptionPane, igualmente hay que convertir a double lo 
        que usuario vaya a digitar en la ventana emergente.
         */
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Primer Parcial"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Segundo Parcial"));
        examen = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del Examen Final"));

        //los valores asignados son inventados no aplican para ningun caso en especial.
        definitiva = ((nota1 + nota2) / 2 * 0.6) + (examen * 0.4);

        // Se imprimen los datos con JOptionPane.showMessageDialog:
        JOptionPane.showMessageDialog(null, "La nota definitiva de la asigntura es :" + definitiva);
        
        //El valor que se quiera dar con decimales, se debe marcar con punto(.) ej: 4.5

    }

}
