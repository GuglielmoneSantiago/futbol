package com.parcial;

import java.util.function.Predicate;

public class Var {
    private Partido partido;
    public Var(Partido pPartido){
        this.partido=pPartido;
    }
    public int cantidadTarjetasAmarillas(){
        Predicate<TarjetaBase>tarjetas=tarjeta->tarjeta.getColor().contains("AMARILLA");
        int tarjetarAmarillas=Math.toIntExact(partido.getTarjetas().stream().filter(tarjetas).count());
        return tarjetarAmarillas;
    }
    public int cantidadTarjetasRojas(){
        Predicate<TarjetaBase>tarjetas=tarjeta->tarjeta.getColor().contains("ROJA");
        int tarjetarRojas=Math.toIntExact(partido.getTarjetas().stream().filter(tarjetas).count());
        return tarjetarRojas;
    }
}
