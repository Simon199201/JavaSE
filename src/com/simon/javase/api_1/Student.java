package com.simon.javase.api_1;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student> , Serializable {
    //序列化
    private static long SerialVersionUID = 45L;
    private String name;
    private int age;
    private String sid;
    private String address;
    private int shuxue;
    private int yuwen;
    private int english;

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public Student(String name, int age, String sid, String address) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sid='" + sid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(sid, student.sid) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sid, address);
    }


    @Override
    public int compareTo(Student s) {
        int num = this.age - s.age;
        return num == 0 ? this.name.compareTo(s.name) : num;
    }
}
