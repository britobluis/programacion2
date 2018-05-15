/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_diagrama2013_interfazyherencia;

/**
 *
 * @author Luis Brito
 */
public class Clase030418_diagrama2013_interfazyHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zona de declaracion de variables
        Bicicleta b1 = new Bicicleta(2, "Pepe");
        System.out.println("La Bicicleta tiene: " + b1.getRuedas() + " ruedas. Es de: " + b1.getDuenio() + ". Vale: " + b1.Precio() + ". Velocidad Maxima: " + b1.Velocidad_Maxima());
        
      
        
        Moto m1 = new Moto(2, "Juan");
        System.out.println("La Moto tiene: " + m1.getRuedas() + " ruedas. Es de: " + m1.getDuenio() + ". Vale: " + m1.Precio() + ". Velocidad Maxima: " + m1.Velocidad_Maxima());
    }
    
}
