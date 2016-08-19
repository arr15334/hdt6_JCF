/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo
 */
public class ListFactory extends AbstractFactory {
 
    /**
     *
     * @param <E>
     * @param listType
     * @return una lista como un stack
     */
    public <E> Stack<E> makeStack(String listType){ 
        //Stack newStack = null;
        if (listType.equals("Single")){ 
            StackSinglyLinkedList<E> laLista = new StackSinglyLinkedList();
            return laLista;    
        }else
         if (listType.equals("Double")){
            StackDoublyLinkedList<E> laLista = new StackDoublyLinkedList();
            return laLista;    
        }else
         if (listType.equals("Circular")){
            StackCircularList<E> laLista = new StackCircularList();
            return laLista;     
        }else{
             return null;
        }
    }

}
