package entities;

public class CasillaInicio extends CasillaEspecial {
  // Props
  private Double dineroAlpasar;

  // Constructor
  public CasillaInicio(String nombre) {
    super(nombre, 1);
    this.dineroAlpasar = 250.00;
  }

  // Getters and Setters
  public Double getDineroAlpasar() {
    return dineroAlpasar;
  }
}
