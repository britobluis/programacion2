/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase240418_tp_arreglos_ej1_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class Clase240418_TP_Arreglos_Ej1_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arregloA = new ArrayList();
        int pos = 0;
        int mayorValor = 0;
        
        for (int i = 0; i < 10; i++) {
            arregloA.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero")));
            System.out.println(arregloA);
        }
        
        for (int j = 0; j < arregloA.size(); j++) {
            if(arregloA.get(j) > mayorValor){
                mayorValor = arregloA.get(j);
                pos = j;
            }
        }
        System.out.println("El mayor valor es: " + mayorValor + " y se encuentra en la posicion: " + pos);
    }
    
}
