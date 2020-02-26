package com.jiker.exam.domain;

public class Item {
    private String question;
    private String[] options;
    private char answer;

    public Item(String question,String[] options,char answer){
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return question + "\n" +
                options[0] + "\n" +
                options[1] + "\n" +
                options[2] + "\n" +
                options[3] + "\n标准答案：" + answer + "\n";
    }
}
