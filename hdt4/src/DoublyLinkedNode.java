
/**
 *
 * @author arriaza96
 * @param <E>
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
     * @param v
     * @param next
     * @param previous
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
     * @param v
     */
    public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     *
     * @return
     */
    public DoublyLinkedNode<E> next(){
    return nextElement;
}

    /**
     *
     * @return
     */
    public DoublyLinkedNode<E> previous(){
    return previousElement;
}

    /**
     *
     * @param item
     */
    public void setNext(DoublyLinkedNode<E> item){
        nextElement = item;
    }

    /**
     *
     * @return
     */
    public E value(){
        return data;
    }

    /**
     *
     * @param item
     */
    public void setPrevious(DoublyLinkedNode<E> item){
        previousElement = item;
    }

}