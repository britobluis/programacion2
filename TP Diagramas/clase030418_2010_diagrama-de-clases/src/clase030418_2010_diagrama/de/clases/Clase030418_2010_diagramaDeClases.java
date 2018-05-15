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
public class Clase030418_2010_diagramaDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia contacto tipo, domicilios y telefonos
        ContactoTipo ct1 = new ContactoTipo(77, "Favorito");
        ContactoDomicilio dom1 = new ContactoDomicilio(66, "Avenida San Martin");
        ContactoDomicilio dom2 = new ContactoDomicilio(77, "Avenida Las Heras");
        ContactoTelefono tel = new ContactoTelefono(99, "15", "2611234567");
        ContactoTelefono tel2 = new ContactoTelefono(99, "15", "5555555555");
        //Instancia un contacto y un usuario
        Vector<Contacto> contactos = new Vector<Contacto>();
        Vector<ContactoDomicilio> domicilios = new Vector<ContactoDomicilio>();
        Vector<ContactoTelefono> telefonos = new Vector<ContactoTelefono>();
        Contacto contacto1 = new Contacto(1, ct1, "Pepe", "Perez", 2);
        Usuario usuario1 = new Usuario(55, "maria123", "123456", "Maria", "Moron", 156);
        //Agrega un contacto a un usuario
        usuario1.addContacto(contacto1);
        //Agrega domicilios y telefonos a un contacto
        contacto1.addDomicilio(dom1);
        contacto1.addDomicilio(dom2);
        contacto1.addTelefono(tel);
        contacto1.addTelefono(tel2);
        //Muestra contacto
        System.out.println("Contacto: " + contacto1.getNombre() + " " + contacto1.getApellido());
        System.out.println("Telefonos: " + contacto1.getTelefonos().get(0).getNumero() + " / " + contacto1.getTelefonos().get(1).getNumero());
        System.out.println("Domicilios: " + contacto1.getDomicilios().get(0).getIdContactoDomicilio() + " " + contacto1.getDomicilios().get(0).getDescripcion()
                                        + " / " + contacto1.getDomicilios().get(1).getIdContactoDomicilio() + " " + contacto1.getDomicilios().get(1).getDescripcion());
        //Muestra usuario y su contacto agregado
        System.out.println("Usuario: " + usuario1.getNombre() + " " + usuario1.getApellido() + " / ID: " + usuario1.getIdUsuario() +
                "\nTiene como amigo a: " + usuario1.getContactos().get(0).getNombre() + " " + usuario1.getContactos().get(0).getApellido());
        
        
    }
    
}
