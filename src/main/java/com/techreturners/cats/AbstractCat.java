package com.techreturners.cats;

public abstract class AbstractCat implements Cat{
    boolean sleepStatus;

    public boolean isAsleep() {
        return sleepStatus;
    }

    @Override
    public void goToSleep() {
        sleepStatus = true;
    }

    @Override
    public void wakeUp() {
        sleepStatus = false;
    }
}
