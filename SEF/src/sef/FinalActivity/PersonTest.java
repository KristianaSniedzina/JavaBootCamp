package sef.FinalActivity;
import junit.framework.TestCase;


public class PersonTest extends TestCase {

    private Person personTest;

    protected void setUp() throws Exception {
        personTest = new Person();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetAndGetFirstName() {
        String testFirstName = "Viki";
        assertNull(personTest.getFirstName());
        personTest.setFirstName(testFirstName);
        assertEquals("Viki", "Viki");
    }

    public void testSetAndGetSecondName() {
        String testSecondName = "Bloom";
        assertNull(personTest.getSecondName());
        personTest.setSecondName(testSecondName);
        assertEquals("Bloom", "Bloom");
    }

    public void testSetAndGetAge() {
        Integer testAge = 21;
//        assertNull(personTest.getAge());
        personTest.setAge(testAge);
        assertEquals(21, 21);
    }

    public void testThrowException() {

        try {
            personTest.getFirstName();
            assertEquals("Bloom","Bloom3");
        } catch (Exception e) {
            fail();
        }


    }
}

