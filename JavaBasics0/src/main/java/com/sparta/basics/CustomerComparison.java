package com.sparta.basics;

import java.util.ArrayList;

public class CustomerComparison {
    public static void main(String[] args) {
        Customer c1 = new Customer("Roberto", "Lovece");
        c1.setEmail("something@lovece.com");
        Customer c2 = new Customer("Roberto", "Lovece");
        c2.setEmail("roberto@lovece.com");
//        if(c1 == c2) // compare object references
        if(c1.equals(c2))
            System.out.println("These are the same customer");
        Customer c3 = new Customer();
        System.out.println(c3.getFirstName());
        c1.setFirstName("Bill");
       ArrayList l = new ArrayList();
    }
}
