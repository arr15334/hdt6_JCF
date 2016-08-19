/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo
 */
public class StackSinglyLinkedList<E> extends AbstractStack<E> {

    protected SinglyLinkedList<E> data;
    
    public StackSinglyLinkedList (){
        
    }
    
    @Override
    public boolean empty() {
        return size()==0;
    }

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1); 
    }

    @Override
    public E peek() {
        return data.get(size()-1); 
    }

    @Override
    public int size() {
       return data.size();
    }
 

    
}
