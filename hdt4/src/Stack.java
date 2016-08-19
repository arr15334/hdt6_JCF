
/**
 *
 * @author codigo tomado de BlackBoard  
 * @param <E> tipo de dato
 */
public interface Stack<E> 
{

    /**
     *
     * @param item tipo de dato
     * pre:
     * post: item is added to stack
     * will be popped next if no intervening push
     */
    public void push(E item);
   
   
    /**
     *
     * @return el ultimo elemento en entrar al stack
     * pre: stack is not empty
     * post: most recently pushed item is removed and returned
     */
    public E pop();
    
    /**
     *
     * @return elemento del stack
     * pre: stack is not empty
     * post: top value (next to be popped) is returned
     */
    public E peek();
    
    /**
     *
     * @return true if empty, false if not empty
     * post: returns true if and only if the stack is empty
     */
    public boolean empty();
   
    /**
     *
     * @return size of the Stack
     * post: returns the number of elements in the stack
     */
    public int size();
   

}