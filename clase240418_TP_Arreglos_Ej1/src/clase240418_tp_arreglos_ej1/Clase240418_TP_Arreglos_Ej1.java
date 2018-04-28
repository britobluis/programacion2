/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase240418_tp_arreglos_ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class Clase240418_TP_Arreglos_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloA = new int[10];
        int mayorValor = 0;
        int pos = 0;
        
        for (int i = 0; i < 10; i++) {
            arregloA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero"));
            System.out.println(arregloA[i]);
            if(arregloA[i] > mayorValor){
               mayorValor = arregloA[i];
               pos = i;
            }
        }
        System.out.println("El mayor valor es: " + mayorValor + " y se encuentra en la posicion: " + pos);
    }   
}
