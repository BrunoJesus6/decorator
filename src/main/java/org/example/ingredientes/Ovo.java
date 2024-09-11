package org.example.ingredientes;

import org.example.hamburguer.Hamburguer;
import org.example.hamburguer.HamburguerDecorator;

public class Ovo extends HamburguerDecorator {

    public Ovo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoIngrediente() {
        return 2.0f;
    }

    public String getNomeIngrediente() {
        return "Ovo";
    }
}