package com.trenditra.enum_classes;

public enum Windows {

    OPEN("Пластиковое"),
    CLOSE("Деревянное"),
    MAX_SIZE("Витражное"),
    MIN_SIZE("Другое");

    private String windowName;

    Windows(String windowName) {
        this.windowName = windowName;
    }

    public String getWindowName() {
        return windowName;
    }
}
