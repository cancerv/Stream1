package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) {
                result.add(item);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);
    }
}
