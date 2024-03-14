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

  public static Jugador menuJugador() {

  }

  public static void main(String[] args) {
    Juego j = new Juego();

    Integer numeroJugadores = menuNumeroJugadores();

    for (int i = 0; i < numeroJugadores; i++) {
      Jugador jugador = menuJugador();
      j.agregarJugador(jugador);
    }
  }
}