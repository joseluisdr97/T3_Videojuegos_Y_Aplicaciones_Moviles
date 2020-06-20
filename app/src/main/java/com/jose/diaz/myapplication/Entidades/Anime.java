package com.jose.diaz.myapplication.Entidades;

public class Anime {
    public String FullName;
    public String Descripcion;
    public String Imagen;
    public boolean Estrella;
    public Anime(String FullName, String Descripcion, String Imagen, boolean Estrella)
    {
        this.FullName=FullName;
        this.Descripcion=Descripcion;
        this.Imagen=Imagen;
        this.Estrella=Estrella;
    }
}
