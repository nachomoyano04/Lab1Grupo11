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
public class RelojLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Reloj
        Reloj miReloj = new Reloj("Lunes", "12:00", "Casio", 12345);

        // Imprimir los valores iniciales del reloj
        System.out.println("Día: " + miReloj.getDia());
        System.out.println("Hora: " + miReloj.getHora());
        System.out.println("Modelo: " + miReloj.getModelo());
        System.out.println("Número de serie: " + miReloj.getNumSerie());

        // Incrementar el día del reloj y imprimir el nuevo valor
        miReloj.incrementarDia();
        System.out.println("Día actualizado: " + miReloj.getDia());
    }
    
}
