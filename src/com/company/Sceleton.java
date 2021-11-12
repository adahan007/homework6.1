package com.company;


public class Sceleton extends Boss{
    private int strely;

    public int getStrely() {
        return strely;
    }

    public void setStrely(int strely) {
        this.strely = strely;
    }
    public String printlninfo(){return super.printlninfo() + "\nКоличество стрел:" + getStrely();}
}



