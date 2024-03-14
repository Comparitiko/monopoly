package main;

import entities.Jugador;
import services.Juego;

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  /**
   * Método para mostrar un menu que pida el numero de jugadores, tiene que ser un numero entre 2 y 4.
   * @return numero de jugadores que van a jugar
   */
  public static Integer menuNumeroJugadores() {
    System.out.println("Ingresa el numero de jugadores (2- 4): ");
    Integer numeroJugadores = 0;
    while (true) {
      try {
        numeroJugadores = Integer.parseInt(sc.nextLine());
        if (numeroJugadores < 2 || numeroJugadores > 4) throw new Exception();
        else break;;
      } catch (Exception e) {
        System.out.println("Ingresa un numero entre 2 y 4");
      }
    }
    return numeroJugadores;
  }

  /**
   * Metodo para crear un jugador con su nombre
   * @param numeroJugador numero de jugador que se esta creando
   * @return Jugador creado
   */
  public static Jugador menuJugador(Integer numeroJugador) {
    System.out.println("Ingresa el nombre del jugador " + (numeroJugador + 1));
    String nombre = sc.nextLine();
    return new Jugador(nombre);
  }

  public static void main(String[] args) {
    Juego j = new Juego();

    Integer numeroJugadores = menuNumeroJugadores();

    // Bucle para crear los jugadores
    for (int i = 0; i < numeroJugadores; i++) {
      Jugador jugador = menuJugador(i);
      j.agregarJugador(jugador);
    }

  }
}