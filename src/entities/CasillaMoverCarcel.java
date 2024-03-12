package entities;

public class CasillaMoverCarcel extends CasillaEspecial {
  // Props
  private Carcel carcel;

  public CasillaMoverCarcel (Carcel carcel, String nombre) {
    super(nombre, 0d);
    this.carcel = carcel;
  }

  public Carcel getCarcel() {
    return carcel;
  }

  @Override
  public void accion(Jugador jugador) {
    System.out.println("Vas a la carcel");
    jugador.mover(carcel);
  }
}
