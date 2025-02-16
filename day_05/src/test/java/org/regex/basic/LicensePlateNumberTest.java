package java.org.regex.basic;

import org.junit.jupiter.api.Test;

import java.org.regex.basic.LicensePlateNumber;

import static org.junit.jupiter.api.Assertions.*;

class LicensePlateNumberTest {
    @Test
    void Valid(){
        String input = "CG2756";
        LicensePlateNumber vu = new LicensePlateNumber();
        assertEquals(true,vu.validate(input));
    }
    @Test
    void inValidExtraNums(){
        String input = "ABC1234";
        LicensePlateNumber vu = new LicensePlateNumber();
        assertEquals(false,vu.validate(input));
    }
    @Test
    void inValidExtraLetters(){
        String input = "CCG2756";
        LicensePlateNumber vu = new LicensePlateNumber();
        assertEquals(false,vu.validate(input));
    }
    @Test
    void inValidShortage(){
        String input = "C2756";
        LicensePlateNumber vu = new LicensePlateNumber();
        assertEquals(false,vu.validate(input));
    }
}