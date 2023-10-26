/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class Sistema {
    ArrayList<Postulante> listaPostulantes = new ArrayList<Postulante>();
    
    public static Postulante altaPosulante(String teléfono, String mail, String linkedin, String nombre, String cédula, String dirección){
        return new Postulante(teléfono, mail, linkedin, nombre, cédula, dirección);
    }
    
    public ArrayList<Postulante> agregarPostulante(Postulante postulante){ //Esto quizá pueda hacerse al agregar postulante. Habría que evaluar si es conveniente
        listaPostulantes.add(postulante);
        return listaPostulantes;
    }
    
    public ArrayList<Postulante> getListaPostulantes() {
        return listaPostulantes;
    }
}
