package app.dialog;

public class RoadMap {

    public static void Ato1() {
        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo," +
                "\ne sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão." +
                "\nVocê olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.\n\n" +
                "Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de" +
                "\ntodos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu " +
                "\nequipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um" +
                "\npasso de encerrar para sempre esse mal." +
                "\n\nBuscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n"
        );
    }

    public static void Vinganca() {
        System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar " +
                "\npara lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, " +
                "\nquando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível " +
                "\nque te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles " +
                "\nque foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder " +
                "\nfinalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).\n");
    }

    public static void Gloria() {
        System.out.println(
                "Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços"
                        + "\nabertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e "
                        + "\ndiversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde "
                        + "\njá, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir "
                        + "\no vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa "
                        + "\nhistória. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
    }

    public static void sequenceAto1() {
        System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas " +
                "\nmãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. " +
                "\nVocê avança pelo portal.\n" +
                "\nA escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua " +
                "\nfrente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à " +
                "\nfrente, ou desistir.\n"
        );
    }

    public static void sequecePathChoose() {
        System.out.println("\nvocê se pergunta se dentro dessa sala pode haver inimigos, \nou alguma armadilha, e pondera sobre como passar pela porta.");
    }


    public static void squareRoom() {
        System.out.println(
                "Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma " +
                        "\ndelas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A " +
                        "\nporta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você " +
                        "\nnão sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima " +
                        "\nda porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que " +
                        "\nprecisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir " +
                        "\nenfrentar o líder.\n"
        );

    }

    public static void enemyRoom() {
        System.out.println("\nEnquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar " +
                "\npara trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um " +
                "\ndos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em " +
                "\nposição de combate. Ele avança em sua direção.");
    }

    public static void enemyRoomPart2(){
        System.out.println("\nAo lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave" +
                "\nabre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa " +
                "\nque leva presa ao cinto." +
                "\n\nDe volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a " +
                "\nporta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você " +
                "\npercebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca " +
                "\nno combate que você sabe que irá se seguir, e adentra a porta.\n" +
                "\nLá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e " +
                "\nprisioneiros acorrentados às paredes.\n" +
                "\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de " +
                "lâmina dupla.\n");

    }

    public static void finalText(){
        System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em " +
                "\ndireção à noite, retornando à cidade. Seu dever está cumprido.\n" +
                "\n         _.+._\n" +
                "       (^\\/^\\/^)\n" +
                "        \\@*@*@/\n"+
                "         {_____}\n");
    }
}

