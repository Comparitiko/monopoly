package entities;

public class CasillaInicio extends CasillaEspecial {
  // Props
  private static final Double dineroAlpasar = 500d;

  // Constructor
  public CasillaInicio(Integer numero, String nombre) {
    super(nombre, numero, dineroAlpasar);
  }

  // Methods
  @Override
  public void accion(Jugador jugador) {
    System.out.println("El jugador " + jugador.getNombre() + " esta en inicio y va a cobrar.");
  }
}
