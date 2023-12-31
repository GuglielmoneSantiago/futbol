package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private int fecha;
    private Estadio estadio;
    private Equipo local;
    private Equipo visitante;
    private String nombrePart;
     private List<TarjetaBase> tarjetas;
    public Partido(Estadio estadio,Equipo local, Equipo visitante,String nombrePart ){
        this.estadio= estadio;
        this.local = local;
        this.visitante = visitante;
        this.nombrePart = nombrePart;
        this.tarjetas = new ArrayList<>();
    }
    public Equipo getLocal(){
        return local;
    }
    public Estadio getEstadio(){
        return estadio;
    }
     public Equipo getVisitante(){
        return visitante;
    }
     public String getNombrePart(){
        return nombrePart;
    }
    public String getName(){
        return nombrePart+" "+local.getAbreviatura()+"x"+visitante.getAbreviatura();
    }
    public void agregar(TarjetaBase tarjeta) {
        tarjetas.add(tarjeta);
    }

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }
    public int tarjetasCantidad() {
        return tarjetas.size();
    }
}

