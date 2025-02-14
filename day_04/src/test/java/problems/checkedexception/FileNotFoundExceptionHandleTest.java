package problems.checkedexception;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileNotFoundExceptionHandleTest {

    private static final String TEST_FILE_PATH = "testFile.txt";  // Path to the test file

    @BeforeEach
    void setUp() {
        File file = new File(TEST_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testReadFile_FileExists() throws IOException {
        String content = "Hello, World!";
        Files.write(Paths.get(TEST_FILE_PATH), content.getBytes());
        FileNotFoundExceptionHandle fileHandler = new FileNotFoundExceptionHandle();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        fileHandler.readFile(TEST_FILE_PATH);
        String output = outputStream.toString().trim();
        assertTrue(output.contains(content), "Expected content to be printed: " + content);
        new File(TEST_FILE_PATH).delete();
    }

    @Test
    void testReadFile_FileDoesNotExist() {
        String nonExistentFilePath = "nonExistentFile.txt";
        FileNotFoundExceptionHandle fileHandler = new FileNotFoundExceptionHandle();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        fileHandler.readFile(nonExistentFilePath);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("File not found at the specified path:"), "Expected 'File not found' message");
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }
}
