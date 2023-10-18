package com.parcial;

public class Estadio {
    private String equipo;
    private String ubicacion;
    private String pais;
    public Estadio(String pEquipo,String pUbicacion,String pPais){
        setEquipo(pEquipo);
        setCiudad(pUbicacion);  
        setPais(pPais);
    }
    public String getName(){
        return equipo;
    }
    public String getCiudad(){
        return ubicacion;
    }
    public String getPais(){
        return pais;
    }
    public void setEquipo(String pEquipo){
        equipo=pEquipo;
    }
    public void setCiudad(String pUbicacion){
        ubicacion=pUbicacion;
    }
    public void setPais(String pPais){
        pais=pPais;
    }
    public String toString(){
        String n= equipo+", "+ubicacion+" ("+pais+")";
        return n;
    }
}
