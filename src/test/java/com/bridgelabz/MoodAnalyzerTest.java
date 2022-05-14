package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("User is Sad");
        String result = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("User is Happy");
        String result = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", result);
    }
}
