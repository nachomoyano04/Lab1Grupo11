/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author nacho
 */
public class Tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----------------");
        int array[]={1,2,3,4,5,6,7,8,9,10};
        Arreglo.sumarLista(array);
        System.out.println("-----------------");
        int matrizIrregular[][] = {{1,2,3,4,5},{6,20,9,10},{11,12,13,123,123,123,123,123}};
        System.out.println("El numero mayor del arreglo irregular es: "+Arreglo.numeroMayor(matrizIrregular));
        System.out.println("-----------------");
        System.out.println("La cantidad de vocales de la palabra es de: "+Arreglo.cuentaVocales("Irregular"));
        System.out.println("-----------------");
        int valor = Arreglo.cuentaCaracter("ORnitorrinco", 'R');
        System.out.println("La cantidad de caracteres iguales a la letra son: "+valor);
    }
    
}
