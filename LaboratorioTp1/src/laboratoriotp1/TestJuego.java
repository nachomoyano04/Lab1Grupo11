/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriotp1;

import java.util.Scanner;

/**
 *
 * @author Isma
 */
public class TestJuego {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //EJERCICIO 1
//        Robot buzzLightYear = new Robot();//punto a)
//        Hombre nacho = new Hombre();// punto b)
//        nacho.jugarConRobot(buzzLightYear);// punto c)
//        Hombre andy = new Hombre();//punto d)
//        andy.jugarConRobot(buzzLightYear);//punto e)
        //EJERCICIO EXTRA
        Robot ceiborg = new Robot();
        Hombre nacho = new Hombre();
        int resp;
        do {
            System.out.print("Pasos(min:10): ");
            resp = leer.nextInt();
        } while (resp < 10);
        nacho.jugarConRobot(ceiborg, resp);
    }
}
