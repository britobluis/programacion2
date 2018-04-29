
package tp_arreglos_ej4_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class TP_Arreglos_Ej4_ArrayList {

    
    public static void main(String[] args) {
        
        ArrayList<Integer> numero = new ArrayList<>();
        int aux = 0;
    
        for (int i = 0; i < 10; i++) {
            aux = 0;
            System.out.println("ingrese un numero");
            Scanner entrada = new Scanner(System.in);
            numero.add(i,Integer.parseInt(entrada.nextLine()));
   
        }    
        for (int i = 0; i < 10; i++) {
            aux = numero.get(i); 
                while(aux > 10){
                    aux = aux%10;
                }
                    if (aux == 4) {
                    System.out.println("El numero terminado en 4: "+numero.get(i)+" esta en la posicion: "+i);            
                    }      
        }   
    }
}
