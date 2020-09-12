package com.company;

public final class Cat extends Pet{

    private Kitty kitty;

    public Cat (Kitty kitty, int age, String name, String breed, Color color){
        super(breed, color, age, name);
        this.kitty = kitty;
    }

    public Kitty getKitty(){
    return kitty;
    }

    public void jump (int jumpLength, int jumpHeight){super.jump(jumpLength, jumpHeight);}

    public void getInfo (){
        super.getInfo();
        System.out.println("Имеет котенка: " + kitty.getName());
    }

}
