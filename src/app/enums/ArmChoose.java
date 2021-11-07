package app.enums;

public enum ArmChoose {

    Pegar( "Você resolve usar os equipamentos do inimigo contra ele," +
            "\ne trocar algumas peças suas, que estavam danificadas, pelas peças de " +
            "\narmaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios " +
            "\nà sua frente."
            ,true),
    Deixar("Você fica receoso de beber algo produzido pelo inimigo",false);


    String text;
    Boolean value;

    ArmChoose(String text , Boolean value) {
        this.text = text;
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void getArmChoose() {
        System.out.println(text);
    }
}
