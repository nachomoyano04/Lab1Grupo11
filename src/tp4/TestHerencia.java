/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author nacho
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Guerrero thor = new Guerrero(new Position(100, 200), "Thor");
        
        while (thor.getOrientacion() != 'O') {
            thor.girar();
        }
        for (int i = 0; i < 5; i++) {
            thor.avanzar();
        }
        for (int i = 0; i < 8; i++) {
            thor.disparar();
        }

    }

}