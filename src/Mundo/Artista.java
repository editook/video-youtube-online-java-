/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;

/**
 * Clase que permite la creacion de un artista
 * @author German
 */
public class Artista implements Serializable{
    //Atributos codigo, nombre, nacionalidad, grupo, LISTA DOBLEMENTE ENLAZADA DE CANCIONES
    
    int codigo;
    String nombre,nacionalidad;
    boolean grupo;

    /**
     * Metodo constructor de la clase artista
     * @param codigo
     * @param nombre
     * @param nacionalidad
     * @param grupo 
     */
    public Artista(int codigo, String nombre, String nacionalidad, boolean grupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.grupo = grupo;
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
     * asiga el codigo al codigo 
     */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * asiga el nombre al nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return nacionalidad 
     */

    public String getNacionalidad() {
        return nacionalidad;
    }
    /**
     * 
     * @param nacionalidad 
     * asiga la nacionalidad a la nacionalidad 
     */

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    /**
     * 
     * @return true si es un grupo 
     */
    

    public boolean isGrupo() {
        return grupo;
    }
    /**
     * 
     * @param grupo 
     * asiga grupo al grupo 
     */

    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }
    
}
