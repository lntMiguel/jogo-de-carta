package services;

import model.carta.CartaJogada;
import model.jogador.Jogador;
import strategies.turno.*;

import java.util.List;

public class BatalhaService {
        private final List<RegraBatalhaStrategy> regras;

        public BatalhaService() {
            this.regras = List.of(
                    new AtaqueVsAtaque(),
                    new AtaqueVsDefesa(),
                    new DefesaVsDefesa()
            );
        }

        public void resolverBatalha(Jogador j1, CartaJogada c1, Jogador j2, CartaJogada c2) {
            for (RegraBatalhaStrategy regra : regras) {
                if (regra.aplica(c1.getModo(), c2.getModo())) {
                    regra.resolver(j1, c1, j2, c2);
                    return;
                }
            }
            System.out.println("Nenhuma regra encontrada.");
        }


    }

