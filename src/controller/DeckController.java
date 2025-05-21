package controller;

import strategies.deck.DeckStrategy;
import factories.DeckStrategyFactory;
import model.deck.Deck;
import model.carta.TipoCarta;
import model.jogador.Jogador;

import java.util.Scanner;

public class DeckController {
    private Jogador jogador;
    private Deck deck;
    private String label;

    public DeckController(Jogador jogador, String label) {
        this.jogador = jogador;
        this.deck = (Deck) jogador.getCartas();
        this.label = label;
    }

    public void iniciarDeck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + label + ", bem-vindo ao Montador de Deck!");
        System.out.println("Você pode adicionar cartas ao seu deck (máximo 6).");

        while (true) {
            System.out.println("\nEscolha uma carta para adicionar ao seu deck:");
            listarCartasDisponiveis();

            int opcao = scanner.nextInt();

            DeckStrategy strategy = DeckStrategyFactory.getStrategy(opcao, jogador, deck);
            boolean continuar = strategy.executar();
            if (!continuar) break;
        }
    }

    public void listarCartasDisponiveis() {
        System.out.println("\nCartas disponíveis:");
        int count = 1;
        for (TipoCarta tipoCarta : TipoCarta.values()) {
            System.out.println(count + ". " + tipoCarta.getNome());
            count++;
        }
        System.out.println("0. Finalizar montagem do deck");
    }
}
