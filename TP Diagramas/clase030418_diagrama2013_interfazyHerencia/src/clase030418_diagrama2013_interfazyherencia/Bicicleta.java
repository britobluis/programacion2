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
public class Bicicleta extends Vehiculo {

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double Precio() {
       return 5000;
    }

    @Override
    public double Velocidad_Maxima() {
       return 35;
    }

    @Override
    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }    
    
}
