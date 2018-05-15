
package tp_arreglos_ej3;


public class TP_Arreglos_Ej3 {


    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
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
                    primeNumbers[counter2] = i;
                    counter2++;
                }
            }
        }
        System.out.println("Los primeros 10 numeros primos entre 100 y 300 son:");
        for (int k = 0; k < primeNumbers.length; k++) {
            System.out.println(primeNumbers[k]);
        }
    }
}
