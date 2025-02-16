package java.org.junit.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete(); // Clean up test file after execution
        }
    }

    @Test
    void shouldWriteAndReadFileCorrectly() throws IOException {
        String content = "Hello, this is a test file!";

        // Write to file
        fileProcessor.writeToFile(TEST_FILE, content);

        // Read and verify content
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    void shouldCheckIfFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample text");

        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    void shouldThrowIOExceptionWhenFileDoesNotExist() {
        Exception exception = assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("non_existent_file.txt");
        });

        assertTrue(exception.getMessage().contains("non_existent_file.txt"));
    }
}