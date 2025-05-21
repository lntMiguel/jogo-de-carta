package controller;

import services.BatalhaService;
import model.carta.CartaJogada;
import utils.EntradaUsuario;
import model.carta.CartaBatalha;
import model.jogador.Jogador;

public class TurnoController {
    private final Jogador jogador1;
    private final Jogador jogador2;
    private final EntradaUsuario entrada;
    private final BatalhaService batalhaService;
    private int turnoAtual = 1;
    private final int MAX_TURNOS = 10;

    public TurnoController(Jogador j1, Jogador j2, EntradaUsuario entrada, BatalhaService batalhaService) {
        this.jogador1 = j1;
        this.jogador2 = j2;
        this.entrada = entrada;
        this.batalhaService = batalhaService;
    }

    public void iniciarJogo() {
        while (deveContinuarJogo()) {
            executarTurno();
            turnoAtual++;
        }
        determinarVencedor();
    }

    private boolean deveContinuarJogo() {
        return turnoAtual <= MAX_TURNOS &&
                jogador1.getCartas().getCartas().length > 0 &&
                jogador2.getCartas().getCartas().length > 0;
    }

    private void executarTurno() {
        System.out.println("\n--- TURNO " + turnoAtual + " ---");

        CartaJogada c1 = entrada.escolherCarta(jogador1, "Jogador 1");
        CartaJogada c2 = entrada.escolherCarta(jogador2, "Jogador 2");

        exibirCartasJogadas(c1, c2);

        batalhaService.resolverBatalha(jogador1, c1, jogador2, c2);
    }

    private void exibirCartasJogadas(CartaJogada c1, CartaJogada c2) {
        System.out.println("Jogador 1 jogou: " + c1);
        System.out.println("Jogador 2 jogou: " + c2);
    }

    private void determinarVencedor() {
        int cartas1 = contarCartas(jogador1);
        int cartas2 = contarCartas(jogador2);

        if (cartas1 > cartas2) {
            anunciarVencedor("Jogador 1 venceu!");
        } else if (cartas2 > cartas1) {
            anunciarVencedor("Jogador 2 venceu!");
        } else {
            resolverEmpatePorPoder();
        }
    }

    private int contarCartas(Jogador jogador) {
        return jogador.getCartas().getCartas().length;
    }

    private void anunciarVencedor(String mensagem) {
        System.out.println(mensagem);
    }

    private void resolverEmpatePorPoder() {
        int soma1 = somaPoder(jogador1);
        int soma2 = somaPoder(jogador2);

        if (soma1 > soma2) {
            anunciarVencedor("Empate em cartas, mas Jogador 1 venceu por maior poder!");
        } else if (soma2 > soma1) {
            anunciarVencedor("Empate em cartas, mas Jogador 2 venceu por maior poder!");
        } else {
            anunciarVencedor("Empate total!");
        }
    }

    private int somaPoder(Jogador jogador) {
        int total = 0;
        for (CartaBatalha c : jogador.getCartas().getCartas()) {
            total += c.getATK() + c.getDEF();
        }
        return total;
    }
}


