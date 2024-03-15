package entities;

public class Impuesto extends CasillaEspecial {
    // Constructor
    public Impuesto(Integer numero, String nombre, Double cantidad) {
        super(nombre, numero, cantidad);
    }

    // Methods
    @Override
    public void accion(Jugador jugador) {
        jugador.setDinero(jugador.getDinero() - this.cantidad);
    }
}
