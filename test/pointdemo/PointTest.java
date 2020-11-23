package pointdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Al-Amin Islam Joy
 */
public class PointTest {
    
    public PointTest() {
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

    /**
     * Test of getDistance method, of class Point.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Point p2=new Point(4,2);
        Point p1 = new Point(4,0);
        double expResult = 2;
        double result =p1.getDistance(p2);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class Point.
     */
    @Test
    public void testTranslate() {
        System.out.println("translate");
         Point p2=new Point(2,5);
        Point p1 = new Point(3,2);
        p1.translate(p2);
        assertEquals(5,p1.x,0.00001);
        assertEquals(7,p1.y,0.00001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class Point.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        double rotateInDegree = 10.0;
        Point p1=new Point(4,2);
        p1.rotate(rotateInDegree);
         assertEquals(3.59193,p1.x,0.00001);
        assertEquals(2.66421,p1.y,0.00001);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
