package com.simon.javase.exception_collection.ddz;

public class Poker implements Comparable<Poker>{
    private String color;
    private String num;

    public Poker() {

    }

    public Poker(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public int compareTo(Poker o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "color='" + color + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
