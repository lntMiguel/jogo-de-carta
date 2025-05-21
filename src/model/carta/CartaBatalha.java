package model.carta;

import factories.CartaFactory;

public class CartaBatalha implements Cartas{

    private TipoCarta carta;

    public TipoCarta getCarta() {
        return carta;
    }

    public void setCarta(TipoCarta carta) {
        this.carta = carta;
    }

    public CartaBatalha(TipoCarta carta) {
        this.carta = carta;
    }


    @Override
    public String getNome() {
        return carta.getNome();
    }

    @Override
    public int getATK() {
        return carta.getATK();
    }

    @Override
    public int getDEF() {
        return carta.getDEF();
    }

    @Override
    public boolean adicionaCarta(CartaBatalha cartaBatalha) {
        if (this.carta != null){
            return false;
        }

        this.carta = cartaBatalha.getCarta();

        return true;
    }

    @Override
    public CartaBatalha[] getCartas() {
        CartaBatalha[] tmp = new CartaBatalha[1];

        tmp[0] = CartaFactory.criarCarta(this.carta);

        return tmp;
    }
}
