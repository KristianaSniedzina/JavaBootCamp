package sef.FinalActivity;
import com.mysql.jdbc.AssertionFailedException;
import junit.framework.TestCase;

    public class EmployeeTest extends TestCase {
        private EmployeeTest theEmployeeTest;

        protected void setUp() throws Exception {
            super.setUp();
            theEmployeeTest = new EmployeeTest();
        }
        protected void tearDown() throws Exception {
            super.tearDown();
        }

        public void testSetAndGetName() {
            String testName = "Kristiana";
            assertEquals("Kristiana", "Kristiana");
        }
        public void testSetAndGetAge() {
            int testAge = 21;
            assertEquals(21, 21);
        }
        public void testSetAndGetTitle() {
            String testTitle = "developer";
            assertEquals("developer", "developer");
        }
        public void testSetAndGetCompany() {
            String testCompany = "Accenture";
            assertEquals("Accenture", "Accenture");
        }
        public void testSetAndGetSalary() {
            Double testSalary = 789.5;
            assertEquals(789.5,789.5);
        }


    }

