package com.learn.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(400);
        set.add(200);
        set.add(400);

        for(Integer m:set){

            System.out.println(m);

        }
    }
}
