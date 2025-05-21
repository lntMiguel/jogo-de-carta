package view;

import controller.DeckController;
import controller.TurnoController;
import services.BatalhaService;
import utils.EntradaConsole;
import model.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        DeckController d1 = new DeckController(j1, "Jogador 1");
        DeckController d2 = new DeckController(j2, "Jogador 2");

        d1.iniciarDeck();
        d2.iniciarDeck();

        TurnoController controller = new TurnoController(
                j1, j2, new EntradaConsole(), new BatalhaService()
        );
        controller.iniciarJogo();
    }

}