/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_composicionyherencia;

/**
 *
 * @author Luis Brito
 */
public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo(float total, String detalle, char tipo, int numero) {
        super(tipo, numero);
        this.proveedor = new Proveedor(25, "Coca-cola");
        this.total = total;
        this.detalle = detalle;
    }

    public Recibo(char tipo, int numero) {
        super(tipo, numero);
    }


    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
