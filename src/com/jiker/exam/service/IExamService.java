package com.jiker.exam.service;

import com.jiker.exam.domain.Item;

public interface IExamService {

    Item getItem(int no);

    int getItemsCount();

    char[] readAnswer();

    void saveAnswer(char[] answer);

    String levelDesc(int score);

    char[] getAnswer();
}
