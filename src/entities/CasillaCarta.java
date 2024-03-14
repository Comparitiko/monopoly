package entities;

import java.util.ArrayList;

public class CasillaCarta extends CasillaEspecial {
  // Props
  private static ArrayList<Carta> cartas = new ArrayList<>();

  // Constructor
  public CasillaCarta(String nombre, Integer numero, Double cantidad) {
    super(nombre, cantidad);
  }

  // Methods
  @Override
  public String toString() {
    return "CasillaCarta{" +
            "carta=" + carta +
            ", cantidad=" + cantidad +
            ", nombre='" + nombre + '\'' +
            ", numero=" + numero +
            ", jugador=" + jugadores +
            '}';
  }

  @Override
  public void accion(Jugador jugador) {

  }
}
