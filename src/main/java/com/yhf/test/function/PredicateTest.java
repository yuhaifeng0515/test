package com.yhf.test.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());


    }
}
