/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.appcasa;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Casa {
     private String direccion;
     private List<Persona> habitantes;

     public Casa(String direccion) {
         this.direccion = direccion;
         this.habitantes = new ArrayList<>();
     }

    public void agregarHabitante(Persona persona) {
           habitantes.add(persona);
    }
    
    
    public String getDireccion() {
        return direccion;
    }
    public List<Persona> getHabitantes() {
        return habitantes;
    }
}

