
/*
 * UVG - Algoritmos y Estructuras de Datos
 * Calculadora que utiliza el Stack para hacer un calculo Postfix
 * 
 */

/**
 *
 * @author codigo tomado del ejercicio 2, hecho por Alejandro Chaclan, Rodrigo Arriaza y Sebastian Galindo
 */
public class calculadora {
   
    
     
    /**
     * aqui viene la implementacion del patron Singleton
     */
    private calculadora() { //se hace privado el constructor
     
    }
    private static calculadora calculadoraInstance = new calculadora();
    public static calculadora getInstance (){
        return calculadoraInstance;
    }
    
    
    
    //Funcion para evaluar el postfix

    /**
     *
     * @param s
     * @param stack
     * @return Resultado en double
     */
        public double eval(String s, Stack<Double> stack) {
            //stack = stack1;
        //Se recorre el string caracter por caracter
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //Si el caracter es un digito, se agrega el stack
            if (Character.isDigit(ch)) {
                stack.push(Double.parseDouble(Character.toString(ch)));
            } else {
                //Si el caracter no es un digito, se ralizan las operaciones con los numeros en el stack
                switch (ch) {
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        stack.push(stack.pop() - stack.pop());
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        stack.push(stack.pop() / stack.pop());
                        break;
                }
            }
        }
        return stack.peek();
    }
}
