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
    private void hacerTablero(){

        //-------------- Tablero --------------
        Carcel visitaCarcel = new Carcel("Visita Cárcel");
        CasillaMoverCarcel moverACarcel = new CasillaMoverCarcel(visitaCarcel, "Cárcel");

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
        this.addCasilla(new CasillaCarta("Coge carta", 0d, this.cartas));

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
        this.addCasilla(new CasillaCarta("Coge carta", 0d, this.cartas));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Ayuntamiento de Cuevas",4875.0,670.0));
        this.addCasilla(new Propiedad("Power Horse Stadium",6800.0,950.0));
        this.addCasilla(new Propiedad("Compañia eléctrica Santander",2020.0,320.0));

        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto Circulacion", -22.3));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Calle Alcalá",1000.0,367.0));
        this.addCasilla(new Propiedad("Catedral San Juan el Divino", 2350.0, 532.0));

        // --> DESDE LA CASILLA 21 HASTA LA CASILLA 31 (CÁRCEL)

        //-------------- Carta --------------
        this.addCasilla(new CasillaCarta("Coge carta", 0d, this.cartas));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Villaricos",2800.0,750.0));
        this.addCasilla(new Propiedad("Estación de tren Jaravía",1290.0,320.0));

        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto Riqueza", -68.5 ));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Villaricos",2800.0,750.0));
        this.addCasilla(new Propiedad("Estación de tren Jaravía",1290.0,320.0));

        //-------------- Carta --------------
        this.addCasilla(new CasillaCarta("Coge carta", 0d, this.cartas));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Instituto IES JAROSO",10000.0,2000.0));
        this.addCasilla(new Propiedad("Farmacia Virgen del Rosario",2032.0,769.0));

        //-------------- Añadimos la casilla Carcel a la 31 pero nos movemos a la 11 --------------
        this.addCasilla(moverACarcel);

        // --> DESDE LA CASILLA 31 HASTA LA CASILLA 40

        //-------------- Impuesto --------------
        this.addCasilla(new Impuesto("Impuesto Herencias", -60.3));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Villaricos",2800.0,750.0));
        this.addCasilla(new Propiedad("Estación de tren Jaravía",1290.0,320.0));

        //-------------- Carta --------------
        this.addCasilla(new CasillaCarta("Coge carta", 0d , this.cartas));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Aeropuerto de Villaricos",2800.0,750.0));
        this.addCasilla(new Propiedad("Estación de tren Jaravía",1290.0,320.0));

        //-------------- Propiedades --------------
        this.addCasilla(new Propiedad("Banco Sabadell",8965.0,5630.0));
        this.addCasilla(new Propiedad("Auditorio San Antonio",4232.0,2500.0));
        this.addCasilla(new Propiedad("Hospital Reyna",7400.0,4470.0));

    }

    private void crearCartas() {
        this.cartas.add(new Carta("¡Eres un desgraciado! paga 100€.", 500.0));
        this.cartas.add(new Carta("¡Lotería! Gana 1000€ del banco", 1000.0));
        this.cartas.add(new Carta("¡Me he perdido! Paga 50€ para pagar al guia", 50.0));
        this.cartas.add(new Carta("¡Es mi cumpleaños! Tu abuela te regala 150€", 300.0));
        this.cartas.add(new Carta("¡Te ha tocado un sorteo de 100€ enhorabuena!", 100.0));
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
     * Devuelve una representación textual del tablero de Monopoly
     * @return String las casillas del tablero
     */
    @Override
    public String toString() {
        return "Tablero{" +
                "casillas=" + casillas +
                '}';
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





