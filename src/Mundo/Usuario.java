/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 
 * @author VICTOR BURITICA
 */
public class Usuario implements Serializable{
    //Atributos username,contraseña,email,LISTA DE CANCIONES CIRCULAR

    String username, contrasena, email;
    HashMap<String, String> hash;
    ListaCancion canciones;ListaCancion favoritas;
    /**
     * constructor de la clase cancion 
     * @param username
     * @param contrasena
     * @param email
     * @param canciones 
     */
    public Usuario(String username,String contrasena,String email,ListaCancion canciones){
        this.username=username;
        this.contrasena=contrasena;
        this.email=email;
        this.canciones=canciones;
        favoritas=new ListaCancion();
        RegistrarListaCancion(canciones);
        hash=new HashMap<>();
        hash.put(username,contrasena);
    }
    /**
     * 
     * @return username 
     */
    public String getUsuario(){
        return username;
    }
    /**
     * 
     * @return username
     */
    public String getContrasena(){
        return hash.get(username);
    }
    /**
     * 
     * @param cancion 
     */
    public void RegistrarListaCancion(ListaCancion cancion){
        canciones=cancion;
    }
    /**
     * 
     * @return canciones 
     */
    public ListaCancion getRegistroCancionesUsuario(){
        return canciones;
    }
    /**
     * 
     * @param cancion 
     */
    public void RegistrarListaCancionFavorita(ListaCancion cancion){
        favoritas=cancion;
    }
    /**
     * 
     * @return favoritas 
     */
    public ListaCancion getRegistroCancionesFavoritas(){
        return favoritas;
    }
}
