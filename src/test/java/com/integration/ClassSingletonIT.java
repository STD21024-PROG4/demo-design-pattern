package com.integration;

import com.server.td1p1.model.ClassSingleton;

public class ClassSingletonIT {
    public static void main(String[] args) {
        ClassSingleton singletonInstance1 = ClassSingleton.getInstance();
        System.out.println(singletonInstance1.getDescription()); // affiche " instance created."

        ClassSingleton singletonInstance2 = ClassSingleton.getInstance();
        System.out.println(singletonInstance2.getDescription()); // affiche également " instance created."

        singletonInstance1.setDescription("New Singleton description.");
        System.out.println(singletonInstance1.getDescription()); // affiche "New description."
        System.out.println(singletonInstance2.getDescription()); // affiche également "New description."
    }
}
