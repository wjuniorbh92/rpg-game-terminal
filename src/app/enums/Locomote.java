package app.enums;

public enum Locomote {

    Saltando("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.", 0, 0),

    Andando("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você " +
            "\npisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado \n" +
            "\nem uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se" +
            "\nabre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta " +
            "\npara dentro da sala, porém uma delas te acerta na perna. ", 1, 10),

    Correndo("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, " +
            "\nsente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,  \n" +
            "\nolhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas " +
            "\nbatendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela " +
            "\nporta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no " +
            "\nteto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.", 0, 0);


    String text;
    Integer minDamage;
    Integer maxDamage;

    Locomote(String text, int minDamage, int maxDamage) {
        this.text = text;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getText() {
        return text;
    }

    public int[] getDamage() {
        int[] damangeArray = new int[]{minDamage, maxDamage};
        return damangeArray;
    }


}
