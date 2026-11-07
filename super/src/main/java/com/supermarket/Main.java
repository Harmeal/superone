package com.supermarket;

import com.supermarket.model.Product;

public class Main {

    public static void main(String[] args) {
        Product r = new Product();
        r.setproduct_name("mlik");
        r.setpurchase_price(-12);
        r.setpurchase_price(50);
        r.setselling_price(-10);
        System.out.println(r.getpurchase_price());
    }
}