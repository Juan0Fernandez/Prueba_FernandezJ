/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.PersonaServiciolmpl;
import java.time.LocalDate;
import java.util.List;
import modeo.Persona;

/**
 *
 * @author USUARIO
 */
public class PersonaControl {
   private PersonaServiciolmpl personaServiciolmpl;    

    public PersonaControl() {
        
        personaServiciolmpl= new PersonaServiciolmpl();
    }
     public void crear(String [] data){
       
        var nombre=data[0];
        var edad=Integer.valueOf(data[1]);
        var estadociv=data[2];
        var vi=Boolean.FALSE;
       
        
        
        var persona= new Persona(nombre,edad,estadociv,vi);
        
        this.personaServiciolmpl.crear(persona);
    }
    
    public List<Persona> listar(){
        return this.personaServiciolmpl.listar();
    }
}
