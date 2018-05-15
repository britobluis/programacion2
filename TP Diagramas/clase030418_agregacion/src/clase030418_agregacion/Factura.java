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
public class Factura extends Comprobante {
    private float total;
    private Cliente cliente;
    private Producto producto;

    public Factura(float total, Cliente cliente, Producto producto, char tipo, int numero, Fecha fecha) {
        super(tipo, numero, fecha);
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
