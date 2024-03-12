package entities;

public class Carcel extends CasillaEspecial {
  // Props
  private Integer turnosSinTirar;

  // Constructor
  public Carcel(String nombre, Integer cantidad) {
    super(nombre, cantidad);
    this.turnosSinTirar = 1;
  }

  public Integer getTurnosSinTirar() {
    return turnosSinTirar;
  }

  public void setTurnosSinTirar(Integer turnosSinTirar) {
    this.turnosSinTirar = turnosSinTirar;
  }

  @Override
  public String toString() {
    return "Carcel{" +
            "turnosSinTirar=" + turnosSinTirar +
            ", cantidad=" + cantidad +
            ", nombre='" + nombre + '\'' +
            ", numero=" + numero +
            ", jugador=" + jugadores +
            '}';
  }
}
