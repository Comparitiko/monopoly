package entities;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Casilla {
  // Props
  protected String nombre;
  protected Integer numero;
  protected ArrayList<Jugador> jugadores;

  // Constructor
  public Casilla(String nombre, Integer numero) {
    this.nombre = nombre;
    this.numero = numero;
    this.jugadores = new ArrayList<>();
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

  public ArrayList<Jugador> getJugadores() {
    return jugadores;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Casilla{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", numero=").append(numero);
    sb.append(", jugador=").append(jugadores);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Casilla casilla = (Casilla) o;
    return Objects.equals(numero, casilla.numero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero);
  }

  /**
   * Metodo que al caer en una casilla se realice una accion
   * @param jugador que cae en la casilla
   */
  public abstract void accion (Jugador jugador);
}
