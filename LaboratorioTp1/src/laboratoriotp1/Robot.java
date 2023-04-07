/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriotp1;

/**
 *
 * @author Isma
 */
// Clase Robot
public class Robot {

    private boolean despierto;
    private Bateria bateria;

    public Robot() {
        despierto = false;
        bateria = new Bateria(1000);
    }

    public void avanzar(int pasos) {
        if ((despierto) && ((pasos * 10 / 100) <= bateria.getCarga()) && pasos > 10) {
            bateria.setCarga((bateria.getCarga()) - ((pasos * 10) / 100));
            System.out.println("Avanzó " + pasos + " pasos y gastó " + pasos * 10 / 100 + " de energía");
        } else if (!despierto) {
            System.out.println("No puedo avanzar. Eessttoy ddoorrmiiddoo zzz");
        } else if (bateria.getCarga() <= 0) {
            System.out.println("Tengo 0 energía :(   Recargar energía!");
        } else if (pasos * 10 / 100 > bateria.getCarga()) {
            System.out.println("No tengo la energía suficiente para avanzar esa cantidad de pasos.");
            System.out.println("Solo puedo avanzar: " + bateria.getCarga() * 10000 / 1000);
        }

    }

    public void retroceder(int pasos) {
        if ((despierto) && ((pasos * 10 / 100) <= bateria.getCarga())) {
            bateria.setCarga((bateria.getCarga()) - ((pasos * 10) / 100));
            System.out.println("Retrocedió " + pasos + " pasos y gastó " + pasos * 10 / 100 + " de energía");
        } else if (!despierto) {
            System.out.println("No puedo retroceder. Eessttoy ddoorrmiiddoo zzz");
        } else if (bateria.getCarga() <= 0) {
            System.out.println("Tengo 0 energía :(   Recargar energía!");
        } else if (pasos * 10 / 100 > bateria.getCarga()) {
            System.out.println("No tengo la energía suficiente para retroceder esa cantidad de pasos.");
            System.out.println("Solo puedo retroceder: " + bateria.getCarga() * 10000 / 1000);
        }
    }

    public void dormir() {
        System.out.println("Chau!...Zzz");
        despierto = false;
    }

    public void despertar() {
        System.out.println("Estoy despierto!");
        despierto = true;
    }

    public void recargar() {
        bateria.setCarga(1000);
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean isDespierto() {
        return despierto;
    }
}
