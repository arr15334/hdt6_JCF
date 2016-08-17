/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author arriaza96
 */
public class main {    
    static StackFactory fabrica = new StackFactory();
    static ListFactory fabricaL = new ListFactory();
    static Stack elstack = null;
    static List<Double> laLista = null;
    static Scanner userInput = new Scanner(System.in);

    public static void pedir(){
        System.out.print("¿Que tipo de Stack? (ArrayList/Vector/Listas)");
        if (userInput.hasNextLine()){
            String tipoStack = userInput.nextLine();
            if(tipoStack.equals("ArrayList") || tipoStack.equals("Vector")){
                elstack = fabrica.makeStack(tipoStack);
            }else{
                if(tipoStack.equals("Listas")){
                    System.out.print("¿Que tipo de Lista? (Single/Double/Circular)");
                    if(userInput.hasNextLine()){
                        String tipoLista = userInput.nextLine();
                        if(tipoLista.equals("Single") || tipoLista.equals("Double") || tipoLista.equals("Circular")){    
                            elstack = fabricaL.makeStack(tipoLista);
                         }
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
        calculadora calc = new calculadora();
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

