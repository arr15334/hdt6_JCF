/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class Desarrollador {
    private String name;
    private boolean esJava;
    private boolean esWeb;
    private boolean esCelular;

    public Desarrollador(String name, boolean esJava, boolean esWeb, boolean esCelular) {
        this.name = name;
        this.esJava = esJava;
        this.esWeb = esWeb;
        this.esCelular = esCelular;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEsJava() {
        return esJava;
    }

    public void setEsJava(boolean esJava) {
        this.esJava = esJava;
    }

    public boolean isEsWeb() {
        return esWeb;
    }

    public void setEsWeb(boolean esWeb) {
        this.esWeb = esWeb;
    }

    public boolean isEsCelular() {
        return esCelular;
    }

    public void setEsCelular(boolean esCelular) {
        this.esCelular = esCelular;
    }
    
    
}
