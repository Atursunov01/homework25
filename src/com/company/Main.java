package com.company;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>(set);
        set.removeAll(set1);
        set1.removeAll(set2);

        Set<Integer> symmetricDifference = new HashSet<>(set);
        symmetricDifference.addAll(set1);

        System.out.println(symmetricDifference);


    }

}


