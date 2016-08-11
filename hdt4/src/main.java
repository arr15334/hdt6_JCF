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

/**
 *
 * @author arriaza96
 */
public class main {    

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        String temp = "12+4*3+";
        calculadora calc = new calculadora();
        String linea = "";
    
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\prueba.txt"));

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
        
        Double resp = calc.eval(linea);
        System.out.println("El resultado es: "+resp);
    }
}

