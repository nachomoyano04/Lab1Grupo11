package herenciafamiliar;

public class JuanCa extends Padre implements Hermano, Madre {

    private String nombre;

    private String apellido;

    public JuanCa(){
        nombre = "Juan Carlos";
        apellido = super.apellido;
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Juego al fútbol como mi hermano");
    }

    @Override
    public void cantar() {
        System.out.println("Canto como mi papá");
    }

    @Override
    public void bailar() {
        System.out.println("Bailo como mi madre");
    }

    @Override
    public void darDinero() {
        System.out.println("Gracias mamá por los $400000 heredados");
    }
}
