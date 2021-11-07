package app.enums;

public enum AttackChoose {

    Desistir(true,
            "O medo invade o seu coração e você sente que ainda não está à altura do desafio." +
                    "\nsabendo que é um aluno do Senai muito poderoso e sabio"+
                    "\nVocê se volta para a noite lá fora e corre em direção à segurança."),

    Atacar(false,
          "Você vê o inimigo, é percebe que ele é um aluno do senai" +
                    "\nsabe que ele está cansado, e tem virado a noite aprendendo o conteudo, então vai com tudo.\n");
    Boolean value;
    String text;


    AttackChoose(Boolean value, String text) {
        this.text = text;
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void getText() {
        System.out.println("\n"+text);
    }
}
