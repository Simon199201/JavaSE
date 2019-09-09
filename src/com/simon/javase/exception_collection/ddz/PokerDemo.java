package com.simon.javase.exception_collection.ddz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 模拟斗地主
 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<Poker> pokers = new ArrayList<>();
        String[] colors = {"♦️", "♥️", "♠️", "♣️"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String num : nums) {
                Poker poker = new Poker();
                poker.setColor(color);
                poker.setNum(num);
                pokers.add(poker);
            }
        }
        Poker poker = new Poker();
        poker.setColor("大王");
        poker.setNum("大王");
        pokers.add(poker);

        Poker poker1 = new Poker();
        poker1.setColor("小王");
        poker1.setNum("小王");
        pokers.add(poker1);

        System.out.println("--------");
        printPoker("所有", pokers);
        //洗牌
        Collections.shuffle(pokers);
        //发牌
        ArrayList<Poker> fbb = new ArrayList<>();
        ArrayList<Poker> lqx = new ArrayList<>();
        ArrayList<Poker> zxm = new ArrayList<>();
        ArrayList<Poker> dp = new ArrayList<>();
        for (int i = 0; i < pokers.size(); i++) {
            Poker pk = pokers.get(i);
            if (i >= pokers.size() - 3) {
                dp.add(pk);
            } else if (i % 3 == 0) {
                fbb.add(pk);
            } else if (i % 3 == 1) {
                lqx.add(pk);
            } else {
                zxm.add(pk);
            }
        }
        sort(fbb);
        sort(lqx);
        sort(zxm);
        sort(dp);
        printPoker("范冰冰", fbb);
        printPoker("林青霞", lqx);
        printPoker("张新猛", zxm);
        printPoker("底牌", dp);

    }

    private static void printPoker(String name, ArrayList<Poker> list) {
        for (Poker poker : list) {
            System.out.println(name + "的牌是：" + poker.toString());
        }
    }

    private static void sort(ArrayList<Poker> list) {
        Collections.sort(list, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                int result = o1.getNum().compareTo(o2.getNum());
                return result == 0 ? (o1.getColor().compareTo(o2.getColor())) : result;
            }
        });
    }
}
