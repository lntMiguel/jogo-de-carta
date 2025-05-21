package utils;

import model.carta.CartaBatalha;
import model.carta.CartaJogada;
import model.jogador.Jogador;
import strategies.turno.ModoBatalha;

import java.util.Scanner;

public class EntradaConsole implements EntradaUsuario {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public CartaJogada escolherCarta(Jogador jogador, String nomeJogador) {
        CartaBatalha[] cartas = jogador.getCartas().getCartas();

        exibirCartas(cartas, nomeJogador);

        int indice = lerEscolhaCarta(cartas.length) - 1;
        CartaBatalha cartaEscolhida = cartas[indice];

        ModoBatalha modo = lerModoBatalha();

        return new CartaJogada(cartaEscolhida, modo);
    }
    private void exibirCartas(CartaBatalha[] cartas, String nomeJogador) {
        System.out.println("\n" + nomeJogador + ", escolha uma carta para jogar:");
        for (int i = 0; i < cartas.length; i++) {
            CartaBatalha carta = cartas[i];
            System.out.printf("%d. %s (ATK: %d, DEF: %d)%n", i + 1, carta.getNome(), carta.getATK(), carta.getDEF());
        }
    }

    private int lerEscolhaCarta(int totalCartas) {
        int escolha;
        do {
            System.out.print("Digite o número da carta: ");
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha > totalCartas);
        return escolha;
    }

    private ModoBatalha lerModoBatalha() {
        int modoInt;
        do {
            System.out.print("Escolha o modo (1 - Ataque, 2 - Defesa): ");
            modoInt = scanner.nextInt();
        } while (modoInt != 1 && modoInt != 2);

        return (modoInt == 1) ? ModoBatalha.ATAQUE : ModoBatalha.DEFESA;
    }
}
