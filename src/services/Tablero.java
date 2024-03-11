package services;

import entities.Carta;
import entities.Casilla;

import java.util.ArrayList;

public class Tablero {

    // ---- Propiedades ----

    private ArrayList<Casilla> casilla;
    private ArrayList<Carta> cartas;

    // ---- Constructor ----
    public Tablero(){

        this.casilla = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }

    //---- Getters ----

    public ArrayList<Casilla> getCasillas() {
        return casilla;
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

        return sb.toString();

    }

    /**
     * Metodo para añadir una casilla al tablero
     * @param casilla nº de casilla pasa por parámetro
     */
    public void addCasilla(Casilla casilla){
        this.casilla.add(casilla);
    }








}
