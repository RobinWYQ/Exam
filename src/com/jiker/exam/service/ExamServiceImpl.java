package com.jiker.exam.service;

import com.jiker.exam.domain.Item;

public class ExamServiceImpl implements IExamService{

    @Override
    public Item getItem(int no) {
        return null;
    }

    @Override
    public int getItemsCount() {
        return 0;
    }

    @Override
    public char[] readAnswer() {
        return new char[0];
    }

    @Override
    public void saveAnswer(char[] answer) {

    }

    @Override
    public String levelDesc(int score) {
        return null;
    }

    @Override
    public char[] getAnswer() {
        return new char[0];
    }
}
