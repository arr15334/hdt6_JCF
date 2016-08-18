
/**
 *
 * @author Rodrigo Arriaza;
 */
public class StackFactory extends AbstractFactory{
     
    /**
     *
     * @param stackType
     * @return un stack de tipo vector o arraylist
     */
    public Stack makeStack(String stackType){ 
        Stack newStack = null;
        if (stackType.equals("ArrayList")){
            
            StackArrayList<Double> elStack = new StackArrayList();
            return elStack;    
        } else
        if (stackType.equals("Vector")){
            StackVector<Double> elStack = new StackVector();
            return elStack;
        }
         else return null;
    }
}
