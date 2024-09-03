/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.gp14;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

/**
 *
 * @author aguse
 */
public class Directorio {
    private final  TreeMap<Long, Contacto> contactos;

    public Directorio() {
        contactos = new TreeMap<>();
    }
    
    public void agregarContacto(Long telefono, Contacto contacto){
        
        contactos.put(telefono, contacto);
        
    }
    
    public Contacto buscarContacto(Long telefono){
        
        return contactos.get(telefono);
        
    }
    
    public Set<Long> buscarTelefono(String apellido){
       Set<Long> numeros = new HashSet<>();
        
        for(Long telefono : contactos.keySet()){
            if(contactos.get(telefono).getApellido().equalsIgnoreCase(apellido))
                numeros.add(telefono);
        }
        return numeros;
    }

    
    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        
        for(Contacto contacto : contactos.values()){
            if(contacto.getCiudad().equalsIgnoreCase(ciudad))
                listaContactos.add(contacto);
        }
        return listaContactos;
    
    }
    
    public void borrarContacto(Long telefono){
        contactos.remove(telefono);
    }
}
