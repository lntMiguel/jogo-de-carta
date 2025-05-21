# jogo-de-carta
Jogo de carta feito para a disciplina de Arquitetura de Software para o 4° semestre de Análise e Desenvolvimento do Senac.

Nele foi aplicado os conceitos SOLID e 3 design pattern, factory, strategy e composite. 

O jogo consiste em 2 jogadores escolherem 6 cartas as quais contém atributos de ataque e defesa, as cartas podem ser jogadas em dois modos: Ataque e Defesa.
Cada jogador escolhe uma carta para jogar e em que modo jogar, se ambos escolheram ataque, quem tem menos poder de ataque perde a carta, se ambos escolheram defesa nada acontece, se um escolheu ataque e outro defesa, ganha quem tem mais poder no modo selecionado porém se o ataque ganhar: O jogador que escolheu defesa perde a carta, mas caso o jogador que escolheu defesa ganhe, o atacante não perde a carta.

Critérios para vitória:  limite de turno 10, número de cartas na mão (começa com 6 e vai perdendo), soma de pontos de ataque, soma de pontos de defesa.
