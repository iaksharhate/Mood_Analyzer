package com.bridgelabz;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else if (message.contains("Happy"))
            return  "HAPPY";
        return null;
    }
}