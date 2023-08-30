package org.example.tdd;

import org.example.quest.easy.RomanToIntegerTDD;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class RomanToIntegerTDDTest {

    private static final Character[] ALPHABET = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final List<String> NON_ROMAN_DIGITS = Arrays.stream(ALPHABET)
        .filter(c -> !RomanToIntegerTDD.ROMAN_DIGITS.contains(c))
        .map(Object::toString)
        .toList();

    @ParameterizedTest
    @CsvSource(value = {
        "III, 3",
        "LVIII, 58",
        "MCMXCIV, 1994"
    })
    void shouldConvertRomanDigitToInteger_whenGivenRomanOneIsValid(String actualRoman, int expectedInteger) {
        int actual = RomanToIntegerTDD.romanToInt(actualRoman);
        assertEquals(actual, expectedInteger);
    }

    @ParameterizedTest
    @MethodSource("nonRomanDigitsProvider")
    void shouldNotConvertRomanDigitToInteger_whenGivenRomanOneIsInvalid(String actualRoman) {
        int actual = RomanToIntegerTDD.romanToInt(actualRoman);
        assertEquals(actual, 0);
    }
    private static List<String> nonRomanDigitsProvider() {
        return NON_ROMAN_DIGITS;
    }



}