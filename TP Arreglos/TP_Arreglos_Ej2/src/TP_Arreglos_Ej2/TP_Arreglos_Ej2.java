
package TP_Arreglos_Ej2;

import java.util.Scanner;

public class TP_Arreglos_Ej2 {

    public static void main(String[] args) {
        
        int[]numero = new int[10];
        int numeroMayor = 0; 
        int posicionMayor = 0;
        int contador;
      
        for (int i = 0; i < numero.length; i++) {
            System.out.println("ingrese un numero en la posicion : "+i);
            Scanner entrada = new Scanner(System.in);
            numero[i] = Integer.parseInt(entrada.nextLine());
            contador = 0;
            for (int j = 1; j <= numero[i]; j++) {
                if ((numero[i]%j)== 0) {
                   contador ++; 
                }
            }
            if (contador <=2) {
                if (numeroMayor < numero[i]) {
                    numeroMayor = numero[i];
                    posicionMayor = i;
                }
            }
        }
    System.out.println("numero primo mayor: "+numeroMayor+" y la posicion es "+posicionMayor);  
    }   
}
