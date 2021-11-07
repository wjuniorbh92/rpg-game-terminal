package app.enums;

public enum DrinkChoose {
    Beber("Você se sente revigorado para seguir adiante!",true),
    Recusar("Você fica receoso de beber algo produzido pelo inimigo",false);


    String text;
    Boolean value;
    DrinkChoose(String text , Boolean value) {
        this.text = text;
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void getDrinkChoose() {
        System.out.println(text);
    }
}


