/**
 *
 * @author Rodrigo Arriaza;
 */
public abstract class AbstractFactory {

    /**
     *
     * @param <E>
     * @param tipoStack
     * @return
     */
    public abstract <E> Stack<E> makeStack(String tipoStack);
}

