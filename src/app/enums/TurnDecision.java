package app.enums;

public enum TurnDecision {
    Atacar(true, "Você decide atacar, boa sorte Aventureiro"),
    Correr(false, "Você decide correr!!!! Seu covarde!!!!");

    Boolean decision;
    String message;

    TurnDecision(Boolean decision, String message) {
        this.decision = decision;
        this.message = message;
    }

    public boolean getDecision() {
        return decision;
    }

    public String getMessage() {
        return message;
    }
}
