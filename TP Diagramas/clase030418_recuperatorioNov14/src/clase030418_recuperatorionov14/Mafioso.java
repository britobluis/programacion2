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
public class Mafioso extends Persona implements Investigable{
    private List<Lugar> lugaresFrecuentes;
    
    public void agregarLugar(Lugar lugar){
        
    }
    
    public boolean quitarLugar(Lugar lugar){
        return true;
    }
    
    @Override
    public boolean investigar() {
        return true;
    }
    
}
