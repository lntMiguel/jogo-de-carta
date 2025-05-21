package model.carta;

public interface Cartas {

    public String getNome();
    public int getATK();
    public int getDEF();
    public boolean adicionaCarta(CartaBatalha cartaBatalha);
    public CartaBatalha[] getCartas();



}
