package entities;

public abstract class CasillaEspecial extends Casilla {
  // Props
  protected Integer cantidad;

  // Constructor
  public CasillaEspecial(String nombre, Integer numero, Integer cantidad) {
    super(nombre, numero);
    this.cantidad = cantidad;
  }

  // Getters and Setters

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
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
}