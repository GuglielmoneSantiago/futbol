package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String abreviatura;
    private List<IJugador> jugadores;
    public Equipo(String nombre, String abreviatura){
        this.nombre = nombre;
        this.abreviatura = abreviatura;
         this.jugadores = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
     public String getAbreviatura(){
        return abreviatura;
    }
    public List<IJugador> getJugadores() {
        return jugadores;
    }
    public void agregar(IJugador jugador) {
        jugadores.add(jugador);
    }
    public int jugadoresCantidad(){
        return jugadores.size();
    }
    public IJugador obtenerJugador(int numeroCamiseta) {
        for (IJugador jugador : jugadores) {
            if (jugador.getNumero() == numeroCamiseta) {
                return jugador;
            }
        }
        return null; 
    public String imprimirPlantel(){
        String l;
        l="["+jugadores.get(0).getNumero()+"]"+" "+jugadores.get(0).getName()+" "+"("+jugadores.get(0).getPosicion()+")";
        if(jugadores.size()>1){
            for(int i=1;i<jugadores.size();i++){
            l=l;
        }
        }
        return n;
    
    }
}
}
