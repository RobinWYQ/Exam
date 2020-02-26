package com.jiker.exam.view;

import com.jiker.exam.service.ExamServiceImpl;
import com.jiker.exam.service.IExamService;

public class ExamView {
    private IExamService itemService = new ExamServiceImpl();

    public ExamView() {
    }

    public void show(){
        System.out.print("\n【欢迎使用在线考试系统】......");
        System.out.println(itemService.getAnswer());
    }
}
