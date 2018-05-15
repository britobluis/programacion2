
package TP_Arreglos_Ej4;

import java.util.Scanner;

public class TP_Arreglos_Ej4 {

    public static void main(String[] args) {

        int[] numero = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            aux = 0;
            System.out.println("ingrese un numero");
            Scanner entrada = new Scanner(System.in);
            numero[i] = Integer.parseInt(entrada.nextLine());

        }
        for (int i = 0; i < 10; i++) {
            aux = numero[i];
            while (aux > 10) {
                aux = aux % 10;
            }
            if (aux == 4) {
                System.out.println("El numero terminado en 4: " + numero[i] + " esta en la posicion: " + i);
            }
        }
    }
}
    

