
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class Factory<E> {
    public Set<E> makeFactory(String factoryType){
        Set<E> elSet = null;
        if(factoryType.equalsIgnoreCase("HashSet")){
            elSet = new HashSet<E>();
        }
        if(factoryType.equalsIgnoreCase("TreeSet")){
            elSet = new TreeSet<E>();
        }
        if (factoryType.equalsIgnoreCase("TreeSet")){
            elSet = new LinkedHashSet<E>();
        }
    return elSet;
    }
}
