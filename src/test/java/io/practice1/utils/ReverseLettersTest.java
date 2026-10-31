package io.practice1.utils;

import io.practice1.utilus.ReverseLetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseLettersTest {
    @Test
    void shouldReverseLettersAndKeepSymbols() {
        String input = "J@va the be$t!123";

        String expected = "t@eb eht av$J!123";
        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnSingleLetter() {
        String input = "a";
        String expected = "a";

        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);
    }
    @Test
    void shouldKeepStringWithoutLettersUnchanged() {
        String input = "123 !@#";
        String expected = "123 !@#";

        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);
    }
    @Test
    void shouldReverseLettersOnly() {
        String input = "abcd";
        String expected = "dcba";

        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);
    }
    @Test
    void shouldPreserveLetterCase() {
        String input = "AbCd";
        String expected = "dCbA";

        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);
    }
    @Test
    void shouldKeepSymbolsAtEdgesAndInMiddle() {
        String input = "!ab@cd#";
        String expected = "!dc@ba#";

        String actual = ReverseLetters.reverseLetters(input);

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnEmptyString() {
        String input = "";
        String expected = "";
        String actual = ReverseLetters.reverseLetters(input);
        assertEquals(expected, actual);
    }
    @Test
    void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(NullPointerException.class, () ->
                ReverseLetters.reverseLetters(null));
    }
}

