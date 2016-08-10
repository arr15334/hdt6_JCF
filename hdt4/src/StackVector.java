
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class StackVector<E> implements Stack<E>
{

    /**
     *
     */
    protected Vector<E> data;

    /**
     * post: constructs a new, empty stack
     */
    public StackVector()
	// 
	{
		data = new Vector<E>();
	}

    /**
     *
     * @param item
     */
    public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    /**
     *
     * @return ultimo elemento del stack
     */
    public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    /**
     *
     * @return muestra el ultimo elemento del stack
     */
    public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    /**
     *
     * @return post: returns the number of elements in the stack
     */
    public int size()
	// 
	{
		return data.size();
	}
  
    /**
     *
     * @return post: returns true if and only if the stack is empty
     */
    public boolean empty()
	// 
	{
		return size() == 0;
	}
}

