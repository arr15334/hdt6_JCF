
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
    Set<Desarrollador> javaSet;
    Set<Desarrollador> webSet;
    ArrayList<String> miArrayList = new ArrayList();
    public int x;

    public Control() {
    }

    
    public void creacion(String tipoSet){
        
        //JOptionPane.showMessageDialog(null,var);
        miSet = laFactory.makeFactory(tipoSet);  
    }
    
    public void agregar(boolean web, boolean java, boolean celular, String name){
        //JOptionPane.showMessageDialog(null, name);
        miDesarrollador = new Desarrollador(name, java, web, celular);
        miSet.add(miDesarrollador);   
        //System.out.printf("%s", miSet);
    }
    
    public String reporte(){ 
        String reporte="";

        //Pregunta 1: Se agregan los desarrolladores con experiencia en Java, WEb y Celular al reporte
        reporte= reporte + "\n" +  misOperaciones.javawebcelular(miSet);
        
        //Pregunta 2: Se agregan los desarrolladores con experiencia en Java pero no Web en el reporte
        reporte = reporte + "\n" +  misOperaciones.javanotweb(miSet);
        
        //Pregunta 3: Se agregan los desarrolladores con experiencia web y celular pero no Java en el reporte.
        reporte = reporte + "\n" +  misOperaciones.webcelularnotjava(miSet);
        
        //Pregunata 4: Se agregan los desarrolladores con experiencia web o celular pero no experiencia en Java en el reporte.
        reporte = reporte + "\n" + misOperaciones.weborcelularnotjava(miSet);
        
        //Pregunta 5: Se indica si el conjunto de desarrolladores de java es subconjunto de web y se agrega al reporte.
        reporte = reporte + "\n" + misOperaciones.subconjunto(miSet);
        
        
        return reporte;
    }
    
    
}
