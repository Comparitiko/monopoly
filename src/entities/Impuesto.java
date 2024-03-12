package entities;

public class Impuesto extends CasillaEspecial{

    private Double impuesto;

    public Impuesto(String nombre, Integer cantidad, Double impuesto) {
        super(nombre, cantidad);
        this.impuesto = impuesto;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Impuesto{" +
                "impuesto=" + impuesto +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", jugador=" + jugadores +
                '}';
    }
}
