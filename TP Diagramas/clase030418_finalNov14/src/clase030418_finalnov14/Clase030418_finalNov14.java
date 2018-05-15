/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase030418_finalnov14;

import java.util.Date;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Brito
 */
public class Clase030418_finalNov14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de Tarjeta de credito
        Date fechaTarjeta1 = new Date();
        //Dar mejor formato a fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Tarjeta_de_Credito tarjeta1 = new Tarjeta_de_Credito(fechaTarjeta1, 35000);
        
        System.out.println("El numero de la tarjeta es: $" + tarjeta1.getLimite() + " y fue creada el: " + sdf.format(tarjeta1.getFecha_Ingreso()));
        
        
        Cliente cliente1 = new Cliente(1234567, "Pepe", "Perez", 1234567891011L);
        //Agrega una tarjeta de credito a cliente1
        cliente1.setCredit_Car(tarjeta1);
        
        System.out.println("El cliente: " + cliente1.getNombre() + " " + cliente1.getApellido() + " DNI: " + cliente1.getDni() + " CUIT: " + cliente1.getCuit() 
                + "\nTiene una tarjeta de credito con un limite de: $" + cliente1.getCredit_Car().getLimite()
                + " y fue creada el: " + sdf.format(cliente1.getCredit_Car().getFecha_Ingreso()));
        
        //Crea un empleado
        Date fechaIngresoEmpleado1 = new Date();
        Empleado empleado1 = new Empleado(fechaIngresoEmpleado1, 55555, 31548969, "Ramon", "Rodriguez", 789456123789L);
        
        //Crea un factura
        Date fechaVenta1 = new Date();
        Factura facturaVenta1 = new Factura(empleado1, cliente1, 777, fechaVenta1, 25000);
        
        JOptionPane.showMessageDialog(null, "Factura Nro: " + facturaVenta1.getNro_Factura() + "   Fecha: " + sdf.format(facturaVenta1.getFecha()) 
                + "\nVendedor: " + facturaVenta1.getEmp().getNombre() + " " + facturaVenta1.getEmp().getApellido() + "   Legajo: " + facturaVenta1.getEmp().getNro_Legajo() 
                + "\nCliente: " + facturaVenta1.getClie().getNombre() + " " + facturaVenta1.getClie().getApellido() + "   DNI: " + facturaVenta1.getClie().getDni() 
                + "\nLimite Tarjeta de Credito: $" + facturaVenta1.getClie().getCredit_Car().getLimite() 
                + "\nMonto a pagar: $" + facturaVenta1.getMonto() + "\nPAGO ACEPTADO.");
        
        
        
    }
    
}
