package org.example.hamburguer;

public class HamburguerSimples implements Hamburguer {
    private float preco;

    public HamburguerSimples() {
        this.preco = 15.0f;
    }

    public float getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return "Pão, Carne, Alface, Tomate";
    }
}
