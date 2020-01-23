package com.company;

import static org.junit.jupiter.api.Assertions.*;

class CSabreTest {

    @org.junit.jupiter.api.Test
    void solutionTest() {

        String inputStringA = new String("ala ma kota, kot koduje w Javie Kota");
        String outputStringA = new String("a: ala, javie, kota, ma\n" +
                "d: koduje\n" +
                "e: javie, koduje\n" +
                "i: javie\n" +
                "j: javie, koduje\n" +
                "k: koduje, kot, kota\n" +
                "l: ala\n" +
                "m: ma\n" +
                "o: koduje, kot, kota\n" +
                "t: kot, kota\n" +
                "u: koduje\n" +
                "v: javie\n" +
                "w: w\n");

        assertEquals(CSabre.solution(inputStringA),outputStringA);

        String inputStringB = new String("i like coding with java language, it makes me happy. I also like to use another "
                +"language, namely it is kotlin");
        String outputStringB = new String("a: also, another, happy, java, language, makes, namely\n" +
                "c: coding\n" +
                "d: coding\n" +
                "e: another, language, like, makes, me, namely, use\n" +
                "g: coding, language\n" +
                "h: another, happy, with\n" +
                "i: coding, i, is, it, kotlin, like, with\n" +
                "j: java\n" +
                "k: kotlin, like, makes\n" +
                "l: also, kotlin, language, like, namely\n" +
                "m: makes, me, namely\n" +
                "n: another, coding, kotlin, language, namely\n" +
                "o: also, another, coding, kotlin, to\n" +
                "p: happy\n" +
                "r: another\n" +
                "s: also, is, makes, use\n" +
                "t: another, it, kotlin, to, with\n" +
                "u: language, use\n" +
                "v: java\n" +
                "w: with\n" +
                "y: happy, namely\n");

        assertEquals(CSabre.solution(inputStringB),outputStringB);

        String inputStringNull = null;
        String outputStringNull = new String("Received null value");
        assertEquals(CSabre.solution(inputStringNull),outputStringNull);

    }
}