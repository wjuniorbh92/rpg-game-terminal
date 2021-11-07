package app.enums;

public enum Doors {
    Direita("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não " +
            "\nescuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a " +
            "\noutra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha " +
            "\npendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal " +
            "\ndo inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem " +
            "\npara espalhar o terror nas cidades e vilas da região.\n",


            "Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha" +
                    "\nem volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.\n",

            "Você resolve usar os equipamentos do inimigo contra ele," +
                    "\ne trocar algumas peças suas, que estavam danificadas, pelas peças de " +
                    "\narmaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios " +
                    "\nà sua frente.",

            "Você decide que não precisa utilizar nada que venha das mãos do inimigo.",

            "Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das" +
                    "\nfechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva" +
                    "\npresa ao cinto.",
            "Você se encaminha para a porta da Esquerda!!! \n"
    ),

    Esquerda("Você retorna à sala anterior e se dirige à porta da esquerda. Você se " +
            "\naproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais " +
            "\nforça sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara " +
            "\ncom uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e " +
            "\ngarrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão " +
            "\nque vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos " +
            "\nsoldados para aterrorizar a região." +
            "\nNo fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque " +
            "\nhorrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.",

            "\nApós derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque " +
                    "\ndo inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido " +
                    "\nlevemente rosado, pega a garrafa e pondera se deve beber um gole.",

            "Você se sente revigorado para seguir adiante!",

            "Você fica receoso de beber algo produzido pelo inimigo",

            "Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave " +
                    "\nabre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa " +
                    "\nque leva presa ao cinto.",

            "Você se encaminha para a porta da Direita!!! \n"


    );

    String initialText;
    String winBattle;
    String acceptItems;
    String declineItems;
    String endText;
    String pathChoose;


    Doors(String initialText, String winBattle, String acceptItems, String declineItems, String endText, String pathChoose) {
        this.initialText = initialText;
        this.winBattle = winBattle;
        this.acceptItems = acceptItems;
        this.declineItems = declineItems;
        this.endText = endText;
        this.pathChoose = pathChoose;
    }

    public void getFollowPathInitial() {
        System.out.println(pathChoose);
        System.out.println(initialText);
    }

    public void getWinBattle() {
        System.out.println(winBattle);
    }

    public void finalPath(){
        System.out.println(endText);
    }
}
