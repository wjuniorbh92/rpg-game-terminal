package app.enums;

public enum Motivation {
    Vinganca(0,
            "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você",
            "Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você",
            "Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma "+
            "\nsensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você "+
                    "\npode seguir sua vida.\n"

    ),
    Gloria(1,
            "A glória que buscavas não será sua, e a cidade aguarda por seu próximo heroi",
            "A glória que buscavas não será sua, e a cidade aguarda por sua proxima heroina",
            "\nO êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de "+
                    "\nalegria. A glória o aguarda, você a conquistou."


    );

    Integer motivation;
    String maleDeath;
    String femaleDeath;
    String finalText;

    Motivation(Integer motivation, String maleDeath, String femaleDeath, String finalText) {
        this.motivation = motivation;
        this.maleDeath = maleDeath;
        this.femaleDeath = femaleDeath;
        this.finalText = finalText;
    }

    public Integer getMotivation() {
        return motivation;
    }

    public String getMaleDeath() {
        return maleDeath;
    }

    public String getFemaleDeath() {
        return femaleDeath;
    }

    public void getFinalText() {
        System.out.println(finalText);
    }
}
