
package tp_arreglos_ej5_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TP_Arreglos_Ej5_ArrayList {


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
