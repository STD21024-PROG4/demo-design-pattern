package com.server.td1p1.model;

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

    public void incrementClick() {
        this.click++;
    }
    public int getClick() {
        return this.click;
    }
}
