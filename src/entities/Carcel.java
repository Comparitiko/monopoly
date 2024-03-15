package entities;

public class Carcel extends Casilla {
  // Constructor
  public Carcel(Integer numero, String nombre) {
    super(nombre, numero);
  }

  // Methods
  @Override
  public void accion(Jugador jugador) {
    System.out.println("Estas en la carcel solo de visita");
  }
}
