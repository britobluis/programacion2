/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_agregacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class Clase030418_agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zona de declaracion de variables
        Fecha f1 = new Fecha(3,4,2018);
        Comprobante c1 = new Comprobante('S', 555, f1);
        Cliente cliente1 = new Cliente(222, "Pepe"); 
        Producto p1 = new Producto(777, "Guantes", 200);
        Factura fact1 = new Factura(210, cliente1, p1, 'B', 888, f1);
        
        //Zona de impresion
        JOptionPane.showMessageDialog(null, 
                "Fecha: " + fact1.getFecha().getDia() +"/"+ fact1.getFecha().getMes() +"/"+ fact1.getFecha().getAnio() 
                + "\nFactura: " + fact1.getNumero() 
                + "\nComprobante: " + fact1.getNumero() + " Tipo: " + fact1.getTipo()
                + "\nCliente: " + fact1.getCliente().getRazonSocial() 
                + "\nProducto: " + fact1.getProducto().getDescripcion()
                + "\nPrecio: " + fact1.getProducto().getPrecio()
                );
        
    }
    
}
