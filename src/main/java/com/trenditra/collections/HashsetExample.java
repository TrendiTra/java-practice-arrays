package com.trenditra.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("BOOM");
        stringSet.add("BAM");
        stringSet.add("OU");
        stringSet.add("Carabum");
        stringSet.remove("BOOM");
        System.out.println(stringSet.stream().sorted());

        Set<String> linkedStringSet = new LinkedHashSet<>();
        linkedStringSet.addAll(stringSet);

        Set<String> treeStringSet = new TreeSet<>();
        treeStringSet.add("F");
        treeStringSet.add("A");
        treeStringSet.add("C");
        treeStringSet.add("M");
        treeStringSet.add("P");
        System.out.println(treeStringSet);
    }
}
