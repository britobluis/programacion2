/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_agregacion;

/**
 *
 * @author Luis Brito
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante(char tipo, int numero, Fecha fecha) {
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
    }

    public Comprobante() {
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}
