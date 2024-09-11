package org.example.hamburguer;

public abstract class HamburguerDecorator implements Hamburguer {
    private Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getPrecoIngrediente();

    public float getPreco() {
        return this.hamburguer.getPreco() + this.getPrecoIngrediente();
    }

    public abstract String getNomeIngrediente();

    public String getIngredientes() {
        return this.hamburguer.getIngredientes() + ", " + this.getNomeIngrediente();
    }
}