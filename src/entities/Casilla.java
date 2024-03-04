package entities;

public class Casilla {
  // Props
  protected String nombre;
  protected Integer numero;
  protected Jugador jugador;

  // Constructor
  public Casilla(String nombre, Integer numero) {
    this.nombre = nombre;
    this.numero = numero;
    this.jugador = null;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Jugador getJugador() {
    return jugador;
  }

  public void setJugador(Jugador jugador) {
    this.jugador = jugador;
  }

  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Casilla{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", numero=").append(numero);
    sb.append(", jugador=").append(jugador);
    sb.append('}');
    return sb.toString();
  }
}
