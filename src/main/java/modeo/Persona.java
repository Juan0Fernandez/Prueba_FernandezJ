/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeo;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    private String estadoCivil;
    private Boolean vi;

    public Persona(String nombre, int edad, String estadoCivil, Boolean vi) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.vi = vi;
    }

    
     public Persona() {
    }

    public Boolean getVi() {
        return vi;
    }

    public void setVi(Boolean vi) {
        this.vi = vi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", vi=" + vi + '}';
    }

    
    
   
}
