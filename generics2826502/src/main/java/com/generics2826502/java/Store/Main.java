package com.generics2826502.java.Store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

class Customer {
    String name;
}

@AllArgsConstructor
@ToString
@Getter
class Store {
    private Object item;
}

@AllArgsConstructor
@ToString
@Getter
class StoreGen<G> {
    private G item; // Tipo parametrisado
}

@AllArgsConstructor
@ToString
@Getter
class CustomerGen<T> {
    private T item; // Tipo parametrisado
}

public class Main {
    public static void main(String[] args) {
        // store que almacena un entreo
        Store s1 = new Store(1);
        Integer item1 = (Integer) s1.getItem();
        // Strore que almacene un customer
        Store s2 = new Store(new Customer("Josesito"));
        Customer m = (Customer) s2.getItem();

        System.out.println("*********************************");
        StoreGen<Integer> sg1 = new StoreGen(2);
        item1 = sg1.getItem();

        StoreGen<Customer> sg2 = new StoreGen<>(new Customer("Vanessita"));





    }
}
