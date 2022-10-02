package myclass;

import junit.framework.TestSuite;

public class AllTests {
    public static junit.framework.TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        return suite;
    }
}
