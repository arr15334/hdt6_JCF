import java.util.ArrayList;

/**
 *
 * @author arriaza96 tomado de Blackboard
 * @param <E> tipo de objeto
 */
public class StackArrayList<E>
 implements Stack<E>
{

    /**
     *
     */
    protected ArrayList<E> data;

    /**
     * post: constructs a new, empty stack
     */
    public StackArrayList()
	// 
	{
		data = new ArrayList<E>();
	}

    /**
     *
     * @param item el valor a ser anadido
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