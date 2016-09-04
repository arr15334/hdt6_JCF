//se crea la factory
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Rodrigo Arriaza;
 * @param <E>
 */
public class Factory<E> {
    public Set<E> makeFactory(String factoryType){
        Set<E> elSet = null;
        if(factoryType.equals("HashSet")){
            elSet = new HashSet<E>();
        }
        if(factoryType.equals("TreeSet")){
            elSet = new TreeSet<E>();
        }
        if (factoryType.equals("LinkedHashSet")){
            elSet = new LinkedHashSet<E>();
        }
    return elSet;
    }
}
