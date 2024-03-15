package entities;

public abstract class CasillaEspecial extends Casilla {
  // Props
  protected Double cantidad;

  // Constructor
  public CasillaEspecial(String nombre, Integer numero, Double cantidad) {
    super(nombre, numero);
    this.cantidad = cantidad;
  }

  // Getters and Setters
  public Double getCantidad() {
    return cantidad;
  }

  public void setCantidad(Double cantidad) {
    this.cantidad = cantidad;
  }

  // Methods
  @Override
  public abstract void accion(Jugador jugador);
}