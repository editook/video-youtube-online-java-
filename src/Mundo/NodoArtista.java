/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;

/**
 * Clase que permite crear un Nodo para el arbol binario, este nodo es de tipo artista
 * @author German
 */
public class NodoArtista implements Serializable{

    public Artista artista;
    public NodoArtista izquierdo;
    public NodoArtista derecho;

    /**
     * Metodo constructor de la clase NodoArtista 
     * @param artista 
     */
    public NodoArtista(Artista artista) {
        this.artista = artista;
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
     * asigna el artista al artista
     */

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    /**
     * 
     * @return izquierdo 
     */

    public NodoArtista getIzquierdo() {
        return izquierdo;
    }
    /**
     * 
     * @param izquierdo 
     * asiga el NodoIzquierdo al NodoIzquierdo
     */

    public void setIzquierdo(NodoArtista izquierdo) {
        this.izquierdo = izquierdo;
    }
    /**
     * 
     * @return derecho
     */

    public NodoArtista getDerecho() {
        return derecho;
    }
    /**
     * 
     * @param derecho
     *
     */

    public void setDerecho(NodoArtista derecho) {
        this.derecho = derecho;
    }
    /**
     * 
     * @return artista
     */

    @Override
    public String toString() {
        return "Artista: " + artista.getNombre();
    }

}
