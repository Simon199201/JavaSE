package com.simon.javase.api_1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            showMainSystem();
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    deleteStudent(students);
                    break;
                case 3:
                    modifyStudent(students);
                    break;
                case 4:
                    getAllStudent(students);
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM退出
                    break;
                default:

                    break;
            }
        }
    }

    private static void modifyStudent(ArrayList<Student> students) {
        if (students == null || students.size() == 0) {
            System.out.println("学生信息不可用，请输入学生信息");
            return;
        }
        System.out.println("请输入要修改的学生编号：");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();
        boolean isModify = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSid().equals(sid)) {
                System.out.println("请输入学生的姓名：");
                String name = scanner.nextLine();
                System.out.println("请输入学生的年龄：");
                String age = scanner.nextLine();
                System.out.println("请输入学生的住址：");
                String address = scanner.nextLine();
                Student student = new Student();
                student.setSid(sid);
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                Student student1 = students.set(i, student);
                System.out.println("修改成功！");
                System.out.println("被修改的学生信息是：" + student1.toString());
                isModify = true;
                break;
            }
        }
        if (!isModify) {
            System.out.println("没有找到相关同学信息！");
        }
    }

    /**
     * 显示首页
     */
    private static void showMainSystem() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1 添加学生");
        System.out.println("2 删除学生");
        System.out.println("3 修改学生");
        System.out.println("4 查看所有学生");
        System.out.println("5 退出");
        System.out.println("请输入你的选择：");
    }

    private static void getAllStudent(ArrayList<Student> students) {
        if (students == null || students.size() == 0) {
            System.out.println("学生信息不可用，请输入学生信息");
            return;
        }

        System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
        for (Student student : students) {
            System.out.print(student.getSid() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress() + "\n");
        }
    }

    private static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除的学生学号：");
        String sid = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到对应的学生信息！");
        } else {
            students.remove(index);
            System.out.println("删除成功");
        }
    }

    private static void addStudent(ArrayList<Student> students) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生的学号：");
            sid = scanner.nextLine();
            if (isUsed(sid, students)) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                System.out.println("请输入学生的姓名：");
                String name = scanner.nextLine();
                System.out.println("请输入学生的年龄：");
                String age = scanner.nextLine();
                System.out.println("请输入学生的住址：");
                String address = scanner.nextLine();
                student.setSid(sid);
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                students.add(student);
                System.out.println("添加学生成功！\n");
                break;
            }
        }

    }

    /**
     * 学号是否被使用过
     *
     * @param sid
     * @param students
     * @return
     */
    private static boolean isUsed(String sid, ArrayList<Student> students) {
        if (students == null || students.size() == 0) {
            return false;
        }
        for (Student s : students) {
            if (s.getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }
}
