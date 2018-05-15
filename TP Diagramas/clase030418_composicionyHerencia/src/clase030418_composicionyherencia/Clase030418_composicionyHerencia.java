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
public class Clase030418_composicionyHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crea un objeto Recibo que tiene acceso a todo lo demas
        Recibo r1 = new Recibo(1500, "50xS", 's', 222);
        System.out.println("El numero de recibo es: " + r1.getNumero());
        System.out.println("La Fecha inicial del recibo es: " + r1.getFecha().getDia() + "/" + r1.getFecha().getMes() + "/" + r1.getFecha().getAnio());
        r1.getFecha().setAnio(2018);
        r1.getFecha().setMes(4); 
        r1.getFecha().setDia(3);
        System.out.println("La nueva fecha del recibo es: " + r1.getFecha().getDia() + "/" + r1.getFecha().getMes() + "/" + r1.getFecha().getAnio());
        System.out.println("El codigo del proveedor es: " + r1.getProveedor().getCodigo());
        r1.getProveedor().setRazonSocial("Pepsi");
        System.out.println("La razon social del proveedor es: " + r1.getProveedor().getRazonSocial());
    }
    
}
