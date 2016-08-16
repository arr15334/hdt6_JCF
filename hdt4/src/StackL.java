
import java.util.LinkedList;
import java.util.List;

// : c11:StackL.java
// Making a stack from a LinkedList.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

public class StackL<E> implements Stack<E> {

  protected List<E> list;
  //public Linkedlist; 

  
public List<Double> makeStack(String stackType){ 
        List lalista = null;
        if (stackType.equals("Single")){
            SinglyLinkedList lista = new SinglyLinkedList();
            return (List<Double>) lista;    
        } else
        if (stackType.equals("Double")){
            DoublyLinkedList lista = new DoublyLinkedList();
            return (List<Double>) lista;
        } else
        if (stackType.equals("Circular")){
            CircularList lista = new CircularList();
            return (List<Double>) lista;
        }
         else return null;
}  
  public StackL() {
      list = new LinkedList<E>();
  }
  
  public void push(E v) {
    list.add(v);
  }

  public E peek() {
    return null;
  }

  public E pop() {
    return list.remove(size()-1);
  }

    @Override
    public boolean empty() {
    return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

} 