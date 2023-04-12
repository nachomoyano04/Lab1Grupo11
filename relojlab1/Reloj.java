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
public class Reloj {

    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }
    
    public void incrementarDia() {
        // Obtener el día actual del reloj
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int indiceDia = -1;
        for (int i = 0; i < dias.length; i++) {
            if (this.dia.equals(dias[i])) {
                indiceDia = i;
                break;
            }
        }

        // Aumentar el día en 1
        indiceDia = (indiceDia + 1) % 7;

        // Actualizar el valor del día en el reloj
        this.dia = dias[indiceDia];
    }
}
