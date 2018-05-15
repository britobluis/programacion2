/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_2010_diagrama.de.clases;

import java.util.Vector;

/**
 *
 * @author Luis Brito
 */
public class Contacto extends Persona{
    private int idContacto;
    private ContactoTipo tipo;
    private Vector<ContactoDomicilio> domicilios;
    private Vector<ContactoTelefono> telefonos;

    public Contacto(int idContacto, ContactoTipo tipo, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public Vector<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }

    public void addDomicilio(ContactoDomicilio domicilio) {
        this.domicilios.add(domicilio);
    }

    public Vector<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefono(ContactoTelefono telefono) {
        this.telefonos.add(telefono);
    }
    
    
    
}
