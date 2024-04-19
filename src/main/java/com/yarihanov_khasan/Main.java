package com.yarihanov_khasan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(3, 8, 15, 17));
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Set<Integer> result = new HashSet<>();
        HashMap<Integer, Integer> differenceAdnIndexes = new HashMap<>();

        for (int i = 0; i <= array.size() - 1; i++) {
            int diffrence = number - array.get(i);
            differenceAdnIndexes.put(diffrence, i);
            if (differenceAdnIndexes.containsKey(array.get(i)) && result.add(differenceAdnIndexes.get(array.get(i)))) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}