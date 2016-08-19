/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza y Sebastián Galindo
 */
public class StackDoublyLinkedList<E> implements Stack<E> {

    protected DoublyLinkedList<E> data;
    
    public StackDoublyLinkedList (){
        data = new DoublyLinkedList<E>();
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
        return data.removeLast(); 
    }

    @Override
    public E peek() {
        return data.getLast(); 
    }

    @Override
    public int size() {
       return data.size();
    }
 
    
}
