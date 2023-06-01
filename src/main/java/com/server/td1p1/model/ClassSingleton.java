package com.server.td1p1.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public final class ClassSingleton {
    public static ClassSingleton instance = null;
    private String description;

    private ClassSingleton() {
        // Constructeur privé pour empêcher la création d'une instance en dehors de la classe.
        this.description = "instance created";
    }

    public static ClassSingleton getInstance() {
        if (instance == null) {
            instance = new ClassSingleton();
        }
        return instance;
    }

    public String getDescription() {
        return this.description;
    }

}

