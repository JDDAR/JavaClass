package com.generics2826502.java.hashtable;

import com.generics2826502.java.Store.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// Crear la calase HastItem< K , V >
@Getter
class HastItem<K, V> {
    K key;
    V value;

    public HastItem(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

@AllArgsConstructor
@Getter
@ToString
class Customer {
    String name;
}

@AllArgsConstructor
@ToString
@Getter
class Medico {
    String name;
}

public class Main {

    public static void main(String[] args) {
        // Crear Item Hash
        HastItem<String, Integer> h1 = new HastItem("A", 10);
        HastItem<Long, Customer> h2 = new HastItem<Long, Customer>(3L, new Customer("severalk"));
        HastItem<Double, Medico> h3 = new HastItem<Double, Medico>(3.8, new Medico("JOSE"));
    }

}
