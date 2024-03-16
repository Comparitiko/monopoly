package entities;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Jugador {
  // Props
  private Double dinero;
  private String nombre;
  private Integer turnosSinTirar;
  private ArrayList<Propiedad> propiedades;
  private Casilla casillaActual;

  // Constructor
  public Jugador (String nombre) {
    this.dinero = 2000.00;
    this.nombre = nombre;
    this.turnosSinTirar = 0;
    this.propiedades = new ArrayList<Propiedad>();
    this.casillaActual = null;
  }

  // Getters and Setters
  public Double getDinero() {
    return dinero;
  }

  public void setDinero(Double dinero) {
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

  public Integer getTurnosSinTirar () {
    return this.turnosSinTirar;
  }

  public void setTurnosSinTirar (Integer turnosSinTirar) {
    this.turnosSinTirar = turnosSinTirar;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Jugador jugador = (Jugador) o;
    return Objects.equals(nombre, jugador.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }

  // Tengo que modificar metodos de Jugador para que funcione correctamente
  // y completar el metodo accion

  /**
   * Metodo para que el jugador se mueva a otra casilla
   * @param casillaActual casilla a la que se movera el jugador
   */
  public void mover (Casilla casillaActual) {
    this.casillaActual.getJugadores().remove(this);
    this.casillaActual = casillaActual;
    this.casillaActual.getJugadores().add(this);
  }

  /**
   * Metodo para comprobar si el jugador esta en bancarrota
   * @return true si el jugador esta en bancarrota, false en caso contrario
   */
  public boolean bancarrota () {
    return this.dinero < 0;
  }

  /**
   * Metodo para pagar una cantidad
   * @param cantidad cantidad a pagar
   */
  public void pagar (Double cantidad) {
    this.dinero -= cantidad;
  }

  public void pagarAlquiler (Propiedad propiedad) {
    propiedad.getPropietario().cobrar(propiedad.getAlquiler());
    this.pagar(propiedad.getAlquiler());
  }

  /**
   * Metodo para cobrar una cantidad
   * @param cantidad cantidad a cobrar
   */
  public void cobrar (Double cantidad) {
    this.dinero += cantidad;
  }

  /**
   * Metodo para comprar una propiedad
   * @param propiedad propiedad a comprar
   */
  public void comprarPropiedad (Propiedad propiedad) {
    this.propiedades.add(propiedad);
    propiedad.setPropietario(this);
    System.out.println("Has comprado " + propiedad.getNombre());
    this.dinero -= propiedad.getCoste();
  }
}
