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
        this.hacerTablero();
    }

    /**
     * Generar 40 casillas
     * 1 Inicio
     * 1 Cárcel / 1 Visitar Cárcel
     * 5 Impuesto
     * 5 Carta
     * 27 Propiedades
     */


    public void hacerTablero(){

        //-------------- Tablero --------------
        Carcel visitaCarcel = new Carcel("Visita Cárcel");

        // --> DESDE LA CASILLA 1 HASTA LA CASILLA 11

        //-------------- Inicio --------------
        this.addCasilla(new CasillaInicio("Inicio"));

        //-------------- Propiedad --------------
        this.addCasilla(new Propiedad("Calle de la Almedina",2000.0,300.0));
        this.addCasilla(new Propiedad("Puerto de Almeria",1430.0,420.0));

        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto IRPF", -80.0));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Pulpi",3100.0,850.0));
        this.addCasilla(new Propiedad("Calle de Granada",1100.0,550.0));

        //-------------- Carta --------------
        //this.addCasilla(new Carta("¡Lotería! Gana 1000€ del banco", 0, 1000));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Estación de Goya",4200.0,600.0));
        this.addCasilla(new Propiedad("Compañia de Seguros Santa Pola",2600.0,510.0));


        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto Propiedad", -42.5 ));

        //-------------- Añadimos la casilla a la casilla visita --------------
        this.addCasilla(visitaCarcel);

        // --> DESDE LA CASILLA 11 HASTA LA CASILLA 21

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Paseo del prado",5000.0,320.0));
        this.addCasilla(new Propiedad("Calle Alcalá",1650.0,600.0));
        this.addCasilla(new Propiedad("Parking Monte Rey",2300.0,490.0));

        //-------------- Carta --------------
        //this.addCasilla(new Carta("¡El perro me persigue! Retrocede 3 casillas", -3, 0));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Ayuntamiento de Cuevas",4875.0,670.0));
        this.addCasilla(new Propiedad("Power Horse Stadium",6800.0,950.0));
        this.addCasilla(new Propiedad("Compañia eléctrica",2020.0,320.0));

        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto Circulacion", -22.3));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Calle Alcalá",1000.0,367.0));
        this.addCasilla(new Propiedad("Catedral San Juan el Divino", 2350.0, 532.0));

        // --> DESDE LA CASILLA 21 HASTA LA CASILLA 31 (CÁRCEL)

        //-------------- Carta --------------
        //this.addCasilla(new Carta("¡Es mi cumpleaños! Todos los jugadores te pagan 300€", 0, 300));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Villaricos",2800.0,750.0));
        this.addCasilla(new Propiedad("Power Horse Stadium",6800.0,950.0));
        this.addCasilla(new Propiedad("Compañia eléctrica",2020.0,320.0));






        // IMPUESTOS

        //Agregamos los impuestos generados en el ArrayList de casillas

        this.addCasilla(new Impuesto("Impuesto Riqueza", -68.5 ));

        this.addCasilla(new Impuesto("Impuesto Herencias", -60.3));

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
     * @param casilla nº de casilla pasada por parámetro
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





