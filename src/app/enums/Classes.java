package app.enums;

public enum Classes {
    CAVALEIRO("Cavaleiro(a)", 10.0, 0.50, 80),
    GATURNO("Gaturno(a)", 10.0, 0.25, 100),
    MAGO("Mago(a)", 10.0, 0.10, 125);

    private String classes;
    private Double life;
    private Double defense;
    private Integer attack;

    Classes(String classes, Double life, Double defense, Integer attack) {
        this.classes = classes;
        this.life = life;
        this.defense = defense;
        this.attack = attack;
    }


    public String getClasses() {
        return classes;
    }

    public Double getLife() {
        return life;
    }

    public void setLife(Double life) {
        this.life = life;
    }

    public void setDefense() {
        Double oldDefense = this.defense;
        this.defense = oldDefense + 0.5;
    }

    public Double getDefense() {
        return defense;
    }

    public Integer getAttack() {
        return attack;
    }
}

