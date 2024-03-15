package entities;

public class Impuesto extends CasillaEspecial {
    // Constructor
    public Impuesto(String nombre, Double cantidad) {
        super(nombre, cantidad);
    }

    // Methods
    @Override
    public void accion(Jugador jugador) {
        jugador.setDinero(jugador.getDinero() - this.cantidad);
    }
}
