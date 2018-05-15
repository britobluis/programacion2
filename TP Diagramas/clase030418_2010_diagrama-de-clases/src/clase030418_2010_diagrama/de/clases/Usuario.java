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
public class Usuario extends Persona {
    private int idUsuario;
    private String usuario;
    private String password;
    private Vector<Contacto> contactos;

    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Vector<Contacto> getContactos() {
        return contactos;
    }

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
    
    
    
    
}
