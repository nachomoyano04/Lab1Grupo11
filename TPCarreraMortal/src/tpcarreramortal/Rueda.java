package tpcarreramortal;

public class Rueda {

    private String marca;

    private double presion;

    public Rueda(String marca) {
        presion = 0;
        this.marca = marca;
    }

    public void inflar() {
        if(presion==28){
            System.out.println("La rueda ya está inflada");
        }else{
            presion = 28;
        System.out.println("Rueda inflada correctamente");
        }

    }

    public void pinchar() {
        if(presion==0){
            System.out.println("La rueda ya está pinchada");
        }else{
            presion = 0;
            System.out.println("Rueda pinchada");
        }
    }

    public void desinflar() {
        if(presion>=0.5){
           presion -=0.5;
           System.out.println("Rueda desinflada 0.5. La presión actual es: "+presion);
        }else{
            System.out.println("La rueda está totalmente desinflada");
        }
        
    }

    public double getPresion() {
        return presion;
    }
    
}
