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
public class Position {
    private int x;
    private int y;
    
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void sumarX(int x){
        this.x += x;
    }
    public void sumarY(int y){
        this.y += y;
    }
    public void restarX(int x){
        this.x -= x;
    }
    public void restarY(int y){
        this.y -= y;
    }
   
        
}
