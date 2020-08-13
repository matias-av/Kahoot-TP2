package edu.fiuba.algo3.controller;

import edu.fiuba.algo3.modelo.Juego.Juego;
import edu.fiuba.algo3.modelo.Ronda.Ronda;

public class JuegoController {

    private static Juego juego;

    public static void iniciarJuego(){

        JuegoController.juego = Juego.obtenerInstancia();
    }

    public static Juego obtenerInstancia(){
        return juego;
    }

    public static void comenzarJuego(){
        juego.comenzarJuego();
    }

    public static Ronda getProximaRonda(){
        return juego.getProximaRonda();
    }

    public static boolean estaTerminado(){
        return juego.estaTerminado();
    }


}