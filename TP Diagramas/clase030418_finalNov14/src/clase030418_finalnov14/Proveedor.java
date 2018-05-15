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
public abstract class Proveedor extends Persona implements Estado_Cuenta {
    private String nombre_Comercial;

    public Proveedor(String nombre_Comercial, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.nombre_Comercial = nombre_Comercial;
    }    
    
    @Override
    public boolean problemaVerazCodeme(){
        return true;
    }
    
}
