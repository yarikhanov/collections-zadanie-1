package com.yarihanov_khasan;

import java.util.ArrayList;
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

        for (int i = 0; i <= array.size() - 1; i++) {
            for (int j = 0; j <= array.size() - 1; j++) {
                if (array.get(i) + array.get(j) == number && i != j) {
                    result.add(i);
                    result.add(j);
                }
            }
        }

        System.out.println(result);
    }
}