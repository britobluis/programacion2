
package tp_arreglos_ej3_arraylist;

import java.util.ArrayList;


public class TP_Arreglos_Ej3_ArrayList {

    
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList();
        int i = 0;
        int num = 0;
        int counter2 = 0;
        //Empty String
        for (i = 100; i <= 300; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                if (counter2 < 10) {
                    primeNumbers.add(i);
                    counter2++;
                }
            }
        }
        System.out.println("Los primeros 10 numeros primos entre 100 y 300 son:");
        System.out.println(primeNumbers);  
    }

}
