package com.trenditra.enum_classes;

public class EnumExample {

    public static void main(String[] args) {
        Windows[] window = Windows.values();
        for (Windows windows : window) {
            System.out.println(windows.name() + ": " + windows.getWindowName());
        }
    }
}
