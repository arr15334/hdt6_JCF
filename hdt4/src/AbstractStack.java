/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza y Sebastián Galindo;
 * @param <E> el tipo de dato que se va a usar
 */
public abstract class AbstractStack<E> implements Stack<E> {
    
    @Override
    public abstract void push(E item);

    @Override
    public abstract E pop();

    @Override
    public abstract E peek();

    @Override
    public abstract int size();

    @Override
    public boolean empty() {
        return size() == 0;
    }
}
