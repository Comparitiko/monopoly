package services;

import entities.*;

import java.util.ArrayList;

public class Tablero {

    // ---- Propiedades ----

    private ArrayList<Casilla> casillas;
    private ArrayList<Carta> cartas;

    // ---- Constructor ----
    public Tablero(){

        this.casillas = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }

    /**
     * Generar 40 casillas
     * 1 Inicio (Casilla) --> 1
     * 1 Carcel (Casilla) --> 31 IN JAIN hasta la casilla 11
     * 5 Impuesto (Casilla) --> 6, 13, 18, 26, 36
     * 5 Carta (Casilla) -->
     * 27 Propiedades (Casilla) -->
     */


    public void hacerTablero(){

        // Tablero
        this.addCasilla(new CasillaInicio("Inicio"));
        this.addCasilla(new Propiedad("Calle de la Almedina",2000.0,300.0));
        this.addCasilla(new Propiedad("Puerto de Almeria",1430.0,420.0));
        this.addCasilla(new Impuesto("Impuesto IRPF", 1000,10.0));
        this.addCasilla(new Propiedad("Aeropuerto Pulpi",3100.0,360.0));
        this.addCasilla(new Propiedad("Calle de Granada",1100.0,550.0));
        this.addCasilla(new Propiedad("Compañia eléctrica",2020.0,320.0));
        this.addCasilla(new Propiedad("Estación de Goya",2020.0,320.0));
        this.addCasilla(new Propiedad("Compañia eléctrica",2020.0,320.0));
        this.addCasilla(new Propiedad("Compañia eléctrica",2020.0,320.0));



        // IMPUESTOS

        //Agregamos los impuestos generados en el ArrayList de casillas
        this.addCasilla(new Impuesto("Impuesto Propiedad Urbana", 500, 0.5));
        this.addCasilla(new Impuesto("Impuesto Riqueza", 1200, 4.2));

        this.addCasilla(new Impuesto("Impuesto Circulacion", 750, 3.5));
        this.addCasilla(new Impuesto("Impuesto Herencias", 1000, 2.3));

    }


    //---- Getters ----

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }


    // ---- Metodos ----

    /**
     * Metodo para genenerar un numero aleatorio entero entre un minimo y maximo
     * @param min numero mas pequeño entre el rango
     * @param max numero mas grande entre el rango
     * @return un numero aleatorio entre un numero maximo y mínimo
     */
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Devuelve una representación textual del tablero de Monopoly
     * @return String con
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tablero{");
        sb.append("Jugador=");
        sb.append('}');
        return sb.toString();

    }

    /**
     * Metodo para añadir una casilla al tablero
     * @param casilla nº de casilla pasa por parámetro
     */

    public void addCasilla(Casilla casilla) {
        this.casillas.add(casilla);

    }

    /**
     * Busca una casilla específica en la colección de casillas
     * @param numeroCasilla El número de la casilla que se desea encontrar
     * @return La casilla si se encuentra, o null si no se encuentra
     */
    public Casilla buscarCasilla(Integer numeroCasilla){
        for (Casilla c: this.casillas) {
            if (c.getNumero().equals(numeroCasilla))
                return c;
            }
        return null;
    }
}





