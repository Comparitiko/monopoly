package entities;

public class CasillaMoverCarcel extends CasillaEspecial {
  // Props
  private Carcel carcel;
  private Integer turnosSinTirar;

  public CasillaMoverCarcel (Carcel carcel, String nombre) {
    super(nombre, 0d);
    this.carcel = carcel;
    this.turnosSinTirar = 1;
  }

  public Carcel getCarcel() {
    return carcel;
  }

  // Methods
  @Override
  public void accion(Jugador jugador) {
    System.out.println("Jugador " + jugador.getNombre() + " se va a la carcel");
    jugador.mover(carcel);
    jugador.setTurnosSinTirar(this.turnosSinTirar);
  }
}
