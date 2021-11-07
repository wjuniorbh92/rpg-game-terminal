package app.enums;

public enum DifficultyChose {
    Facil(0.80, "Ta com medo né, seu passeio então vai ser tranquilo"),
    Normal(1.00, "Vamos ver se você esta pronto para o desafio"),
    Dificil(1.20, "Sua caminhada será quase impossivel, mas a recompensa valerá a pena");

    private String phaseLevel;
    private Double damage;

    DifficultyChose(Double damage, String phaseLevel) {
        this.phaseLevel = phaseLevel;
        this.damage = damage;
    }

    public String getLevel() {
        return phaseLevel;
    }

    public Double getDamage() {
        return damage;
    }


}
