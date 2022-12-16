/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modeo.Persona;

/**
 *
 * @author USUARIO
 */
public interface PersonaServicio  {
    public void crear (Persona persona);
    public List<Persona> listar();
}
