package com.generics2826502.java.HasTable2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// Crear la calase HastItem< K , V >
@AllArgsConstructor
@ToString
@Getter
class HastItem<K, V> {
    private K key;
    private V value;
}

public class HashTable {
    public static void main(String[] args) {

        HastItem<String, Integer> h1 = new HastItem<>("A", 6);
        HastItem<String, Integer> h2 = new HastItem<>("B", 68);

        List<HastItem<String, Integer>> hashTable = List.of(h1, h2);

        for (HastItem<String, Integer> o : hashTable) {
            System.out.println("Key : " + o.getKey());
            System.out.println("Value: " + o.getValue());
            System.out.println("----------------------------");
        }
    }

}
