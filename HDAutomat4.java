package org.example.OOP.HW4;

import java.util.ArrayList;
import java.util.List;

public class HDAutomat4<E extends HDNext4>  implements TreadAutomat4<E> {
    private List<E> hdAutomat = new ArrayList<>();
    public void InitProd(List<E> prod) {

        this.hdAutomat = prod;
    }

    public  E getProduct(String name, int vol, int temp) {
        for (E el : hdAutomat) {
            if (el.name.equals(name) && el.volume == vol && el.getTemp() == temp) {
                return el;
            }
        }
        return (E) new HDNext4("Нет такого напитка", 0, 0);
    }

    //    public HDNext4 getProduct(String name, int vol) {
//        for (HDNext4 el : hdAutomat) {
//            if (el.name.equals(name) && el.volume == vol) {
//                return el;
//            }
//        }
//        return new HDNext4("Нет такого напитка", 0, 0);
//    }
//
//    public HDNext4 getProduct(String name) {
//        for (HDNext4 el : hdAutomat) {
//            if (el.name.equals(name)) {
//                return el;
//            }
//        }
//        return new HDNext4("Нет такого напитка", 0, 0);
//    }
    @Override
    public E getProduct() {
        return null;
    }
}
