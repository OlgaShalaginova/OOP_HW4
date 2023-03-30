package org.example.OOP.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<HDNext4> products = new ArrayList<>(Arrays.asList(
                new HDNext4("tea", 200, 45),
                new HDNext4("hottea", 200, 65),
                new HDNext4("hottea1", 200, 65),
                new HDNext4("cofe", 300, 50)));

        HDAutomat4<HDNext4> hdAutomat4 = new HDAutomat4();
        hdAutomat4.InitProd(products);
        System.out.println(hdAutomat4.getProduct("cofe", 300, 50).toString());
//      System.out.println(hdAutomat4.getProduct("cofe"));

    }
}