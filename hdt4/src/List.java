
import java.util.Iterator;

/**
 *
 * @author arriaza96
 * @param <E>
 */
public interface List<E> 
{

    /**
     *
     * @return el tamano
     */
    public int size();
   // post: returns number of elements in list

    /**
     *
     * @return verdadero si esta vacio
     */
    public boolean isEmpty();
   // post: returns true iff list has no elements

    /**
     * limpia la lista
     */
    public void clear();
   // post: empties list

    /**
     *
     * @param value item a ser anadido de primero a la lista
     */
    public void addFirst(E value);
   // post: value is added to beginning of list

    /**
     *
     * @param value a ser anadido al final de la lista
     */
    public void addLast(E value);
   // post: value is added to end of list

    /**
     *
     * @return el primer elemento
     */
    public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

    /**
     *
     * @return el ultimo elemento
     */
    public E getLast();
   // pre: list is not empty
   // post: returns last value in list

    /**
     *
     * @return el primer elemento
     */
    public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

    /**
     *
     * @return el ultimo elemento
     */
    public E removeLast();
   // pre: list is not empty
   // post: removes last value from list

    /**
     *
     * @param value a ser quitado
     * @return el valor quitado
     */
    public E remove(E value);
   // post: removes and returns element equal to value
   // otherwise returns null

    /**
     *
     * @param value a ser anadido
     */
    public void add(E value);
   // post: value is added to tail of list

    /**
     *
     * @return el valor quitado
     */
    public E remove();
   // pre: list has at least one element
   // post: removes last value found in list

    /**
     *
     * @return el ultimo elemento
     */
    public E get();
   // pre: list has at least one element
   // post: returns last value found in list

    /**
     *
     * @param value a buscar
     * @return verdadero si lo encontro
     */
    public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

    /**
     *
     * @param value a buscar
     * @return index de su posicion
     */
    public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

    /**
     *
     * @param value a buscar
     * @return lugar donde se encontro
     */
    public int lastIndexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

    /**
     *
     * @param i posicion a buscar
     * @return lo que hay en esa posicion
     */
    public E get(int i);
   // pre: 0 <= i < size()
   // post: returns object found at that location

    public E set(int i, E o);
   // pre: 0 <= i < size()
   // post: sets ith entry of list to value o;
   // returns old value

    public void add(int i, E o);
   // pre: 0 <= i <= size()
   // post: adds ith entry of list to value o

    public E remove(int i);
   // pre: 0 <= i < size()
   // post: removes and returns object found at that location
    public Iterator<E> iterator();
   // post: returns an iterator allowing
   // ordered traversal of elements in list
}