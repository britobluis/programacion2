/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_arreglos_ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class TP_Arreglos_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        int i = 0;
        int num = 0;
        int counter2 = 0;
        //Empty String
        for (i = 100; i <= 300; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                if (counter2 < 10) {
                    primeNumbers[counter2] = i;
                    counter2++;
                }
            }
        }
        System.out.println("Los primeros 10 numeros primos entre 100 y 300 son:");
        for (int k = 0; k < primeNumbers.length; k++) {
            System.out.println(primeNumbers[k]);
        }
    }
}
