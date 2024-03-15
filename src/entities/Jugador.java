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
    this.dinero = 500.00;
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
    if (o == null || getClass() != o.getClass()) return false;
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
    return this.dinero <= 0;
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
   * Metodo para vender una propiedad a la banca cobrando las 3/4 partes del coste original
   */
  public void vender () {
    // No lo he implementado al final, si da tiempo se hace.
    Scanner sc = new Scanner(System.in);
    int opcionMenu = 0;
    while (opcionMenu < 0 || opcionMenu > propiedades.size() - 1) {
      for (int i = 0; i < propiedades.size(); i++) {
        System.out.println((i + 1) + ". " + propiedades.get(i));
      }
      System.out.println("Que propiedad quieres vender");
      try {
        opcionMenu = sc.nextInt() + 1;
      } catch (Exception e) {
        System.out.println("Opción incorrecta");
      }
    }
    this.dinero += this.propiedades.get(opcionMenu).getCoste() * 75 / 100;
    this.propiedades.get(opcionMenu).setPropietario(null);
    this.propiedades.remove(opcionMenu);
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
