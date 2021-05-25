package ro.ase.csie.cts.g1092.testing.tests;

import org.junit.*;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestStudent {
    //unit tests should not depend on other tests, they don't run in a specific order

    static Student student;
    static ArrayList<Integer> grades;
    static String initialName;
    static int initialAge;

    @BeforeClass //only once
    public static void beforeClass() throws Exception {
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "John";
        initialAge = 21;
    }

    //logic destructor
    @AfterClass //only once
    public static void afterClass() throws Exception {
        grades.clear(); //optional
    }

    @Before //each unit test
    public void setUp() throws Exception {
        //creating the object before each test, performance is not a concern in unit testing
        student = new Student(initialName, initialAge, grades);
    }

    @After //each unit test
    public void tearDown() throws Exception {
        student = null; //optional
    }

    @Ignore
    @Test
    public void test() {
        fail("not implemented");
    }

    @Test
    public void testSetNameRightValues() throws WrongNameException {


        String newName = "Alice";
        //when you don t expect an exception you may throw it further (bc the values are right)
        student.setName(newName);

        assertEquals("Testing with proper name", newName, student.getName());
    }

    @Test
    public void setAgeRightValues() {
        int newAge = initialAge + 1; //we need a new value
        //also when you expect correct behaviour, fail the test if an exception is caught
        try {
            student.setAge(newAge);
            assertEquals("Testing for proper age", newAge, student.getAge());
        } catch (WrongAgeException e) {
            fail("We got an exception when that was not expected");
        }
    }

    @Test
    public void testSetNameErrorCondition() {
        String newName = "Io";
        //here we expect an exception
        try {
            student.setName(newName);
            fail("we didn't get the expected exception");
        } catch (WrongNameException e) {
            //unit test has passed
            assertTrue(true);
        }
    }

    //same behaviour as above, used from junit4 and above
    @Test(expected = WrongAgeException.class)
    public void setAgeErrorCondition() throws WrongAgeException {
        int newAge = -3;
        student.setAge(newAge);
    }

    @Test
    public void testGetMinGradeOrderingAsc() throws WrongGradesException {
        ArrayList<Integer> orderedGrades = new ArrayList<>();
        orderedGrades.add(7);
        orderedGrades.add(8);
        orderedGrades.add(9);

        student.setGrades(orderedGrades);
        int expectedGrade = 7;
        int minGrade = student.getMinGrade();
        assertEquals("Testing with an ordered array of grades", expectedGrade, minGrade);
    }

    @Test
    public void testGetMinGradeCardinalityZero() throws WrongGradesException {
        ArrayList<Integer> emptyGrades = new ArrayList<>();
        student.setGrades(emptyGrades);
        int expectedGrade = 0;
        int minGrade = student.getMinGrade();
        assertEquals("Testing with 0 grades", expectedGrade, minGrade);
    }

    @Test
    public void testGetMinGradeCardinalityOne() throws WrongGradesException {
        int singleGrade = 9;
        ArrayList<Integer> oneGrade = new ArrayList<>();
        oneGrade.add(singleGrade);
        student.setGrades(oneGrade);
        int expectedGrade = singleGrade;
        int minGrade = student.getMinGrade();
        assertEquals("Testing with 0 grades", expectedGrade, minGrade);
    }

    @Test
    public void testSetNameInverseRelation() throws WrongNameException {
        String newName = "Alice";
        student.setName(newName);
        assertNotEquals("", initialName, student.getName());
    }
}