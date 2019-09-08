package com.simon.javase.generic;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{
    @Override
    public void show(T o) {
        System.out.println(o);
    }
}
