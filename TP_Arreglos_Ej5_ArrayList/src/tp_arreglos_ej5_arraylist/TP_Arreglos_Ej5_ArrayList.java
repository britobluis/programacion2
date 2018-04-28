/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_arreglos_ej5_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class TP_Arreglos_Ej5_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arregloA = new ArrayList();
        int mayorValor = 0;
        int pos = 0;
        int repeticiones = 0;
        
        for (int i = 0; i < 10; i++) {
            arregloA.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero")));
            System.out.println(arregloA);
            if(arregloA.get(i) > mayorValor){
               mayorValor = arregloA.get(i);
               pos = i;
            }
        }
        
        for (int j = 0; j < 10; j++) {
            if(arregloA.get(j) == mayorValor){
                repeticiones++;
            }
        }
        System.out.println("El mayor valor es: " + mayorValor + " y se repite: " + repeticiones + " veces.");
    }
    
}
