
import java.util.Iterator;

/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo
 * @param <E> que es el tipo de dato
 */
public class CircularList<E> extends AbstractList<E>{

    /**
     *
     */
    protected Node<E> tail; 

    /**
     *
     */
    protected int count;

    /**
     *
     */
    public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

    /**
     *
     * @return el primer elemento de la lista
     */
    @Override
    public E getFirst() {
        return tail.value();
    }

    /**
     *
     * @param value item que se va a agregar a la lista
     */
    public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       //tail.setNext(tail); esta linea no es necesaria
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

    /**
     *
     * @param value item que se agregara al final de la lista
     */
    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}

    /**
     *
     * @return el primer elemento y lo quita
     */
    @Override
    public E removeFirst() {
        E item = null;
        if (size() > 0){
            Node<E> head = tail.next();
            if (head != null){
                tail.setNext(head.next());
                item = head.data;
            }else {
                item = tail.data;
                tail = null;
            }
        }else return null;
        count--;
        return item;
    }

    /**
     *
     * @return el ultimo elemento y lo quita
     */
    public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   }
   count--;
   return temp.value();
}
@Override
    public int size() {
        return count;
    }
    //**************estos son las implementaciones del Stack<E>
   //@Override
   // public void push(E item) {
     //   addFirst(item);
    //}
//@Override
    //public E pop() {
      //  return removeFirst();
   // }
    //@Override
    //public E peek() {
      //  return getFirst();
    //}

    /**
     *
     * @return el ultimo elemento de la lista
     */
    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//*************************************estos metodos no tienen implementacion

    /**
     *
     * @param i position 
     * @return element
     */
        @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return Iterator
     */
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param value a quitar
     * @return value
     */
    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param value a ser anadido
     */
    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return elemento
     */
    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param value a buscar
     * @return posicion
     */
    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param value a buscar
     * @return posicion
     */
    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param i position
     * @return elemento
     */
    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param i position
     * @param o elemento
     * @return elemento
     */
    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param i position
     * @param o elemento
     */
    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}