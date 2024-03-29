package entities;

import java.util.ArrayList;
import java.util.Collections;

public class CasillaCarta extends CasillaEspecial {
  // Props
  ArrayList<Carta> cartas;
  // Constructor
  public CasillaCarta(Integer numero, String nombre, Double cantidad, ArrayList<Carta> cartas) {
    super(nombre, numero, cantidad);
    this.cartas = cartas;
  }

  // Methods
  @Override
  public void accion(Jugador jugador) {
    Collections.shuffle(cartas);
    Carta carta = this.cartas.getFirst();
    jugador.setDinero(jugador.getDinero() + carta.getCantidad());
    System.out.println("Te ha tocado la carta: " + carta.getTexto() + " Tu dinero ahora es: " + jugador.getDinero());
    }
}

