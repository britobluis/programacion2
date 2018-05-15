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
public class Moto extends Vehiculo implements Motor {

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double Precio() {
        return 30000;
    }

    @Override
    public double Velocidad_Maxima() {
        return 170;
    }

    @Override
    public String Tipo() {
        return "Motor chico";
    }

    @Override
    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public int numerodeRuedas() {
       return 2;
    }

}
