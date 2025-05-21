package strategies.turno;


import model.carta.CartaBatalha;

public enum ModoBatalha {
    ATAQUE {
        @Override
        public int calcularPoder(CartaBatalha carta) {
            return carta.getATK();
        }

        @Override
        public String toString() {
            return "ATAQUE";
        }
    },

    DEFESA {
        @Override
        public int calcularPoder(CartaBatalha carta) {
            return carta.getDEF();
        }

        @Override
        public String toString() {
            return "DEFESA";
        }
    };

    // Método abstrato que cada modo implementa
    public abstract int calcularPoder(CartaBatalha carta);
}

