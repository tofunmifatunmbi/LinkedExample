package com.tofunmi;

import java.util.HashMap;

public class HashMapppp {
    public static void main(String[] args) {
        /* String name = "Yeni";
        String name2 = "Yeni";

        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
         */

        HashMap <String, Integer> map = new HashMap <>();
        map.put("Yeni",111);
        map.put("Tolu",11009);
        map.put("Jesutofunmi",38947);
        map.put("Kunle",11100);
        map.put("Jane",119371);
        map.put("Kayfash",243111);

        System.out.println(map.get("Jesutofunmi"));

        boolean checker = map.containsKey("Kunle");

        if (checker){

            map.put("Kunle2", 11790);

        }
        System.out.println(map);
        System.out.println(map.values()); //toget all the values
        System.out.println(map.keySet()); //toget all the keys
    }
}
