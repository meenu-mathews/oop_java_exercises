package com.techreturners.cats;

public class LionCat extends AbstractCat implements Cat {
    int lionHeight = 1100;
    String lionSetting = "wild";
    String lionEaten = "Roar!!!!";

    @Override
    public String getSetting() {
        return lionSetting;
    }

    @Override
    public int getAverageHeight() {
        return lionHeight;
    }

    @Override
    public String eat() {
        return lionEaten;
    }

}
