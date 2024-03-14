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
  public void accion(Jugador jugador) {
    Carta carta = this.cartas.getFirst();
    jugador.setDinero(jugador.getDinero() + carta.getCantidad());
    System.out.println("Te ha tocado la carta: " + carta.getTexto() + "Tu dinero ahora es: " + jugador.getDinero());
    }
  }
}
