package tpcarreramortal;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nacho
 */
public class TPCarreraMortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda[] ruedas = new Rueda[4];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = new Rueda("Rueda " + (i + 1));
            ruedas[i].inflar();
        }
        mostrarPresion(ruedas);
        Auto a = new Auto("Azul", "AG 433 ZZ", ruedas);
        ruedas[0].pinchar();
        ruedas[1].inflar();
        ruedas[2].desinflar();
        mostrarPresion(ruedas);
        a.avanzar(20);
        a.retroceder(20); 
        a.retroceder(60); 
        a.retroceder(40);
        a.avanzar(10);
        a.avanzar(15);
        a.avanzar(330);
        a.retroceder(10);
        a.retroceder(10);
        a.llenarTanque();

    }
    public static void mostrarPresion(Rueda[] ruedas){
        for (int i = 0; i < ruedas.length; i++) {
            System.out.println(ruedas[i].getPresion());
        }
    }
}
