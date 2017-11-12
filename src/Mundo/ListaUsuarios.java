/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author VICTOR BURITICA
 */
public class ListaUsuarios extends ArrayList<Usuario> implements Serializable{
    /**
     * constructor de la clase usuario 
     */
    public ListaUsuarios(){
        
    }
    /**
     * metodo que buscar un usuario  
     * @param nombre
     * @return usario 
     */
    
    public Usuario getUsuario(String nombre){
        Usuario usuario=null;
        for (Usuario i : this) {
            if (i.getUsuario().equals(nombre)) {
                usuario = i;
                break;
            }
        }
        return usuario;
    }
    /**
     * metodo que verifica si es un usario 
     * @param nomb
     * @param contrase
     * @return salida 
     */
    public boolean esUsuario(String nomb,String contrase){
        boolean salida=false;
        for (Usuario i : this) {
            if (i.getUsuario().equals(nomb) && i.getContrasena().equals(contrase)) {
                salida = true;
                break;
            }
        }
        return salida;
    }
    /**
     * metodo que agrega un usuario al ArrayList
     * @param nombre
     * @param contrasena
     * @param mail 
     */
    public void addUsuario(String nombre,String contrasena,String mail){
          this.add(new Usuario(nombre, contrasena, mail, new ListaCancion()));
    }
}
