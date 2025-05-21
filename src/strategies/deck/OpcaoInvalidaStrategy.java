package strategies.deck;

public class OpcaoInvalidaStrategy implements DeckStrategy {
    @Override
    public boolean executar() {
        System.out.println("Opção inválida! Tente novamente.");
        return true;
    }
}
