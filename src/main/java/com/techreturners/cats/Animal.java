package com.techreturners.cats;

abstract class Animal {
        
    boolean isAsleep;
    int averageHeight;
    String setting, burp;

    public boolean isAsleep(){return isAsleep;}

    public void goToSleep(){ isAsleep = true; }

    public void wakeUp(){ isAsleep = false; }

    public int getAverageHeight(){return averageHeight;}

    public String getSetting(){return setting;}

    public String eat(){return burp;}
}



