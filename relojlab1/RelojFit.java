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
public class RelojFit extends Reloj {
    private int cuentaPasos;
    private double frecuencia;

    public RelojFit(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        cuentaPasos = 0;
        frecuencia = 0.0;
    }

    RelojFit(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cuentaPasos(double x, double y) {
        cuentaPasos++;
        // lógica para contar los pasos en base a la coordenada x y y
    }

    public void frecuenciaAleatoria() {
        frecuencia = Math.random() * 200 + 50; // frecuencia aleatoria entre 50 y 250 Hz
    }

    public void mostrarCuentaPasos() {
        System.out.printf("Cuenta de pasos: %d\n", cuentaPasos);
    }

    public void mostrarFrecuencia() {
        System.out.printf("Frecuencia: %.2f Hz\n", frecuencia);
    }
}
