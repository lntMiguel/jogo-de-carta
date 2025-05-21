package factories;

import model.deck.Deck;
import model.jogador.Jogador;
import strategies.deck.AdicionarCartaStrategy;
import strategies.deck.DeckStrategy;
import strategies.deck.FinalizarMontagemStrategy;
import strategies.deck.OpcaoInvalidaStrategy;

public class DeckStrategyFactory {
    public static DeckStrategy getStrategy(int opcao, Jogador jogador, Deck deck) {
        if (opcao == 0){
            return new FinalizarMontagemStrategy();
        }
        if (opcao < 1 || opcao > model.carta.TipoCarta.values().length){
            return new OpcaoInvalidaStrategy();
        }
        return new AdicionarCartaStrategy(opcao, jogador, deck);
    }
}
