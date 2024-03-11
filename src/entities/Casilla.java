package entities;

import java.util.ArrayList;

public class Casilla {
  // Props
  protected String nombre;
  protected Integer numero;
  protected ArrayList<Jugador> jugadores;

  // Constructor
  public Casilla(String nombre, Integer numero) {
    this.nombre = nombre;
    this.numero = numero;
    this.jugadores = new ArrayList<>;
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
}
