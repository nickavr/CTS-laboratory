package ro.ase.csie.cts.g1092.testing.tests;

import org.junit.*;
import ro.ase.csie.cts.g1092.testing.models.MathOperations;

import static org.junit.Assert.*;

public class MathOperationsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Let's start testing");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("CleanUp");
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Hello from test case");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Bye form test case");
    }

    @Test
    public void add() {
        int a = 5;
        int b = 8;
        int expectedRes = 13;
        int result = MathOperations.add(a, b);

        assertEquals("Testing adding 2 int values", expectedRes, result);
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void divide() {
    }
}