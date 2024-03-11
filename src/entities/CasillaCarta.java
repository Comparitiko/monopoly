package entities;

public class CasillaCarta extends CasillaEspecial {
  // Props
  private Carta carta;

  // Constructor
  public CasillaCarta(String nombre, Integer numero, Integer cantidad, Carta carta) {
    super(nombre, numero, cantidad);
    this.carta = carta;
  }
}
