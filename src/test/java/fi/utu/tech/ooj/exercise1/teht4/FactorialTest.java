package fi.utu.tech.ooj.exercise1.teht4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    /*
    * Rutiini vaikuttaa toimivan oikein, mutta sen toiminassa on rajoituksia, se toimii vain n=12 asti, sillä kun n>=13, tulos ei mahdu enää int-tyyppiin.
    *
    *
    * */
    @Test
    void calculateFactorialTest1() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }
    @Test
    void calculateFactorialTest2() {
        assertEquals(0, Factorial.calculateFactorial(0));
    }
    @Test
    void calculateFactorialTest3() {
        assertEquals(479001600, Factorial.calculateFactorial(12));
    }
    @Test
    void calculateFactorialTest4() {
        long result = Factorial.calculateFactorial(13);
        long test = 6227020800L;
        assertEquals(test, result);
    }
    @Test
    void calculateFactorialTest5() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {Factorial.calculateFactorial(-2);});
        assertEquals("Input must be a non-negative integer.", exception.getMessage());
    }
}