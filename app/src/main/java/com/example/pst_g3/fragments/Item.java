package com.example.pst_g3.fragments;

import java.util.ArrayList;

public class Item {
    String titulo;
    String autor;
    String editorial;
    String imagen;
    String sinopsis;
    ArrayList<String> tabla;
    Item item;
    public ArrayList<String> tabla1,tabla2,tabla3,tabla4,tabla5,tabla6,tabla7;

    public Item(){

    }
    public Item(String imagen, String titulo, String autor, String editorial, String sinopsis) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.imagen = imagen;
        this.sinopsis= sinopsis;
    }

    public ArrayList<String> generartabla(){
        ArrayList<String> tabla = new ArrayList<>();
        tabla.add(imagen);
        tabla.add(titulo);
        tabla.add(autor);
        tabla.add(editorial);
        tabla.add(sinopsis);
        return tabla;
    }
    public void main (String s){


    }

    @Override
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", imagen='" + imagen + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", tabla=" + tabla +
                '}';
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getImagen() {
        return imagen;
    }

    public ArrayList<String> getTabla() {
        return tabla;
    }

    public String sinopsis_texto(){
        return "sinopsis: "+ getSinopsis();
    }
}
