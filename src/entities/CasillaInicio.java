package entities;

public class CasillaInicio extends CasillaEspecial {
  // Props
  private static final Double dineroAlpasar = 250d;

  // Constructor
  public CasillaInicio(String nombre) {
    super(nombre, dineroAlpasar);
  }

  @Override
  public void accion(Jugador jugador) {
    System.out.println("Recibes " + dineroAlpasar + "euros");
  }
}
