/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modeo.Persona;

/**
 *
 * @author USUARIO
 */
public class PersonaServiciolmpl implements PersonaServicio {
    private List<Persona> personaList;

    public PersonaServiciolmpl() {
        personaList= new ArrayList<>();
    }

    @Override
    public void crear(Persona persona) {
        this.personaList.add(persona);
    }

    @Override
    public List<Persona> listar() {
        return this.personaList;
    }
}
