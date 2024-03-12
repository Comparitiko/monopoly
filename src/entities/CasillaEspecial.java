package entities;

public abstract class CasillaEspecial extends Casilla {
  // Props
  protected Double cantidad;

  // Constructor
  public CasillaEspecial(String nombre, Double cantidad) {
    super(nombre);
    this.cantidad = cantidad;
  }

  // Getters and Setters
  public Double getCantidad() {
    return cantidad;
  }

  public void setCantidad(Double cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return "CasillaEspecial{" +
            "cantidad=" + cantidad +
            ", nombre='" + nombre + '\'' +
            ", numero=" + numero +
            ", jugador=" + jugadores +
            '}';
  }

  @Override
  public abstract void accion(Jugador jugador);
}