
/**
 *
 * @author arriaza96
 * @param <E> tipo de dato
 */
public class DoublyLinkedNode<E>
{

    /**
     *
     */
    protected E data;

    /**
     *
     */
    protected DoublyLinkedNode<E> nextElement;

    /**
     *
     */
    protected DoublyLinkedNode<E> previousElement;

    /**
     *
     * @param v dato
     * @param next nodo siguiente
     * @param previous nodo anterior
     */
    public DoublyLinkedNode(E v,
                        DoublyLinkedNode<E> next,
                        DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

    /**
     *
     * @param v element0
     */
    public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     *
     * @return el siguiente elemento
     */
    public DoublyLinkedNode<E> next(){
    return nextElement;
}

    /**
     *
     * @return el elemento previo
     */
    public DoublyLinkedNode<E> previous(){
    return previousElement;
}

    /**
     *
     * @param item a ser puesto
     */
    public void setNext(DoublyLinkedNode<E> item){
        nextElement = item;
    }

    /**
     *
     * @return el valor
     */
    public E value(){
        return data;
    }

    /**
     *
     * @param item a ser puesto 
     */
    public void setPrevious(DoublyLinkedNode<E> item){
        previousElement = item;
    }

}