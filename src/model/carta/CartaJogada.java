package model.carta;

import strategies.turno.ModoBatalha;

public class CartaJogada {
    private CartaBatalha carta;
    private ModoBatalha modo;

    public CartaJogada(CartaBatalha carta, ModoBatalha modo) {
        this.carta = carta;
        this.modo = modo;
    }

    public CartaBatalha getCarta() {
        return carta;
    }

    public ModoBatalha getModo() {
        return modo;
    }

    public int getPoder() {
        return modo.calcularPoder(carta);
    }

    @Override
    public String toString() {
        return carta.getNome() + " em modo de " + modo + " (Poder: " + getPoder() + ")";
    }
}
