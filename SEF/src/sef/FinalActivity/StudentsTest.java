package sef.FinalActivity;
import junit.framework.TestCase;

public class StudentsTest extends TestCase {

    private Students theStudentsTest;

    protected void setUp() throws Exception {
        theStudentsTest = new Students();
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void SetAndGetSchoolName() {
        String testSchoolName = "University of Latvia";
        assertNull(theStudentsTest.getSchoolName());
        theStudentsTest.setSchoolName(testSchoolName);
        assertEquals("University of Latvia", "University of Latvia");
    }
}
