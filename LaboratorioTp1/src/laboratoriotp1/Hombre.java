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
// Clase Hombre
public class Hombre {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Metodo jugarConRobot para Ejercicio normal
//    public void jugarConRobot(Robot robot){
//        robot.despertar();
//        robot.avanzar(500);
//        robot.retroceder(20);
//        System.out.println("El robot tiene: "+robot.energiaActual()+" energía.");
//        robot.dormir();
//    }

    //Metodo jugarConRobot para EJERCICIO EXTRA
    public void jugarConRobot(Robot robot, int pasos) {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1) Avanzar " + pasos + " pasos");
        System.out.println("2) Retroceder " + pasos + " pasos");
        System.out.println("3) Despertar robot");
        System.out.println("4) Dormir robot");
        System.out.print("Respuesta: ");
        int r;
        do {
            r = leer.nextInt();
            switch (r) {
                case 1:
                    robot.avanzar(pasos);
                    break;
                case 2:
                    robot.retroceder(pasos);
                    break;
                case 3:
                    robot.despertar();
                    break;
                case 4:
                    robot.dormir();
                    break;
                default:
                    System.out.println("Dato incorrecto");
            }
        } while (!(r == 4));

    }
}
