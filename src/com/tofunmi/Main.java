package com.tofunmi;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList);
        */
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Alpha");
        linkedList.add("Kayfash");
        linkedList.add("Itunu");

        if (linkedList.contains("Kunle"))
        {
            System.out.println("He is an employee of the company");
        }
        else
        {
            System.out.println("He is a SCAM!!!");
        }






    }
}
