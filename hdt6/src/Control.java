
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastián
 */

public class Control {
 
    Factory laFactory = new Factory();
    Desarrollador miDesarrollador;
    Operaciones misOperaciones = new Operaciones();
    Set<Desarrollador> miSet;
    ArrayList<String> miArrayList = new ArrayList();
    public int x;

    public Control() {
    }

    
    public void creacion(String tipoSet){
        
        //JOptionPane.showMessageDialog(null,var);
        miSet = laFactory.makeFactory(tipoSet);  
    }
    
    public void agregar(boolean web, boolean java, boolean celular, String name){
        miDesarrollador = new Desarrollador(name, java, web, celular);
        miSet.add(miDesarrollador);    
    }
    
    public String reporte(){ 
        String reporte="";

        //Pregunta 1: Se agregan los desarrolladores con experiencia en Java, WEb y Celular al reporte
        String prueba = misOperaciones.javawebcelular(miSet);
        reporte="Los desarrolladores con experiencia en java, web y celulares son: \n";
        for(int i=0;x<miArrayList.size();i++){
            reporte = reporte + prueba+ "\n";
        }
        
        //Pregunta 2: Se agregan los desarrolladores con experiencia en Java pero que no tienen experiencia en Web
        miArrayList = misOperaciones.javanotweb(miSet);
        reporte=reporte+"\n Los desarrolladores con experiencia en Java pero no Web son: \n";
        for(x=0;x<miArrayList.size();x++){
            reporte = reporte + miArrayList.get(x)+ "\n";
        }
        
        //Pregunta 3: Se agregan los desarrolladores con experiencia Web y Celular pero no Java
        miArrayList = misOperaciones.webcelularnotjava(miSet);
        reporte=reporte + "\nLos desarrolladores con experiencia Web y Celular pero no en Java son: \n";
        for(x=0;x<miArrayList.size();x++){
            reporte = reporte + miArrayList.get(x)+ "\n";
        }
        
        //Pregunta 4: Se agregan los desarrolladores con experiencia Web y Celular pero no Java
        miArrayList = misOperaciones.weborcelularnotjava(miSet);
        reporte=reporte+"Los desarrolladores con experiencia Web o Celular pero no en Java son: \n";
        for(x=0;x<miArrayList.size();x++){
            reporte = reporte + miArrayList.get(x)+ "\n";
        }
        
        //Pregunta 4: Se agregan los desarrolladores con experiencia Web y Celular pero no Java
        miArrayList = misOperaciones.masgrande(miSet);
        reporte=reporte+"El array mas grande ordenado de forma ascendente es: \n";
        for(x=0;x<miArrayList.size();x++){
            reporte = reporte + miArrayList.get(x)+ "\n";
        }
        
        
        return reporte;
    }
    
    
}
