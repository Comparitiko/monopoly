package services;

import entities.*;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Tablero tablero;

    public Juego() {
        this.tablero = new Tablero();
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
    private static int tirarDados(int minimo, int maximo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    /**
     * Pintamos el nombre y la posición de cada jugador en el tablero.
     */
    public void pintarTablero(){
        StringBuffer sb = new StringBuffer();
        for (Jugador jugador : jugadores){
            sb.append("Jugador: ").append(jugador.getNombre());
            sb.append(", Casilla actual: ").append(jugador.getCasillaActual().getNombre());
            sb.append("\n");
        }
    }
    public void moverJugador(Jugador jugador){
        if (jugador.getTurnosSinTirar() != 0) {
            jugador.setTurnosSinTirar(jugador.getTurnosSinTirar() - 1);
            System.out.println("Este turno el jugador " + jugador.getNombre() + " no se mueve.");
            return;
        }
        Integer dado1 = (tirarDados(1, 6));
        Integer dado2 = (tirarDados(1, 6));
        if (dado1 == 5 || dado2 == 5) {
            jugador.mover(tablero.buscarCasilla(2));
            jugador.getCasillaActual().accion(jugador);
        } else {
            Integer numCasillaActual = jugador.getCasillaActual().getNumero() + dado1 + dado2;

            Casilla casillaActual = this.tablero.buscarCasilla(numCasillaActual);
            if (!jugador.bancarrota()) {
                jugador.mover(casillaActual);
                jugador.getCasillaActual().accion(jugador);
            } else {
                System.out.println("El jugador " + jugador.getNombre() + " esta en bancarrota.");
                this.delJugador(jugador);
            }
        }
    }

}
