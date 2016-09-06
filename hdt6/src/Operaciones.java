import java.util.*;

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
    public String javawebcelular(Set<Desarrollador> set){
        //Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        String resultado = "Desarrolladores de java, web y celulares:\n";//+arreglo[1].toString()+arreglo[1].isWebDeveloper()+arreglo[1].isCelularDeveloper()+arreglo[1].isJavaDeveloper();
        //int n = arreglo.length;
        for (Desarrollador des : set){
            if (des.isCelularDeveloper() && des.isJavaDeveloper() && des.isWebDeveloper()){
                resultado = resultado + des.toString()+", ";
            }
        }/*
        for (int i =0 ; i<n ; i++){
            if (arreglo[i].isCelularDeveloper() && arreglo[i].isJavaDeveloper() && arreglo[i].isWebDeveloper()){
                resultado =  resultado+arreglo[i].toString()+ ", ";
            }
        }*/
    return resultado;
    }
    //pregunta 2: experiencia en java pero no en web (no importa la exp en celulares)
    public String javanotweb(Set<Desarrollador> set){
        //Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        String resultado = "Desarrolladores de java, pero no de web:\n";
        //int n = arreglo.length;
        for (Desarrollador des : set){
            if (des.isJavaDeveloper() && !des.isWebDeveloper()){
                resultado = resultado + des.toString()+", ";
            }
        }/*
        for (int i =0 ; i<n ; i++){
            if (arreglo[i].isJavaDeveloper() && !arreglo[i].isWebDeveloper()){
                resultado = resultado + arreglo[i].toString()+ ", ";
            }
        }*/
    return resultado;
    }
    //pregunta 3: exp en web y celulares pero no en java
    public String webcelularnotjava(Set<Desarrollador> set){
        //Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        String resultado = "Desarrolladores de web y celular, pero no de java:\n";
        //int n = arreglo.length;
        for (Desarrollador des : set){
            if (des.isWebDeveloper() && des.isCelularDeveloper() && !des.isJavaDeveloper()){
                resultado = resultado + des.toString()+", ";
            }
        }/*
        for (int i =0 ; i<n ; i++){
            if (arreglo[i].isWebDeveloper() && arreglo[i].isCelularDeveloper() && !arreglo[i].isJavaDeveloper()){
                resultado=resultado+arreglo[i].toString()+", ";
            }
        }*/
    return resultado;
    }
    
    //pregunta 4: web o celular, pero no en java
    public String weborcelularnotjava(Set<Desarrollador> set){
        //Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        String resultado = "Web o celular, pero no en java:\n";
        //int n = arreglo.length;
        for (Desarrollador des : set){
            if (!des.isJavaDeveloper() && (des.isWebDeveloper() || des.isCelularDeveloper())){
                resultado = resultado+des.toString()+", ";
            }
        }/*
        for (int i =0 ; i<n ; i++){
            if (!arreglo[i].isJavaDeveloper() && (arreglo[i].isWebDeveloper() || arreglo[i].isCelularDeveloper())){
                resultado=resultado+arreglo[i].toString()+", ";
            }
        }*/
    return resultado;
    }
    
    //pregunta 5: java subconjunto de Web
    public String subconjunto (Set<Desarrollador> set){
        Set<Desarrollador> java = null;
        Set<Desarrollador> web = null;
        Desarrollador javaD;
        Desarrollador webD;
        
        //Crea un set solamente de desarrolladores de Java
        for (Desarrollador des : set){
            boolean javaDev = des.isJavaDeveloper();
            boolean webDev = des.isWebDeveloper();
            boolean celDev = des.isCelularDeveloper();
            String name = des.toString();
                    
            if (javaDev==true){
                javaD = new Desarrollador(name, javaDev, webDev, celDev);
                java.add(des);
            }
        }
        //Crea un set solamente de desarrolladores Web
        for (Desarrollador des : set){
            boolean javaDev = des.isJavaDeveloper();
            boolean webDev = des.isWebDeveloper();
            boolean celDev = des.isCelularDeveloper();
            String name = des.toString();
                    
            if (webDev==true){
                webD = new Desarrollador(name, javaDev, webDev, celDev);
                web.add(des);
            }
        }
        
        if(web.containsAll(java) == true){
            return "Si es subconjunto";
        }else{
            return "No es subconjunto";
        }
    }
    
    
     //pregunta 6: dice cual es el conjunto mas grande
    public ArrayList<String> masgrande(Set<Desarrollador> set){
        //Desarrollador[] arreglo = set.toArray(new Desarrollador[set.size()]);
        ArrayList<String> resultado = new ArrayList();
        ArrayList<String> java = new ArrayList();
        ArrayList<String> web = new ArrayList();
        ArrayList<String> celular = new ArrayList();
        
        //se obtiene un arreglo solamente de desarrolladores de java
        for (Desarrollador des : set){
            if (des.isJavaDeveloper()){
                java.add(des.toString());
            }
        }
        // se obtiene un arreglo solamente de desarrolladores Web
        for (Desarrollador des : set){
            if (des.isWebDeveloper()){
                web.add(des.toString());
            }
        }
        // se obtiene un arreglo solamente de desarrolladores Celular
        for (Desarrollador des : set){
            if (des.isCelularDeveloper()){
                celular.add(des.toString());
            }
        }
        
        //Se verifica que array posee la mayor cantidad de desarrolladores
        if(java.size()>celular.size() && java.size()> web.size()){
            Collections.sort(java);
            resultado = java;
        }else if(web.size()> celular.size() && web.size() >java.size() ){
            Collections.sort(web);
            resultado = web;
        }else if( celular.size() > java.size() && celular.size() > web.size() ) 
        {
            Collections.sort(celular);
            resultado = celular;
        }
    return resultado;
    }
        
}