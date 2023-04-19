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
public class Guerrero extends Personaje{
     private boolean caballo;

    public Guerrero(Position ubicacion, String nick) {
        super(ubicacion, nick);
        caballo = true;
    }
    
     @Override
     public void avanzar(){
         if(caballo){
             for (int i = 0; i < 10; i++) {
                 super.avanzar();
             }
        
        System.out.println("Avanzando a (" + super.getUbicacion().getX() + "," + super.getUbicacion().getY() + ")");
        }else{
             super.avanzar();
        }
     }
     
     @Override
     public void disparar(){ 
        if (super.getEnergia() >= 10) {
            super.setEnergia(super.getEnergia()-10);
            System.out.println("¡Bang! Energía restante: " + super.getEnergia());
            if (super.getEnergia() < 30) {
                caballo = false;
                System.out.println("Perdiendo caballo por falta de energía.");
            }
        } else {
            System.out.println("Sin energía para disparar.");
        }
    
     }
     
     
     
}

