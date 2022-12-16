/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeo;

/**
 *
 * @author USUARIO
 */
public class Auto {
    private String modelo;
    private int year;
    private String placa;

    public Auto(String modelo, int year, String placa) {
        this.modelo = modelo;
        this.year = year;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", year=" + year + ", placa=" + placa + '}';
    }

    
    
    
}
