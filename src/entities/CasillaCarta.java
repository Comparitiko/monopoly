package entities;

public class CasillaCarta extends CasillaEspecial {
  // Props
  private Carta carta;

  // Constructor
  public CasillaCarta(String nombre, Integer numero, Double cantidad, Carta carta) {
    super(nombre, cantidad);
    this.carta = carta;
  }

  public Carta getCarta() {
    return carta;
  }

  public void setCarta(Carta carta) {
    this.carta = carta;
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
