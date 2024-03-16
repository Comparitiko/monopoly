package services;

import entities.*;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Tablero tablero;

    public Juego() {
        this.tablero = new Tablero();
        this.jugadores = new ArrayList<Jugador>(2);
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
     * Metodo para agregar un jugador y ponerlo en inicio
     * @param jugador
     */
    public void agregarJugador(Jugador jugador) {
        Casilla inicio = tablero.buscarCasilla(1);
        jugador.setCasillaActual(inicio);
        inicio.getJugadores().add(jugador);
        this.jugadores.add(jugador);
    }

    /**
     * Elimina al jugador, y las propiedades pasan a ser de la banca
     * @param jugador jugador que se quiere eliminar
     */
    public void delJugador(Jugador jugador){
        jugador.getCasillaActual().getJugadores().remove(jugador);
        jugador.setCasillaActual(null);
        jugador.getPropiedades().forEach(propiedad -> {propiedad.setPropietario(null);});
        jugador.getPropiedades().clear();
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
    public String pintarTablero(){
        StringBuffer sb = new StringBuffer();
        for (Jugador jugador : jugadores){
            sb.append("Jugador: ").append(jugador.getNombre()).append(" con dinero: ");
            sb.append(jugador.getDinero()).append("€");
            sb.append(", Casilla actual: ").append(jugador.getCasillaActual().getNombre());
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Calculamos ganador, comprobamos que los jugadores no estén en bancarrota.
     * Si no lo están guardamos en una variable, y aumentamos en numGanadores.
     * @return el jugador que ha ganado.
     */

    public Jugador ganador () {
        Integer numGanadores = 0;
        Jugador ganador = null;
        for (Jugador jugador : jugadores) {
            if (!jugador.bancarrota()) {
                if (numGanadores == 1) return null;
                numGanadores++;
                ganador = jugador;
            }
        }
        return ganador;
    }

    /**
     * Metodo para mover un jugador calculando en que casilla va a moverse al tirar dos dados de 6 caras
     * @param jugador jugador que se va a mover
     */
    public void moverJugador(Jugador jugador){
        if (jugador.getTurnosSinTirar() != 0) {
            jugador.setTurnosSinTirar(jugador.getTurnosSinTirar() - 1);
            System.out.println("Este turno el jugador " + jugador.getNombre() + " no se mueve.");
            return;
        }
        Integer dado1 = (tirarDados(1, 6));
        Integer dado2 = (tirarDados(1, 6));
        System.out.println("Dados del Jugador: " + jugador.getNombre());
        System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
        if (dado1 == 5 && dado2 == 5) {
            jugador.mover(tablero.buscarCasilla(31));
            jugador.getCasillaActual().accion(jugador);
            System.out.println("------------------------------------------------");
        } else {

            Integer numCasillaActual = jugador.getCasillaActual().getNumero() + dado1 + dado2;
            if (numCasillaActual > 40) {
                numCasillaActual %= 40;
                // No he encontrado otra forma que no sea casteando el tipo
                CasillaInicio inicio = (CasillaInicio) tablero.buscarCasilla(1);
                System.out.println("El jugador " + jugador.getNombre() + " ha cobrado por pasar por salida: "
                + inicio.getCantidad() + "€");
                jugador.cobrar(inicio.getCantidad());
                System.out.println("------------------------------------------------");
            };
            Casilla casillaActual = this.tablero.buscarCasilla(numCasillaActual);
            if (!jugador.bancarrota()) {
                System.out.println("El jugador " + jugador.getNombre() + " esta en la casilla " + casillaActual.getNombre() + ".");
                jugador.mover(casillaActual);
                jugador.getCasillaActual().accion(jugador);
                System.out.println("------------------------------------------------");
            }
            else {
                System.out.println("El jugador " + jugador.getNombre() + " esta en bancarrota.");
                this.delJugador(jugador);
                System.out.println("------------------------------------------------");
            }

        }
    }

}
