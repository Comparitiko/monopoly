package entities;

import java.util.ArrayList;

public class Jugador {
  // Props
  private Integer dinero;
  private String nombre;
  private ArrayList<Propiedad> propiedades;
  private Casilla casillaActual;

  // Constructor
  public Jugador (String nombre) {
    this.dinero = 500;
    this.nombre = nombre;
    this.propiedades = new ArrayList<Propiedad>();
    this.casillaActual = null;
  }

  // Getters and Setters
  public Integer getDinero() {
    return dinero;
  }

  public void setDinero(Integer dinero) {
    this.dinero = dinero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Propiedad> getPropiedades() {
    return propiedades;
  }

  public Casilla getCasillaActual() {
    return casillaActual;
  }

  public void setCasillaActual(Casilla casillaActual) {
    this.casillaActual = casillaActual;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Jugador{");
    sb.append("dinero=").append(dinero);
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", propiedades=").append(propiedades);
    sb.append(", casillaActual=").append(casillaActual);
    sb.append('}');
    return sb.toString();
  }

  public void moverse () {
    
  }
}
