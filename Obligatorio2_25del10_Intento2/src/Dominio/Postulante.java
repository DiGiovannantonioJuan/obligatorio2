/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author juand
 */
public class Postulante extends Persona {
    private String teléfono;
    private String mail;
    private String linkedin;
    

    public Postulante(String teléfono, String mail, String linkedin, String nombre, String cédula, String dirección) {
        super(nombre, cédula, dirección);
        this.teléfono = teléfono;
        this.mail = mail;
        this.linkedin = linkedin;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    
}
