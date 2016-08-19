
import java.util.Vector;



/**
 *
 * @author Rodrigo Arriaza;
 * @param <E> tipo de dato
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
     * @param item el item a ser anadido 
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

