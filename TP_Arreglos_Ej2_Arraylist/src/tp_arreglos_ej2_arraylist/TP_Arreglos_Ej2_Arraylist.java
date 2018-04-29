
package tp_arreglos_ej2_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TP_Arreglos_Ej2_Arraylist {

   
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        int numeroMayor = 0; 
        int posicionMayor = 0;
        int contador;
      
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un numero en la posicion : "+i);
            Scanner entrada = new Scanner(System.in);
            numero.add(i,Integer.parseInt(entrada.nextLine()));
            
            contador = 0;
            for (int j = 1; j <= numero.get(i); j++) {
                if ((numero.get(i)%j)== 0) {
                  contador ++; 
               }
            }
            if (contador <=2) {
                if (numeroMayor < numero.get(i)) {
                    numeroMayor = numero.get(i);
                    posicionMayor = i;
               }
           }
        }
    System.out.println("numero primo mayor: "+numeroMayor+" y la posicion es "+posicionMayor);  
     
    } 
}
