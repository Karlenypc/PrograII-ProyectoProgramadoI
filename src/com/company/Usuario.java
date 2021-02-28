/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Vector;

/**
 *
 * @author pimie
 */
public class Usuario {
    private String nick;
    private String password;
    private String rango;
    
    public Usuario(){
        
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRango() {
        return rango;
    }
    

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    public static Vector mostrar(){
        return ListaUsuario.mostrar();
        
    }
    public static int identificarUsuarioNuevo(String usuario){
      Vector lista = mostrar();
      Usuario obj;
      for (int i = 0; i<lista.size(); i++){
        obj= (Usuario)lista.elementAt(i);
        if(obj.getNick().equalsIgnoreCase(usuario)){
            return i;
        }    
    }
      return -1;
    }
    
    public static int verificarIngreso( String usuario, String constrasena){
       Vector lista = mostrar();
       Usuario obj;
       for(int i = 0; i<lista.size(); i++){
           obj = (Usuario)lista.elementAt(i);
           if(obj.getNick().equalsIgnoreCase(usuario) && obj.getPassword().equalsIgnoreCase(constrasena)){
               return i;
           }
       }
       return -1;
    }
            
}
