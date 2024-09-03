/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg5.gp14;

/**
 *
 * @author carlo
 */
public class TP5GP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        
        directorio.agregarContacto(1234567890L, new Contacto("12345678A", "Juan", "Perez", "Madrid", "Calle Falsa 123"));
        directorio.agregarContacto(9876543210L, new Contacto("23456789B", "Ana", "Gómez", "Barcelona", "Avenida Siempre Viva 742"));
        directorio.agregarContacto(1928374650L, new Contacto("34567890C", "Luis", "Suarez", "Sanluis", "Plaza Mayor 1"));
        directorio.agregarContacto(5647382910L, new Contacto("45678901D", "María", "Lopez", "Valencia", "Calle del Sol 5"));

        
        System.out.println("Buscar contacto con telefono 1234567890: " + directorio.buscarContacto(1234567890L));

        
        System.out.println("Telefonos de Suarez: " + directorio.buscarTelefono("Suarez"));

        
        System.out.println("Contactos en Sanluis: " + directorio.buscarContactos("Sanluis"));

        
        directorio.borrarContacto(1234567890L);
        System.out.println("Despues de borrar, contacto con telefono 1234567890: " + directorio.buscarContacto(1234567890L));
    }
} 
    
    

