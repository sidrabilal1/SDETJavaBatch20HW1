package e153superkeywordtest;

import org.example.e153.E153SuperKeyword; // Ensure this matches the actual package and class name
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E153SuperKeywordTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirects System.out to capture the console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restores System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testChildClassConstructorCallsParent() {
        // Execute the main method to generate output
        E153SuperKeyword.main(new String[]{});
        // The expected output is the statement printed by the Vehicle class constructor
        String expectedOutput = "This is the Vehicle constructor";

        // Asserts that the captured output matches the expected output
        assertEquals("The output from the main method does not match the expected output.", expectedOutput, outContent.toString().trim());
    }
}