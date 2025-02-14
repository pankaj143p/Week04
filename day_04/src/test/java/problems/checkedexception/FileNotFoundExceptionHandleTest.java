package problems.checkedexception;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileNotFoundExceptionHandleTest {

    private static final String TEST_FILE_PATH = "testFile.txt";  // Path to the test file

    @BeforeEach
    void setUp() {
        // Ensure the test file is removed before each test
        File file = new File(TEST_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testReadFile_FileExists() throws IOException {
        // Arrange: Create a test file and write some content
        String content = "Hello, World!";
        Files.write(Paths.get(TEST_FILE_PATH), content.getBytes());

        // Create an instance of the class
        FileNotFoundExceptionHandle fileHandler = new FileNotFoundExceptionHandle();

        // Act: Call the method that reads the file
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        fileHandler.readFile(TEST_FILE_PATH);

        // Assert: Verify the content is printed to the output
        String output = outputStream.toString().trim();
        assertTrue(output.contains(content), "Expected content to be printed: " + content);

        // Clean up the test file
        new File(TEST_FILE_PATH).delete();
    }

    @Test
    void testReadFile_FileDoesNotExist() {
        // Arrange: Provide a non-existent file path
        String nonExistentFilePath = "nonExistentFile.txt";

        // Create an instance of the class
        FileNotFoundExceptionHandle fileHandler = new FileNotFoundExceptionHandle();

        // Act: Capture the output printed to the console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        fileHandler.readFile(nonExistentFilePath);

        // Assert: Check that the "file not found" message is printed
        String output = outputStream.toString().trim();
        assertTrue(output.contains("File not found at the specified path:"), "Expected 'File not found' message");

        // No cleanup required since the file doesn't exist
    }

    @AfterEach
    void tearDown() {
        // Cleanup: Remove the test file if it exists
        File file = new File(TEST_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }
}
