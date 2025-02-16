package java.org.regex.replacemodify;

import org.junit.jupiter.api.Test;

import java.org.regex.replacemodify.CensorBadWords;

import static org.junit.jupiter.api.Assertions.*;

class CensorBadWordsTest {
     @Test
     void test(){
         String input = "This is a damn bad example with some stupid words.";
         CensorBadWords ms = new CensorBadWords();
         String expected = "This is a **** bad example with some **** words.";
         assertEquals(expected,ms.replace(input));
     }
}