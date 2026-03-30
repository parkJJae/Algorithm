package com.example;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Cat);
  }

}

class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("냐옹");
    }
}


