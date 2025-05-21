package strategies.turno;

import model.carta.CartaJogada;
import model.jogador.Jogador;

public interface RegraBatalhaStrategy {
    boolean aplica(ModoBatalha m1, ModoBatalha m2);
    void resolver(Jogador j1, CartaJogada c1, Jogador j2, CartaJogada c2);
}

