/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author juand
 */
public class Evaluador extends Persona{
    private String añoIngreso;
    
    public Evaluador(String nombre, String cédula, String dirección, String añoIngreso) {
        super(nombre, cédula, dirección);
        this.añoIngreso = añoIngreso;
    }

    public String getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
}
