package model.deck;

import model.carta.CartaBatalha;
import model.carta.Cartas;

import java.util.ArrayList;
import java.util.List;

public class Deck implements Cartas {

    private List<CartaBatalha> deck = new ArrayList<>();

    @Override
    public String getNome() {
        String temp = "";

        for (CartaBatalha c: deck){
            temp = temp + c.getNome() + "\n";
        }
        return temp;
    }

    @Override
    public int getATK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDEF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean adicionaCarta(CartaBatalha cartaBatalha) {
        if (deck.size() >= 6) {
            return false;
        }

        // Verifica se o deck já contém uma carta do mesmo tipo
        for (CartaBatalha carta : deck) {
            if (carta.getCarta() == cartaBatalha.getCarta()) {
                return false; // Carta repetida
            }
        }

        deck.add(cartaBatalha);
        return true;
    }

    @Override
    public CartaBatalha[] getCartas() {
        CartaBatalha[] tmp = new CartaBatalha[this.deck.size()];
        for (int i = 0; i < this.deck.size(); i++){
            tmp[i] = this.deck.get(i);
        }
        return tmp;
    }

    public void listarCartas() {
        for (CartaBatalha carta : deck) {
            System.out.println("- " + carta.getNome());
        }
    }

    public void setCartas(List<CartaBatalha> novasCartas) {
        this.deck = novasCartas;
    }
}
