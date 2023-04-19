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
public class Personaje {
    private Position ubicacion;
    private String nick;
    private int vidas;
    private int energia;
    private char orientacion;
    
    public Personaje(Position ubicacion, String nick){
        this.ubicacion = ubicacion;
        this.nick = nick;
        vidas = 3;
        energia = 100;
        orientacion = 'N';
    }
    
    public void disparar(){
        if(energia>=10){
            energia -=10;
            System.out.println("Disparoo. \nEnergia Restante= "+energia);
        }else{
            System.out.println("No tiene energía suficiente para ejecutar.");
        }
    }
    
    public void girar(){
        switch(orientacion){
            case 'N': orientacion = 'E';break;
            case 'E': orientacion = 'S';break;
            case 'S': orientacion = 'O';break;
            case 'O': orientacion = 'N';break;
        }
        System.out.println("El personaje giró hacia "+orientacion);
    }
    public void avanzar() {
        switch (orientacion) {
            case 'N':
                ubicacion.restarY(1);
                break;
            case 'E':
                ubicacion.sumarX(1);
                break;
            case 'S':
                ubicacion.sumarY(1);
                break;
            case 'O':
                ubicacion.restarX(1);
                break;
        }
        System.out.println("Avanzando a (" + ubicacion.getX() + "," + ubicacion.getY() + ")");
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
    
}
