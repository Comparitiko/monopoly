package entities;

public class Carcel extends Casilla {
  // Constructor
  public Carcel(String nombre) {
    super(nombre);
  }

  // Methods
  @Override
  public void accion(Jugador jugador) {
    System.out.println("Estas en la carcel solo de visita");
  }
}
