
import java.util.Iterator;

/**
 *
 * @author arriaza96
 * @param <E> el tipo de dato
 */
public class DoublyLinkedList<E> extends AbstractList<E> implements Stack <E>{

    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;
   
    public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

    /**
     *
     * @param value a ser anadido
     */
    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

    /**
     *
     * @param value para anadir al final
     */
    public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

    /**
     *
     * @return el primer elemento y lo quita de la lista
     */
    @Override
    public E removeFirst() {
        DoublyLinkedNode<E> temp = head;
        head = head.next();
        if (head == null){
            tail = null;
        }else{
            head.setPrevious(null);
        }
        count--;
        return temp.value();
    }

    /**
     *
     * @return el ultimo elemento y lo quita de la lista 
     */
    public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
    {
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }

    public void push(E item){
        addFirst(item);
    }
    public E pop (){
        return removeLast();
    }
    public E peek () {
        return tail.data;
    }
    @Override
    public int size() {
        return count;
    }

    //*****************************estos metodos no fueron implementados
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void add(E value) {    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int i, E o) {    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean empty() {
        return size()==0;
    }
}