//se crea la factory
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
