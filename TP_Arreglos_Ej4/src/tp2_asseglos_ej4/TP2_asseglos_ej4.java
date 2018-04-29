
package tp2_asseglos_ej4;

import java.util.Scanner;


public class TP2_asseglos_ej4 {

   
    public static void main(String[] args) {
        
        int[] numero = new int[10];
        int pos=0;
      
        
        int aux = 0;
    
        for (int i = 0; i < numero.length; i++) {
            aux = 0;
            System.out.println("ingrese un numero");
            Scanner entrada = new Scanner(System.in);
            numero[i] = Integer.parseInt(entrada.nextLine());
            aux = numero[i]; 
                while(aux>10){
                    aux = aux%10;
                    }
                if (aux == 4) {
                    System.out.println("el numero "+numero[i]+" esta en la posicion"+i);
              }
        }  
        
        
    } 
    
}
    

