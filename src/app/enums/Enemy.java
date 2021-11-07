package app.enums;

public enum Enemy {

    Armeiro(70, 12.0, 0.50),
    Minotauro(100, 7.0, 0.30),
    SenaiStudent(120, 5.0, 0.05),
    Alquimista(120, 7, 0.30);


    Integer damage;
    Double life;
    Double defense;

    Enemy(int damage, double life, Double defense) {
        this.damage = damage;
        this.life = life;
        this.defense = defense;
    }

    public Integer getDamage() {
        return damage;
    }

    public Double getLife() {
        return life;
    }

    public Double getDefense() {
        return defense;
    }
}
