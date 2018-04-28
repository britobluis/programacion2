/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_arreglos_ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class TP_Arreglos_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloA = new int[10];
        int mayorValor = 0;
        int pos = 0;
        int repeticiones = 0;
        
        for (int i = 0; i < 10; i++) {
            arregloA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero"));
            System.out.println(arregloA[i]);
            if(arregloA[i] > mayorValor){
               mayorValor = arregloA[i];
               pos = i;
            }
        }
        
        for (int j = 0; j < 10; j++) {
            if(arregloA[j] == mayorValor){
                repeticiones++;
            }
        }
        System.out.println("El mayor valor es: " + mayorValor + " y se repite: " + repeticiones + " veces.");
    }
    
}
