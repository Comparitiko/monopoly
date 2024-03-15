package entities;

public class Impuesto extends CasillaEspecial {
    // Constructor
    public Impuesto(Integer numero, String nombre, Double cantidad) {
        super(nombre, numero, cantidad);
    }

    // Methods
    @Override
    public void accion(Jugador jugador) {
        System.out.println("El jugador " + jugador.getNombre() + " ha pagado un impuesto de " + this.cantidad + "€");
        jugador.setDinero(jugador.getDinero() + this.cantidad);
    }
}
