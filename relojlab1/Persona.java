/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojlab1;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void mostrarHora() {
        System.out.println(nombre + " tiene la hora " + reloj.getHora());
    }
}

