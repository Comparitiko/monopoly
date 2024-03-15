package entities;

import java.util.Scanner;

public class Propiedad extends Casilla{

  private Double coste;
  private Double alquiler;
  private Jugador propietario;

  public Propiedad(String nombre, Double coste, Double alquiler) {
    super(nombre);
    this.coste = coste;
    this.alquiler = alquiler;
    this.propietario = null;
  }

  // Getters and Setters

  public Double getCoste() {
    return coste;
  }

  public void setCoste(Double coste) {
    this.coste = coste;
  }

  public Double getAlquiler() {
    return alquiler;
  }

  public void setAlquiler(Double alquiler) {
    this.alquiler = alquiler;
  }

  public Jugador getPropietario() {
    return propietario;
  }

  public void setPropietario(Jugador propietario) {
    this.propietario = propietario;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Propiedad{");
    sb.append("coste=").append(coste);
    sb.append(", alquiler=").append(alquiler);
    sb.append(", propietario='").append(propietario).append('\'');
    sb.append(", nombre='").append(nombre).append('\'');
    sb.append(", numero=").append(numero);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public void accion(Jugador jugador) {
    if (this.propietario == null && jugador.getDinero() >= this.coste) {
      Integer opcion = menuCompra();
      if (opcion == 1) jugador.comprarPropiedad(this);
    }  else if (this.propietario != null) {
      jugador.pagarAlquiler(this);
    } else {
      System.out.println("No tienes suficiente dinero para comprar " + this.nombre);
    }
  }

  /**
   * Metodo para mostrar el menu para realizar la compra de una propiedad
   * @return opcion elegida
   */
  private Integer menuCompra () {
    Scanner sc = new Scanner(System.in);
    Integer opcionMenu = 0;
    while (opcionMenu != 1 || opcionMenu != 2) {
      System.out.println("Quieres comprar la propiedad " + this.nombre + " con valor de: " + this.coste);
      System.out.println("1. Si");
      System.out.println("2. No");
      try {
        opcionMenu = Integer.parseInt(sc.nextLine());
      } catch (Exception e) {
        System.out.println("Opcion incorrecta");
      }
    }
    return opcionMenu;
  }
}
