
import java.util.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class Operaciones<E> {
    Set<E> elSet;

    public void setElSet(Set<Desarrollador> elSet) {
        this.elSet = (Set<E>) elSet;
    }
    
    //pregunta 1: experiencia en las tres
    public ArrayList<String> javawebcelular(Set<Desarrollador> set){
        Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        JOptionPane.showMessageDialog(null, arreglo.length);
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isCelularDeveloper() & arreglo[i].isJavaDeveloper() & arreglo[i].isWebDeveloper()){
                resultado.add(arreglo[i].toString());
                
            }
        }
    return resultado;
    }
    //pregunta 2: experiencia en java pero no en web (no importa la exp en celulares)
    public ArrayList<String> javanotweb(Set<Desarrollador> set){
        Desarrollador[] arreglo = set.toArray(new Desarrollador[50]);
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isJavaDeveloper() & !arreglo[i].isWebDeveloper()){
                resultado.add(arreglo[i].toString());
            }
        }
    return resultado;
    }
    //pregunta 3: exp en web y celulares pero no en java
    public ArrayList<String> webcelularnotjava(Set<Desarrollador> set){
        Desarrollador[] arreglo = set.toArray(new Desarrollador[50]);
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (!arreglo[i].isJavaDeveloper() & arreglo[i].isWebDeveloper() & arreglo[i].isCelularDeveloper()){
                resultado.add(arreglo[i].toString());
            }
        }
    return resultado;
    }
    
    //pregunta 4: web o celular, pero no en java
    public ArrayList<String> weborcelularnotjava(Set<Desarrollador> set){
        Desarrollador[] arreglo = set.toArray(new Desarrollador[50]);
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (!arreglo[i].isJavaDeveloper() & (arreglo[i].isWebDeveloper() || arreglo[i].isCelularDeveloper())){
                resultado.add(arreglo[i].toString());
            }
        }
    return resultado;
    }
    
    //pregunta 5: java subconjunto de Web
    public String javasubweb(Set<Desarrollador> set){
        String cadena = null;
        Desarrollador[] arreglo = set.toArray(new Desarrollador[50]);
        ArrayList<String> resultado = new ArrayList();
        ArrayList<String> java = new ArrayList();
        ArrayList<String> web = new ArrayList();
        
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isJavaDeveloper()){
                java.add(arreglo[i].toString());
            }
        }
        
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isWebDeveloper()){
                web.add(arreglo[i].toString());
            }
        }
        if(java.size()<web.size()){
            cadena= "Los desarrolladores de Java no son un subconjunto de los Desarrolladores Web";
        }else{
            n = web.size();
            Collections.sort(web);
            Collections.sort(java);
            for (int i =0 ; i>n ; i++){
                if (arreglo[i].isWebDeveloper()){
                web.add(arreglo[i].toString());
                }
            }
        }
    return cadena;
    }
    
    
     //pregunta 4: web o celular, pero no en java
    public ArrayList<String> masgrande(Set<Desarrollador> set){
        Desarrollador[] arreglo = set.toArray(new Desarrollador[50]);
        ArrayList<String> resultado = new ArrayList();
        ArrayList<String> java = new ArrayList();
        ArrayList<String> web = new ArrayList();
        ArrayList<String> celular = new ArrayList();
        
        int n = arreglo.length;
        //se obtiene un arreglo solamente de desarrolladores de java
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isJavaDeveloper()){
                java.add(arreglo[i].toString());
            }
        }
        // se obtiene un arreglo solamente de desarrolladores Web
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isWebDeveloper()){
                web.add(arreglo[i].toString());
            }
        }
        // se obtiene un arreglo solamente de desarrolladores Celular
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isWebDeveloper()){
                celular.add(arreglo[i].toString());
            }
        }
        
        //Se verifica que array posee la mayor cantidad de desarrolladores
        if(java.size()>=(celular.size() & web.size())){
            Collections.sort(java);
            resultado = java;
        }else if(web.size()>(celular.size() & java.size())){
            Collections.sort(web);
            resultado = web;
        }else if( celular.size() > ( java.size() & web.size() ) ){
            Collections.sort(celular);
            resultado = celular;
        }
    return resultado;
    }
    
}
