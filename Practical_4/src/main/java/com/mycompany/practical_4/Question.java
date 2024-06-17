/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_4;

/**
 *
 * @author kpanchal
 */
public class Question {
    private final int id;
    private final String questionText;
    private final String optionA;
    private final String optionB;
    private final String optionC;
    private final String correctOption;
    
    public Question(int id, String questionText, String optionA, String optionB, String optionC, String correctOption) {
        this.id = id;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctOption = correctOption;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getCorrectOption() {
        return correctOption;
    }
    
}
