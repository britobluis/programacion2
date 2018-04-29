
package tp2_arrglos_ej2;

import java.util.Scanner;


public class TP2_Arrglos_ej2 {

    
    public static void main(String[] args) {
        
        int[ ] numero = new int[10];
        int numeroPrimo = 0;
        int numeroMayor = 0; 
        int posicionMayor = 0;
        
        for (int i = 0; i < numero.length; i++) {
            numeroPrimo = 0;
            System.out.println("ingrese un numeroven la posicion del arreglo: "+i);
            Scanner entrada = new Scanner(System.in);
            numero[i] = Integer.parseInt(entrada.nextLine());
            
            while (numero[i]%2==0) {
                numeroPrimo = numero[i];
            }
                if (numeroMayor < numeroPrimo) {
                numeroMayor = numeroPrimo;
            }
        }
        for (int j = 0; j < numero.length; j++) {
            System.out.println("numero :"+numero[j]);   
        }
        System.out.println("numero mayor: "+numeroMayor+" y la posicion es"+posicionMayor);  
    }
    
}
