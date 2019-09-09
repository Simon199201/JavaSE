package com.simon.javase.exception_collection.generic;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{
    @Override
    public void show(T o) {
        System.out.println(o);
    }
}
