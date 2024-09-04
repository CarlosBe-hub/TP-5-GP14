/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg5.gp14;

import java.util.ArrayList;
import java.util.Set;

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

       
        directorio.agregarContacto(2665111683L, new Contacto(123, "Juan", "Perez", "Madrid", "Calle Falsa 123"));
        directorio.agregarContacto(2664003380L, new Contacto(456, "Ana", "Gómez", "Barcelona", "Avenida Siempre Viva 742"));
        directorio.agregarContacto(2664020595L, new Contacto(789, "Luis", "Suarez", "Madrid", "Plaza Mayor 1"));
        directorio.agregarContacto(2665147758L, new Contacto(852, "María", "Lopez", "Valencia", "Calle del Sol 5"));

        
        Contacto contacto = directorio.buscarContacto(2665111683L);

        if(contacto != null){
                System.out.println("Se encontro el siguente contacto: " + contacto.getNombre()+ " " + contacto.getApellido());
            }else{
                System.out.println("No se encontro el contacto ingresado..");
            }

        
        Set<Long> telefonos =directorio.buscarTelefono("Lopez");

        System.out.println("Se encontro el siguiente telefono asociado al apellido Lopez: " + telefonos);


        
        ArrayList<Contacto> contactoCiudad = directorio.buscarContactos("Madrid");
        System.out.println("Contactos en Madrid");

        for(Contacto contactos : contactoCiudad){
            System.out.println(contactos.getNombre() + " " + contactos.getApellido());
        }

        
        directorio.borrarContacto(2665147758L);

        System.out.println("el contacto se elimino con exito!");

    }
} 
    
    

