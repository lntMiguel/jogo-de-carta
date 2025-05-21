package model.carta;

public enum TipoCarta {

        // Família Dragão
        DRAGAO_DE_FOGO{
            @Override
            public int getATK() { return 2500; }
            @Override
            public int getDEF() { return 2100; }
            @Override
            public String getNome() { return "Dragão de Fogo"; }
        },
        DRAGAO_ESPIRITUAL{
            @Override
            public int getATK() { return 2700; }
            @Override
            public int getDEF() { return 2300; }
            @Override
            public String getNome() { return "Dragão Espiritual"; }
        },

        // Família Guerreiro
        GUERREIRO_SOMBRIO{
            @Override
            public int getATK() { return 2200; }
            @Override
            public int getDEF() { return 2000; }
            @Override
            public String getNome() { return "Guerreiro Sombrio"; }
        },
        CAVALEIRO_DE_LUZ{
            @Override
            public int getATK() { return 2400; }
            @Override
            public int getDEF() { return 2200; }
            @Override
            public String getNome() { return "Cavaleiro de Luz"; }
        },

        // Família Zumbi
        ZUMBIE_DO_FIM{
            @Override
            public int getATK() { return 1500; }
            @Override
            public int getDEF() { return 1000; }
            @Override
            public String getNome() { return "Zumbi do Fim"; }
        },
        ZUMBI_IMORTAL{
            @Override
            public int getATK() { return 1700; }
            @Override
            public int getDEF() { return 1400; }
            @Override
            public String getNome() { return "Zumbi Imortal"; }
        },

        // Família Fera
        FERA_DE_TREVA{
            @Override
            public int getATK() { return 2000; }
            @Override
            public int getDEF() { return 1800; }
            @Override
            public String getNome() { return "Fera de Treva"; }
        },
        FERA_DA_LUZ{
            @Override
            public int getATK() { return 2300; }
            @Override
            public int getDEF() { return 2100; }
            @Override
            public String getNome() { return "Fera da Luz"; }
        },

        // Família Magia
        MAGO_ARCANO{
            @Override
            public int getATK() { return 1800; }
            @Override
            public int getDEF() { return 1600; }
            @Override
            public String getNome() { return "Mago Arcano"; }
        },
        MAGE_EXILADO{
            @Override
            public int getATK() { return 2000; }
            @Override
            public int getDEF() { return 1700; }
            @Override
            public String getNome() { return "Mago Exilado"; }
        },

        // Família Elfo
        ELFO_SAGRADO{
            @Override
            public int getATK() { return 2200; }
             @Override
            public int getDEF() { return 1800; }
            @Override
            public String getNome() { return "Elfo Sagrado"; }
        },
        ELFO_LUMINOSO{
            @Override
            public int getATK() { return 2400; }
            @Override
            public int getDEF() { return 2000; }
            @Override
            public String getNome() { return "Elfo Luminoso"; }
        },

        // Família Bestas
        BEAST_IMPERIAL{
            @Override
            public int getATK() { return 2100; }
            @Override
            public int getDEF() { return 1900; }
            @Override
            public String getNome() { return "Besta Imperial"; }
        },
        LOBISOMEM_DAS_FERAS{
            @Override
            public int getATK() { return 2500; }
            @Override
            public int getDEF() { return 2200; }
            @Override
            public String getNome() { return "Lobisomem das Feras"; }
        },

        // Família Cavaleiro
        CAVALEIRO_OBSCURO{
            @Override
            public int getATK() { return 2600; }
            @Override
            public int getDEF() { return 2400; }
            @Override
            public String getNome() { return "Cavaleiro Obscuro"; }
        },
        CAVALEIRO_DA_LUZ{
            @Override
            public int getATK() { return 2800; }
            @Override
            public int getDEF() { return 2600; }
            @Override
            public String getNome() { return "Cavaleiro da Luz"; }
        };

        // Métodos abstratos para as cartas
        abstract int getATK();
        abstract int getDEF();
        public abstract String getNome();
    }


