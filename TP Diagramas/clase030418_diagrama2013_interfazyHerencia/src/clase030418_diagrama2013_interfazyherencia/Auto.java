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
public class Auto implements Motor {

    @Override
    public String Tipo() {
        return "Motor encendido";
    }

    @Override
    public int numerodeRuedas() {
       return 4;
    }
      
    
}
