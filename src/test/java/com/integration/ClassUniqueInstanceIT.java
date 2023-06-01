package com.integration;

import com.server.td1p1.model.ClassUniqueInstance;

public class ClassUniqueInstanceIT {
    public static void main(String[] args) {
        ClassUniqueInstance singletonInstance1 = ClassUniqueInstance.getInstance();
        System.out.println(singletonInstance1.getClick()); // affiche "0"

        ClassUniqueInstance singletonInstance2 = ClassUniqueInstance.getInstance();
        System.out.println(singletonInstance2.getClick()); // affiche également "0"

        singletonInstance1.incrementClick();
        System.out.println(singletonInstance1.getClick()); // affiche "1"
        System.out.println(singletonInstance2.getClick()); // affiche également "1"

        singletonInstance2.incrementClick();
        System.out.println(singletonInstance1.getClick()); //affiche "2"
        System.out.println(singletonInstance2.getClick()); // affiche également "2"
    }
}