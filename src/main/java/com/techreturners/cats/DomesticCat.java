package com.techreturners.cats;

public class DomesticCat extends AbstractCat implements Cat {
    int catHeight = 23;
    String catSetting = "domestic";
    String catEaten = "Purrrrrrr";

    @Override
    public String getSetting() {
        return catSetting;
    }

    @Override
    public int getAverageHeight() {
        return catHeight;
    }

    @Override
    public String eat() {
        return catEaten;
    }
}
