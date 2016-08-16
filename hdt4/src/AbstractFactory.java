/**
 *
 * @author Rodrigo Arriaza;
 */
public abstract class AbstractFactory {
    public abstract <E> Stack<E> makeStack(String tipoStack);
}

