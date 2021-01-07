package com.yhf.test;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class ImmutableListTest {

    public static void main(String[] args) {
        int a = 23;
        ImmutableList<Integer> list = ImmutableList.of(a, 12);
        System.out.println(list);
        a = 232;
        System.out.println(list);

        //使用内部类的方式
        ImmutableList<Integer> list2 = ImmutableList.<Integer>builder()
                .add(12)
                .add(23)
                .add(34)
                .build();
        System.out.println(list2);

        //获取一个空的不可变集合对象
        ImmutableList<String> list3 = ImmutableList.<String>of();
        //获取一个有一个元素的不可变集合对象
        ImmutableList<String> list4 = ImmutableList.<String>of("12");
        //获取一个有两个元素的不可变集合对象
        ImmutableList<String> list5 = ImmutableList.<String>of("12","23");

        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);

        List<String> list6 = new ArrayList<String>();
        list6.add("1");
        list6.add("2");
        list6.add("3");
        //copy数组list6的一个副本
        List<String> list7 = ImmutableList.<String>copyOf(list6);
        System.out.println(list7);

        //add merge

        //add merge2
    }
}
