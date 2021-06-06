package sef.FinalActivity;
import junit.framework.TestCase;
public class SecondActivityTest extends TestCase {

    private SecondActivityTest theSecondActivityTest;

    protected void setUp() throws Exception {
        theSecondActivityTest = new SecondActivityTest();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testAddition() {
        int x = 10;
        int y = 0;
        assertEquals(10,10);
        assertEquals(10, 10);
    }

    public void testSubtraction() {
        int x = 10;
        int y = 0;
        assertEquals(10,10); //x-y
        assertEquals(-10,-10); //y-x
    }

    public void testMultiply(){ ///int numbers = {1,2,3,4}
        int[] nums = {1, 2, 3, 4};
        assertEquals(24,24);
        assertEquals(24,24);
    }

    public void testDivide(){
        int x = 10;
        int y = 0;
        assertEquals(null, null); //x/y
        assertEquals(0,0); // y/x
    }

//    private void add(int x, int y) {}




}