package strategies.deck;

public class FinalizarMontagemStrategy implements DeckStrategy{
    @Override
    public boolean executar() {
        System.out.println("Montagem do deck finalizada.");
        return false;
    }
}
