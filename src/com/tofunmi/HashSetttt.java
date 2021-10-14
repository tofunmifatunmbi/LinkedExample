package com.tofunmi;

import java.util.HashSet;

public class HashSetttt {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(10);//only prints out the unique values. Hence, it will pick only one 10/
        hashSet.add(10);


        System.out.println(hashSet);

    }
}
