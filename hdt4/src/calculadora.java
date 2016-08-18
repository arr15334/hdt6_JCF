
/*
 * UVG - Algoritmos y Estructuras de Datos
 * Calculadora que utiliza el Stack para hacer un calculo Postfix
 * 
 */

/**
 *
 * @author Alejandro Chaclan
 */
public class calculadora {
   
    
     
    /**
     *
     */
    public calculadora() {
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