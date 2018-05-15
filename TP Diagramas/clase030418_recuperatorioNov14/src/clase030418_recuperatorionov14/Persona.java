/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_recuperatorionov14;

import java.util.List;

/**
 *
 * @author Luis Brito
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private List<MedioDeComunicacion> comunicaciones;
    private List<Perfil> pefiles;
    
    public void agregarPerfil(Perfil perfil1){
        this.pefiles.add(perfil1);
    }
    public boolean quitarPerfil(Perfil perfil1){
        return this.pefiles.remove(perfil1);
    }

    public List<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(List<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
    
    public void addComunicaciones(MedioDeComunicacion comunicacion) {
        this.comunicaciones.add(comunicacion);
    }
    
}
