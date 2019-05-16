package com.learn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("z");
        list.add("b");
        System.out.println(list);
        for (Iterator<String> a = list.iterator();a.hasNext();){
            System.out.println(a.next());
        }
    }
}
