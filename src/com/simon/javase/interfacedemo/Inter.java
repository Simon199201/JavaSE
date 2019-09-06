package com.simon.javase.interfacedemo;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
//    public Inter();//接口不能有构造方法，因为接口是对行为的规范
//    public void show(){};//接口里面的方法不能有方法体
    public abstract void method();
    void show();// == public abstract void show();
}
