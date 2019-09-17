package com.simon.javase.thread;

import java.util.*;

/**
 * 线程安全的类
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer sb = new StringBuffer();

        //Vector
        Vector<String> vector = new Vector<>();

        //Hashtable
        Hashtable<String, String> ht = new Hashtable<>();

        //Vector和Hashtable 都已被Collections.synchronizedList和Collections.synchronizedMap()取代
        List list = new ArrayList();
        List list1 = Collections.synchronizedList(list);

        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
    }
}
