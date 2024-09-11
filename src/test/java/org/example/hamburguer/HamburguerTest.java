package org.example.hamburguer;

import org.example.ingredientes.Bacon;
import org.example.ingredientes.Ovo;
import org.example.ingredientes.Queijo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburguerTest {

    @Test
    void deveRetornarPrecoHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();
        assertEquals(15.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerSimples());
        assertEquals(19.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComOvo() {
        Hamburguer hamburguer = new Ovo(new HamburguerSimples());
        assertEquals(17.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());
        assertEquals(17.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconEOvo() {
        Hamburguer hamburguer = new Ovo(new Bacon(new HamburguerSimples()));
        assertEquals(21.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconEQueijo() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerSimples()));
        assertEquals(21.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComOvoEQueijo() {
        Hamburguer hamburguer = new Ovo(new Queijo(new HamburguerSimples()));
        assertEquals(19.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconOvoEQueijo() {
        Hamburguer hamburguer = new Ovo(new Bacon(new Queijo(new HamburguerSimples())));
        assertEquals(23.0f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarIngredientesHamburguerSimples() {
        Hamburguer hamburguer = new HamburguerSimples();
        assertEquals("Pão, Carne, Alface, Tomate", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerSimples());
        assertEquals("Pão, Carne, Alface, Tomate, Bacon", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComOvo() {
        Hamburguer hamburguer = new Ovo(new HamburguerSimples());
        assertEquals("Pão, Carne, Alface, Tomate, Ovo", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComQueijo() {
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());
        assertEquals("Pão, Carne, Alface, Tomate, Queijo", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComBaconEOvo() {
        Hamburguer hamburguer = new Ovo(new Bacon(new HamburguerSimples()));
        assertEquals("Pão, Carne, Alface, Tomate, Bacon, Ovo", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComBaconEQueijo() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerSimples()));
        assertEquals("Pão, Carne, Alface, Tomate, Queijo, Bacon", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComOvoEQueijo() {
        Hamburguer hamburguer = new Ovo(new Queijo(new HamburguerSimples()));
        assertEquals("Pão, Carne, Alface, Tomate, Queijo, Ovo", hamburguer.getIngredientes());
    }

    @Test
    void deveRetornarIngredientesHamburguerComBaconOvoEQueijo() {
        Hamburguer hamburguer = new Ovo(new Bacon(new Queijo(new HamburguerSimples())));
        assertEquals("Pão, Carne, Alface, Tomate, Queijo, Bacon, Ovo", hamburguer.getIngredientes());
    }
}
