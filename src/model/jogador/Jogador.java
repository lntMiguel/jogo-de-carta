package model.jogador;

import model.carta.CartaBatalha;
import model.carta.Cartas;
import model.deck.Deck;

public class Jogador {
    private Cartas cartas;

    public Jogador() {
        this.cartas = new Deck();
    }

    public boolean adicionaCarta(CartaBatalha carta) {
        return cartas.adicionaCarta(carta);
    }

    public Cartas getCartas() {
        return cartas;
    }
}
