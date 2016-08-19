/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo
 */
public class StackSinglyLinkedList<E> implements Stack<E> {

    protected SinglyLinkedList<E> data;
    
    public StackSinglyLinkedList (){
        data = new SinglyLinkedList<E>();
    }
    
    @Override
    public boolean empty() {
        return size()==0;
    }

    @Override
    public void push(E item) {
        data.addFirst(item);
    }

    @Override
    public E pop() {
        return data.removeFirst(); 
    }

    @Override
    public E peek() {
        return data.getFirst(); 
    }

    @Override
    public int size() {
       return data.size();
    }
 

    
}
