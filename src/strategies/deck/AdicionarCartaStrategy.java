package strategies.deck;

import model.carta.CartaBatalha;
import model.deck.Deck;
import model.carta.TipoCarta;
import model.jogador.Jogador;

public class AdicionarCartaStrategy implements DeckStrategy {
    private final int opcao;
    private final Jogador jogador;
    private final Deck deck;

    public AdicionarCartaStrategy(int opcao, Jogador jogador, Deck deck) {
        this.opcao = opcao;
        this.jogador = jogador;
        this.deck = deck;
    }

    @Override
    public boolean executar() {
        TipoCarta tipoCarta = TipoCarta.values()[opcao - 1];
        CartaBatalha cartaBatalha = new CartaBatalha(tipoCarta);

        if (jogador.adicionaCarta(cartaBatalha)) {
            System.out.println(cartaBatalha.getNome() + " foi adicionada ao seu deck.");
            return continuarSeDeckNaoEstiverCheio();
        }

        tratarFalhaAoAdicionarCarta();
        return true;
    }

    private boolean continuarSeDeckNaoEstiverCheio() {
        if (deckCheio()) {
            System.out.println("Seu deck está completo!");
            return false;
        }
        return true;
    }

    private void tratarFalhaAoAdicionarCarta() {
        if (deckCheio()) {
            System.out.println("Não foi possível adicionar a carta. Seu deck já possui 6 cartas.");
            return;
        }

        System.out.println("Essa carta já está no seu deck. Escolha uma carta diferente.");
    }

    private boolean deckCheio() {
        return deck.getCartas().length >= 6;
    }
}
