package app.enums;

public enum Weapons {
    Espada(100), Arco(90);

    Integer damage;


    Weapons(Integer damage) {
        this.damage = damage;
    }

    public Integer getDamage() {
        return damage;
    }
}
