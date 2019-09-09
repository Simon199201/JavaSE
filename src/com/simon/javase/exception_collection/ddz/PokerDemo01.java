package com.simon.javase.exception_collection.ddz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo01 {
    public static void main(String[] args) {
        //首先用HashMap存储牌
        HashMap<Integer, String> pokers = new HashMap<>();
        String[] colors = {"♦️", "♥️", "♠️", "♣️"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        ArrayList<Integer> array = new ArrayList<>();
        int index = 0;
        for (String num : nums) {
            for (String color : colors) {
                pokers.put(index, color + num);
                array.add(index);
                index++;
            }
        }
        pokers.put(index, "小王");
        array.add(index);
        index++;

        pokers.put(index, "大王");
        array.add(index);
        //洗牌
        Collections.shuffle(array);
        System.out.println("array is " + array);
        //发牌
        TreeSet<Integer> fbb = new TreeSet<>();
        TreeSet<Integer> lqx = new TreeSet<>();
        TreeSet<Integer> zxm = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();
        for (int i = 0; i < array.size(); i++) {
            int index1 = array.get(i);
            if (i >= array.size() - 3) {
                dp.add(index1);
            } else if (i % 3 == 0) {
                fbb.add(index1);
            } else if (i % 3 == 1) {
                lqx.add(index1);
            } else {
                zxm.add(index1);
            }
        }
        //看牌
        lookPoker("范冰冰", fbb, pokers);
        lookPoker("林青霞", lqx, pokers);
        lookPoker("张新猛", zxm, pokers);
        lookPoker("底牌", dp, pokers);

    }

    private static void lookPoker(String name, TreeSet<Integer> fbb, HashMap<Integer, String> pokers) {
        System.out.println(name + "的牌是 ");

        for (Integer integer : fbb) {
            System.out.print(pokers.get(integer) + " ");
        }
        System.out.println();
    }
}
