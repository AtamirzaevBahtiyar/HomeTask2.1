package com.company;

public class Main {

    public static void main(String[] args) {

        Pet objectA = new Pet("Сиамская", Color.REDHEAD, 5, "Рыжик");
        Cat objectB = new Cat(new Kitty("Барсик"), 6, "Лили", "Сфинкс", Color.WHITE);
        Cat objectC = new Cat(new Kitty("Тимка"), 4, "Daisy", "Скоттиш фолд", Color.GRAY);

        objectA.jump(30,15);
        objectA.getInfo();
        objectB.jump(20);
        objectB.getInfo();
        objectC.jump(40,20);
        objectC.getInfo();
    }



}
