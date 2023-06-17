package com.trenditra.enum_classes;

public enum Windows {

    TYPE1("Пластиковое"),
    TYPE2("Деревянное"),
    TYPE3("Витражное"),
    TYPE4("Другое");

    private String windowName;

    Windows(String windowName) {
        this.windowName = windowName;
    }

    public String getWindowName() {
        return windowName;
    }
}
