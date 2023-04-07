package tpcarreramortal;

import java.util.ArrayList;

public class Auto {

    private String color;

    private String patente;

    private double combustible;

    private Rueda rueda [] = new Rueda[4];

    public Auto(String color, String patente, Rueda rueda[]) {
        combustible = 50;
        this.rueda = rueda;
    }

    public void avanzar(int metros) {
        if(combustible>0){
            System.out.println("Avanzó "+metros+" metros.");
            combustible = combustible-(metros/10);
            System.out.println(" Combustible: "+combustible);
        }else{
            System.out.println("No hay combustible suficiente");
        }
    }

    public void retroceder(int metros) {
        if(combustible>0){
            System.out.println("Retrocedió "+metros+" metros.");
            combustible = combustible-(metros/10);
            System.out.println(" Combustible: "+combustible);
        }else{
            System.out.println("No hay combustible suficiente");
        }

    }

    public void llenarTanque() {
        combustible = 50;
        System.out.println("Combustible: "+combustible);
    }
}
