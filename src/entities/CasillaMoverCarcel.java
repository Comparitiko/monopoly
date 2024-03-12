package entities;

public class CasillaMoverCarcel extends CasillaEspecial {
  // Props
  Carcel carcel;

  public CasillaMoverCarcel (Carcel carcel, String nombre, Integer cantidad) {
    super(nombre, cantidad);
    this.carcel = carcel;
  }

  public Carcel getCarcel() {
    return carcel;
  }
}
