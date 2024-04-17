package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    // Refactored Method-1: Uses parameterized lists
    public <T> List<List<T>> boxingMethod(T name) {
        List<T> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<T>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    // Refactored Method-2: Generic method returns the object itself
    public <T> T genericMethod(T data) {
        return data;
    }

    // Refactored Method-3: Clone method copies elements from producer to consumer list
    public <T> void cloneMethod(List<T> consumer, List<T> producer) {
        consumer.addAll(producer);
    }

}
