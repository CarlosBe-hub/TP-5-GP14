/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.gp14;

import JFrame.Agendadecontactos;
import JFrame.Directorioprincipal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author aguse
 */
public class Directorio {
    private TreeMap<Long, Contacto> contactos;
    private ArrayList<Contacto> listaContactos;
    private  TreeSet<Long> numeros;

    public Directorio() {
        contactos = new TreeMap<>();
        listaContactos = new ArrayList<>();
        numeros = new TreeSet<>();
    }
    
    public static void agregarContacto(Long telefono, Contacto contacto){
        
        Directorioprincipal.contactos.put(telefono, contacto);
        
    }
    
    public Contacto buscarContacto(Long telefono){
        
        return Directorioprincipal.contactos.get(telefono);
        
    }
    
    
    public Set<Long> buscarTelefono(String apellido){
      
       Iterator<Long> iterator = Directorioprincipal.contactos.keySet().iterator();

       while(iterator.hasNext()){
       Long telefono = iterator.next();
       if(Directorioprincipal.contactos.get(telefono).getApellido().equalsIgnoreCase(apellido))
           numeros.add(telefono);
       }
       return numeros;
    }


    public ArrayList<Contacto> buscarContactos(String ciudad){
        Iterator<Contacto> iterator = Directorioprincipal.contactos.values().iterator();
        while(iterator.hasNext()    ){
        Contacto contacto = iterator.next();
            if(contacto.getCiudad().equalsIgnoreCase(ciudad))
                listaContactos.add(contacto);
        }
        return listaContactos;
        }


    public static void borrarContacto(Long telefono){

        Directorioprincipal.contactos.remove(telefono);
    }
    
    public Contacto buscarDni(int dni) {
        for (Contacto c : Directorioprincipal.contactos.values()) {
            if (c.getDni() == dni) {
                return c;
            }
        }
        return null;
    }
    
    public Contacto buscarNombre(String nombre) {
    for (Contacto c : contactos.values()) {
        if (c.getNombre().equalsIgnoreCase(nombre)) {
            return c;
        }
    }
    return null;
    }
    
    public Long getTelefono(Contacto c) {
    for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
        if (entry.getValue().equals(c)) {
            return entry.getKey();
        }
    }
    return null;
    }

}

    
    
    
    