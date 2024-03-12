package entities;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Jugador {
  // Props
  private Double dinero;
  private String nombre;
  private ArrayList<Propiedad> propiedades;
  private Casilla casillaActual;

  // Constructor
  public Jugador (String nombre) {
    this.dinero = 500.00;
    this.nombre = nombre;
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
    return this.dinero <= 0 && this.propiedades.isEmpty();
  }

  public void accionSobrePropiedad (Propiedad propiedad) {
    Scanner sc = new Scanner(System.in);
    if (propiedad.getPropietario() == null) {
      Integer opcion = 0;
      while (opcion != 1 || opcion != 2) {
        try {
          System.out.println("¿Quieres comprar " + propiedad.getNombre() + "?");
          System.out.println("1. Si");
          System.out.println("2. No");
          opcion = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
          System.out.println("Opción incorrecta");
        }
        if (opcion == 1 && this.dinero - propiedad.getCoste() >= 0) {
          comprarPropiedad(propiedad);
        } else if (opcion == 2) System.out.println("No compras la propiedad " + propiedad.getNombre());
        else if (this.dinero < propiedad.getCoste()) System.out.println("No tienes suficiente dinero");
      }
    } else {
      if (this.dinero < propiedad.getAlquiler()) {
        System.out.println("No tienes suficiente dinero, tienes que vender propiedades que sean tuyas");

      }
      else if (this.dinero > propiedad.getAlquiler()) {
        pagarAlquiler(propiedad);
      }
    }
  }

  private void comprarPropiedad (Propiedad propiedad) {
    this.propiedades.add(propiedad);
    propiedad.setPropietario(this);
    System.out.println("Has comprado " + propiedad.getNombre());
    this.dinero -= propiedad.getCoste();
  }

  private void pagarAlquiler (Propiedad propiedad) {
    this.dinero -= propiedad.getAlquiler();
    propiedad.getPropietario().setDinero(propiedad.getPropietario().getDinero() + propiedad.getAlquiler());
  }

}
