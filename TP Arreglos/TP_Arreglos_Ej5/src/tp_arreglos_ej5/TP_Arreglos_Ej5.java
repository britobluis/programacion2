
package tp_arreglos_ej5;

import javax.swing.JOptionPane;


public class TP_Arreglos_Ej5 {

 
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
