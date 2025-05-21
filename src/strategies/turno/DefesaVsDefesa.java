package strategies.turno;

import model.carta.CartaJogada;
import model.jogador.Jogador;

public class DefesaVsDefesa implements RegraBatalhaStrategy {
    @Override
    public boolean aplica(ModoBatalha m1, ModoBatalha m2) {
        return m1 == ModoBatalha.DEFESA && m2 == ModoBatalha.DEFESA;
    }

    @Override
    public void resolver(Jogador j1, CartaJogada c1, Jogador j2, CartaJogada c2) {
        System.out.println("DEFESA vs DEFESA: Nada acontece.");
    }
}

