package entities;

import java.util.Objects;

public class Carta {
  // Props
  private static Integer numeroCartas = 0;
  private Integer id;
  private String texto;
  private Integer moverte;
  private Integer cantidad;

  // Constructor

  public Carta(String texto, Integer moverte, Integer cantidad) {
    this.id = numeroCartas++;
    this.texto = texto;
    this.moverte = moverte;
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

  public Integer getMoverte() {
    return moverte;
  }

  public void setMoverte(Integer moverte) {
    this.moverte = moverte;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Carta{");
    sb.append("texto='").append(texto).append('\'');
    sb.append(", moverte=").append(moverte);
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
