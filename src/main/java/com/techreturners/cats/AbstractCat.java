package com.techreturners.cats;

public abstract class AbstractCat implements Cat{
    boolean sleepStatus;
    int avgHeight;
    String setting;
    String eatSound;

    public AbstractCat(int avgHeight, String setting, String eatSound){
        this.avgHeight = avgHeight;
        this.setting = setting;
        this.eatSound = eatSound;
    }

    public boolean isAsleep() {
        return sleepStatus;
    }

    public void goToSleep() {
        sleepStatus = true;
    }

    public void wakeUp() {
        sleepStatus = false;
    }

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return avgHeight;
    }

    public String eat() {
        return eatSound;
    }
}
