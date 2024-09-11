package org.example.ingredientes;

import org.example.hamburguer.Hamburguer;
import org.example.hamburguer.HamburguerDecorator;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoIngrediente() {
        return 4.0f;
    }

    public String getNomeIngrediente() {
        return "Bacon";
    }
}