package com.company;

public class Pet extends Animal{
    private String breed;
    private Color color;

    public Pet (String breed, Color color, int age, String name){
        super(age,name);
        this.color = color;
        this.breed = breed;
    }

    public Color getColor(){
        return color;
    }
    public String getBreed(){
        return breed;
    }

    public void jump (int jumpLength, int jumpHeight){
        System.out.println("Кот прыгнул на расстояние: " + jumpLength + " сантиметров" +
                            "\n Высота прыжка: " + jumpHeight + " сантиметров");
    }
    public final void jump (int jumpLength){
        System.out.println("Кот прыгнул на расстояние: " + jumpLength + " сантиметров");
    }


    public void getInfo(){
        System.out.println("Порода: " + breed + "\n Окрас: " + color +
                "\n Возраст: " + super.getAge() + "\n Кличка: " + super.getName());

    }


}
