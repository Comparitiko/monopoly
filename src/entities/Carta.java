package entities;

import java.util.Objects;

public class Carta {
  // Props
  private static Integer numeroCartas = 0;
  private Integer id;
  private String texto;
  private Double cantidad;

  // Constructor

  public Carta(String texto, Double cantidad) {
    this.id = numeroCartas++;
    this.texto = texto;
    this.cantidad = cantidad;
  }

  // Getters and Setters
  public Integer getId() {
    return id;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Double getCantidad() {
    return cantidad;
  }

  public void setCantidad(Double cantidad) {
    this.cantidad = cantidad;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Carta{");
    sb.append("texto='").append(texto).append('\'');
    sb.append(", cantidad=").append(cantidad);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Carta carta = (Carta) o;
    return Objects.equals(id, carta.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
