package com.server.td1p1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public final class ClassUniqueInstance {
    private static ClassUniqueInstance instance= null;
    private int click;

    private ClassUniqueInstance() {
        // Constructeur privé pour empêcher la création d'une instance en dehors de la classe.
        this.click = 0;
    }

    public static ClassUniqueInstance getInstance() {
        if (instance == null) {
            instance = new ClassUniqueInstance();
        }
        return instance;
    }

    public short incrementClick() {
        this.click++;
        return 0;
    }
    public int getClick() {
        return this.click;
    }
}
