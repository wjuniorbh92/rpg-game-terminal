package app.enums;

public enum PathChoose {
    Desistir(1,
            "o medo invade o seu coração e você sente que ainda não está à altura do desafio." +
                    "\nVocê se volta para a noite lá fora e corre em direção à segurança."),

    Seguir(2,
            " você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente " +
                    "\numa fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.\n");

    Integer value;
    String text;

    PathChoose(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
