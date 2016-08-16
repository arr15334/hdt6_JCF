/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ListFactory {
     public List makeLista(String listType){ 
        //Stack newStack = null;
        if (listType.equals("Single")){ 
            SinglyLinkedList<Double> laLista = new SinglyLinkedList();
            return laLista;    
        }else
         if (listType.equals("Double")){
            DoublyLinkedList<Double> laLista = new DoublyLinkedList();
            return laLista;    
        }else
         if (listType.equals("Circular")){
            CircularList<Double> laLista = new CircularList();
            return laLista;     
        }else{
             return null;
        }
    }

}
