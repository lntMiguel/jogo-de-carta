package strategies.turno;

import model.carta.CartaBatalha;
import model.carta.CartaJogada;
import model.deck.Deck;
import model.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;

public class AtaqueVsAtaque implements RegraBatalhaStrategy {
    @Override
    public boolean aplica(ModoBatalha m1, ModoBatalha m2) {
        return m1 == ModoBatalha.ATAQUE && m2 == ModoBatalha.ATAQUE;
    }

    @Override
    public void resolver(Jogador j1, CartaJogada c1, Jogador j2, CartaJogada c2) {
        if (c1.getPoder() > c2.getPoder()) {
            removerCarta(j2, c2.getCarta());
        } else if (c2.getPoder() > c1.getPoder()) {
            removerCarta(j1, c1.getCarta());
        }
    }

    private void removerCarta(Jogador jogador, CartaBatalha carta) {
        Deck deck = (Deck) jogador.getCartas();
        List<CartaBatalha> novaLista = new ArrayList<>(List.of(deck.getCartas()));
        novaLista.remove(carta);
        deck.setCartas(novaLista);
        System.out.println("Carta " + carta.getNome() + " foi destruída!");
    }
}

