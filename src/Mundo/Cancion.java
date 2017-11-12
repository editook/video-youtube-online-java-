/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;

/**
 *Clase que permite crear una cancion
 * @author German
 */
public class Cancion implements Serializable{

    //Atributos codigo, nombre, album, caratula, año, duracion, genero, url.
    Artista artista;
    String nombre, album, duracion, genero, url;
    int codigo, año;

    /**
     * Metodo constructor de la clase cancion
     * @param artista
     * @param nombre
     * @param album
     * @param duracion
     * @param genero
     * @param url
     * @param codigo
     * @param año 
     */
    public Cancion(Artista artista, String nombre, String album, String duracion, String genero, String url, int codigo, int año) {
        this.artista = artista;
        this.nombre = nombre;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.url = url;
        this.codigo = codigo;
        this.año = año;
    }
    /**
     * 
     * @return artista 
     */

    public Artista getArtista() {
        return artista;
    }
    /**
     * 
     * @param artista 
     * asigna artista al artista
     */

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    /**
     * 
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     * asigna nombre al nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return album
     */

    public String getAlbum() {
        return album;
    }
    /**
     * 
     * @param album 
     * asigna el album al album
     */

    public void setAlbum(String album) {
        this.album = album;
    }
    /**
     * 
     * @return duracion 
     */

    public String getDuracion() {
        return duracion;
    }
    /**
     * 
     * @param duracion 
     * asigana duracion a duracion 
     */

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    /**
     * 
     * @return genero
     */

    public String getGenero() {
        return genero;
    }
    /**
     * 
     * @param genero 
     * asigna el genero al genero
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return url
     */

    public String getUrl() {
        return url;
    }
    /**
     * 
     * @param url 
     * asigna la url a la url
     */

    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * 
     * @return codigo
     */

    public int getCodigo() {
        return codigo;
    }
    /**
     * 
     * @param codigo 
     * 
     * asigna el codigo al codigo
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @return año
     */

    public int getAño() {
        return año;
    }
    /**
     * 
     * @param año 
     * asigna el año al año
     */

    public void setAño(int año) {
        this.año = año;
    }

}
