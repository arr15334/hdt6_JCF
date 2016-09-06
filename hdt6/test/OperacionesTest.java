/*
 *solo se prueba el metodo isSubconjunto para hacer el profiler del metodo
 */

import java.util.ArrayList;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Arriaza;
 */
public class OperacionesTest {
    Set<Desarrollador> webdevs;
    Set<Desarrollador> javadevs;
    Factory lafatoria = new Factory();
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Before
    public void fillear(){
        String tipoSet = "HashSet"; //poner aqui HashSet/TreeSet/LinkedHashSet  para cambiar
        int tamanoSet = 5000;   //cambiar esto para probar con sets mas grandes
        webdevs = lafatoria.makeFactory(tipoSet);
        javadevs = lafatoria.makeFactory(tipoSet);
        for (int i =0; i<tamanoSet; i++){
            Desarrollador des = new Desarrollador("Dev "+i, true, true, false);
            webdevs.add(des);
            javadevs.add(des);
        }
    }
    
    @Test
    public void testIsSubconjunto() {
        System.out.println("isSubconjunto");
        boolean result = webdevs.containsAll(javadevs);
        boolean expResult = true;
        assertEquals(expResult, result);   
    }

   
    
}
