package herenciafamiliar;

public abstract class Padre {

    private String nombre;

    protected String apellido;

    private Casa casa;

    private Auto auto;

    public Padre() {
        nombre = "Papá";
        apellido = "Lopez";
        casa = new Casa("centro");
        auto = new Auto("AE-678-QZ","Gris","Ford Focus");
    }

    public abstract void cantar();
}
