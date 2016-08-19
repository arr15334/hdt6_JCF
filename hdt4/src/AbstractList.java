

/**
 *
 * @author Rodrigo Arriaza y Sebastián Galindo.
 * @param <E> el tipo de dato
 */
public abstract class AbstractList<E>
       implements List<E>
{

    /**
     *
     */
    public AbstractList()
   // post: does nothing
   {
   }

    /**
     *
     * @return true si la lista esta vacia
     */
    public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
    /**
     *
     * @param value a buscar
     * @return verdadero si esta en la lista
     */
    public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
}