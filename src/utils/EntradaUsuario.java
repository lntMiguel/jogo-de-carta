package utils;

import model.carta.CartaJogada;
import model.jogador.Jogador;

public interface EntradaUsuario {
    CartaJogada escolherCarta(Jogador jogador, String nomeJogador);
}
