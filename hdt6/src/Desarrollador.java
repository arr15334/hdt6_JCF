/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class Desarrollador implements Comparable<Desarrollador>{
    private String name;
    private boolean JavaDeveloper;
    private boolean WebDeveloper;
    private boolean CelularDeveloper;

    public Desarrollador(String name, boolean JavaDeveloper, boolean WebDeveloper, boolean CelularDeveloper) {
        this.name = name;
        this.JavaDeveloper = JavaDeveloper;
        this.WebDeveloper = WebDeveloper;
        this.CelularDeveloper = CelularDeveloper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isJavaDeveloper() {
        return JavaDeveloper;
    }

    public void setJavaDeveloper(boolean JavaDeveloper) {
        this.JavaDeveloper = JavaDeveloper;
    }

    public boolean isWebDeveloper() {
        return WebDeveloper;
    }

    public void setWebDeveloper(boolean WebDeveloper) {
        this.WebDeveloper = WebDeveloper;
    }

    public boolean isCelularDeveloper() {
        return CelularDeveloper;
    }

    public void setCelularDeveloper(boolean CelularDeveloper) {
        this.CelularDeveloper = CelularDeveloper;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Desarrollador o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return name.compareTo(o.name);
    }
    
    
}
