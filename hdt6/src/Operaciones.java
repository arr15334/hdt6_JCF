
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
    public ArrayList<String> javawebcelular(Set<Desarrollador> set){
        Desarrollador[] arreglo = (Desarrollador[]) set.toArray();
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (arreglo[i].isCelularDeveloper() & arreglo[i].isJavaDeveloper() & arreglo[i].isWebDeveloper()){
                resultado.add(arreglo[i].toString());
            }
        }
    return resultado;
    }
    //pregunta 2: experiencia en java pero no en web (no importa la exp en celulares)
    public ArrayList<String> javanotweb(Set<Desarrollador> set){
        Desarrollador[] arreglo = (Desarrollador[]) set.toArray();
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
        Desarrollador[] arreglo = (Desarrollador[]) set.toArray();
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
        Desarrollador[] arreglo = (Desarrollador[]) set.toArray();
        ArrayList<String> resultado = new ArrayList();
        int n = arreglo.length;
        for (int i =0 ; i>n ; i++){
            if (!arreglo[i].isJavaDeveloper() & (arreglo[i].isWebDeveloper() || arreglo[i].isCelularDeveloper())){
                resultado.add(arreglo[i].toString());
            }
        }
    return resultado;
    }
    
}
