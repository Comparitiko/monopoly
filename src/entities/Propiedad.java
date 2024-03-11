package entities;

public class Propiedad extends Casilla{

  private Double coste;
  private Double alquiler;
  private Jugador propietario;

  public Propiedad(String nombre, Integer numero, Double coste, Double alquiler, Jugador propietario) {
    super(nombre, numero);
    this.coste = coste;
    this.alquiler = alquiler;
    this.propietario = propietario;
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
}
