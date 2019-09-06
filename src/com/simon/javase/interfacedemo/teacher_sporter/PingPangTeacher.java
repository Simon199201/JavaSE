package com.simon.javase.interfacedemo.teacher_sporter;

public class PingPangTeacher extends Teacher implements StudyEnglish {
    @Override
    public void teach() {
        System.out.println("乒乓教练教学");
    }

    @Override
    public void eat() {
        System.out.println("乒乓教练吃饭");

    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓教练学英语");

    }
}
