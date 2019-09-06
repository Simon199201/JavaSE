package com.simon.javase.interfacedemo.teacher_sporter;

public class BasketTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("篮球教练教学！");

    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");

    }
}
