/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de trabajo 4: Patrones de diseno
 * Rodrigo Arriaza y Sebastian Galindo
 * Clase principal.
 */

/**
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Arriaza y Sebastian Galindo
 */
public class main {
    
    static String tipoFabrica;
    static Factory lafabrica = new Factory();
    static AbstractFactory lamera;
    static Stack elstack = null;
    static Scanner userInput = new Scanner(System.in);

    public static void pedir(){
        System.out.print("¿Que estructura de datos desea probar? (Stack/List)");
        if (userInput.hasNextLine()){
            tipoFabrica = userInput.nextLine();
            if (tipoFabrica.equals("Stack")|| tipoFabrica.equals("List")){
                 lamera = lafabrica.makeFactory(tipoFabrica);
            }
        }
        
        if (tipoFabrica.equals("Stack")){
            System.out.print("¿Que tipo quiere de Stack desea utilizar? (ArrayList/Vector)");
            if (userInput.hasNextLine()){
                String tipoStack = userInput.nextLine();
                if (tipoStack.equals("Vector") || tipoStack.equals("ArrayList")){
                    elstack = lamera.makeStack(tipoStack);
                }
            }
        } else {
            if (tipoFabrica.equals("List")){
                System.out.print("Que tipo quiere? (Single/Double/Circular)");
                if (userInput.hasNextLine()){
                    String tipoLista = userInput.nextLine();
                    if (tipoLista.equals("Single") || tipoLista.equals("Double") || tipoLista.equals("Circular")){
                        elstack = lamera.makeStack(tipoLista);
                     }
                }
            }
        }
    } 
    
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        calculadora calc = calculadora.getInstance();
        
        String linea = "";
    
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\operacion.txt"));

            linea = br.readLine();

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        pedir();
        Double resp = calc.eval(linea, elstack);
        System.out.println("El resultado es: "+resp);
    }
}

