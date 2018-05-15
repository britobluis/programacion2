/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_2010_diagrama.de.clases;

/**
 *
 * @author Luis Brito
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(String nombre, String apellido, int idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
