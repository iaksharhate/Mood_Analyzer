package com.bridgelabz;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if (message.contains("Sad"))
            return "SAD";
        else if (message.contains("Happy"))
            return  "HAPPY";
        return null;
    }
}