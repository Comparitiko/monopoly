package entities;

import java.util.ArrayList;

public class CasillaCarta extends CasillaEspecial {
  // Props
  ArrayList<Carta> cartas;
  // Constructor
  public CasillaCarta(String nombre, Double cantidad, ArrayList<Carta> cartas) {
    super(nombre, cantidad);
    this.cartas = cartas;
  }

  // Methods
  @Override
  public String toString() {
    return "CasillaCarta{" +
            ", cantidad=" + cantidad +
            ", nombre='" + nombre + '\'' +
            ", numero=" + numero +
            ", jugador=" + jugadores +
            '}';
  }

  @Override
  public void accion(Jugador jugador) {
    Carta carta = this.cartas.getFirst();
    if (carta.getMoverte() != 0) {
      Casilla casilaAMoverse = ;
      jugador.mover();
    } else {
      jugador.setDinero(jugador.getDinero() + carta.getCantidad());
    }
  }
}
