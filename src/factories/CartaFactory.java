package factories;

import model.carta.CartaBatalha;
import model.carta.TipoCarta;

public final class CartaFactory {
    public static CartaBatalha criarCarta(TipoCarta tipo) {
        return new CartaBatalha(tipo);
    }
}
