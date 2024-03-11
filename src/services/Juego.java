package services;

import entities.*;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.tablero = tablero;
        this.jugadores = new ArrayList<Jugador>();
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }


    @Override
    public String toString() {
        return "Juego{" +
                "jugadores=" + jugadores +
                ", tablero=" + tablero +
                '}';
    }
    //Métodos------------

    /**
     * Agregamos o borramos jugadores y cartas de nuestra lista.
     * @param jugador
     */
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }
    public void delJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }

    /**
     * Generamos la tirada de los dados aleatoriamente.
     * @return
     */
    public static int tirarDados(int minimo, int maximo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }
    public void moverJugador(Jugador jugador, Tablero tablero){
        if(jugador.getDinero() > 0){
        }
    }
}
