package com.example;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class Lion {

    boolean hasMane;
    Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(String gender) {

    }

    public int getKittens() {
        if (this.hasMane) {
            return 0;
        } else {
            return feline.getKittens();
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return this.feline.eatMeat();
    }
}
