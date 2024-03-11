package entities;

public class Carcel extends CasillaEspecial {
  // Props
  private Integer turnosSinTirar;

  // Constructor
  public Carcel(String nombre, Integer numero, Integer cantidad) {
    super(nombre, numero, cantidad);
    this.turnosSinTirar = 1;
  }
}
