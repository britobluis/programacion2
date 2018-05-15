/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_finalnov14;

/**
 *
 * @author Luis Brito
 */
public class Cliente extends Persona {
    public Tarjeta_de_Credito credit_Car;

    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
    }

    @Override
    public long getCuit() {
        return this.cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    

    public Tarjeta_de_Credito getCredit_Car() {
        return credit_Car;
    }

    public void setCredit_Car(Tarjeta_de_Credito credit_Car) {
        this.credit_Car = credit_Car;
    }
    
    
}
