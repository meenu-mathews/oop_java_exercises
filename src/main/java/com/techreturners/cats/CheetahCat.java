package com.techreturners.cats;

public class CheetahCat extends AbstractCat implements Cat {
    int cheetahHeight = 80;
    String cheetahSetting = "wild";
    String cheetahEaten = "Zzzzzzz";
    @Override
    public String getSetting() {
        return cheetahSetting;
    }

    @Override
    public int getAverageHeight() {
        return cheetahHeight;
    }

    @Override
    public String eat() {

        return cheetahEaten;
    }
}
