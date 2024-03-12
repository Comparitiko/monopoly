package entities;

public class Carcel extends Casilla {
  // Props
  private Integer turnosSinTirar;

  // Constructor
  public Carcel(String nombre) {
    super(nombre);
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
            ", nombre='" + nombre + '\'' +
            ", numero=" + numero +
            ", jugador=" + jugadores +
            '}';
  }

  @Override
  public void accion(Jugador jugador) {
    System.out.println("Estas en la carcel solo de visita");
  }
}
