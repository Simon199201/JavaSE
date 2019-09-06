package com.simon.javase.interfacedemo.teacher_sporter;

public class PingPangSporter extends Sporter implements StudyEnglish {
    @Override
    public void study() {
        System.out.println(getName()+"乒乓运动员去学习！");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"乒乓运动员吃饭");
    }

    @Override
    public void studyEnglish() {
        System.out.println(getName()+"乒乓运动员学英语");
    }
}
