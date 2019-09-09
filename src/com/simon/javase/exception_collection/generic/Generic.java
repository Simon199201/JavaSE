package com.simon.javase.exception_collection.generic;

/**
 * 泛型类
 * @param <T>
 */
public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void show(T k){
        System.out.println(k);
    }
}
