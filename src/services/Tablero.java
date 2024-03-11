package services;

import entities.Carta;
import entities.Casilla;
import entities.Impuesto;
import entities.Jugador;

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

        //  ******* 5 Impuestos (Casilla) --> 6, 13, 18, 26, 36 ******

        Impuesto imp1 = new Impuesto("Impuesto Propiedad Urbana", 6, 500, 0.5);
        Impuesto imp2 = new Impuesto("Impuesto Riqueza", 13, 1200, 4.2);
        Impuesto imp3 = new Impuesto("Impuesto IRPF", 18, 1000,19.0);
        Impuesto imp4 = new Impuesto("Impuesto Circulacion", 26, 750, 3.5);
        Impuesto imp5 = new Impuesto("Impuesto Herencias",36, 1000, 2.3);

        //Agregamos los impuestos en el ArrayList de casillas
        this.addCasilla(imp1);
        this.addCasilla(imp2);
        this.addCasilla(imp3);
        this.addCasilla(imp4);
        this.addCasilla(imp5);

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





