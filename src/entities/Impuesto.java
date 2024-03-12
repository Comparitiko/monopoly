package entities;

public class Impuesto extends CasillaEspecial {

    public Impuesto(String nombre, Integer cantidad) {
        super(nombre, cantidad);
    }

    @Override
    public String toString() {
        return "Impuesto{" +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", jugador=" + jugadores +
                '}';
    }

    @Override
    public void accion(Jugador jugador) {
        jugador.setDinero(jugador.getDinero() + (this.cantidad * this.impuesto));
    }
}
