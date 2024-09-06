package e176listtest;

import org.example.e176.E176List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E176ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testArrayListAddAndClear() {
        // Execute the main method to simulate the output
        E176List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "[111, 222, 333, 444, 555, 666]" + System.lineSeparator() +
                "[]" + System.lineSeparator();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}