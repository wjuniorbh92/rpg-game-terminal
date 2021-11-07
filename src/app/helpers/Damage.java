package app.helpers;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Damage {
    Random rand = new Random();

    public static double mathDamage(Integer dice, Integer attack, Integer weapon, Double difficulty) {
        double damageTotal = ((attack + weapon + dice) * difficulty) / 35;
        return damageTotal;
    }

    private String MessageDamage(Double value) {
        return "\nOh!!!! você sofreu um dano de " + value + " pontos\n";
    }

    private String MessageNotDamage() {
        return "\nA sorte estaá com você aventureiro, você escapou dessa.\n";
    }

    public Map<String, String> diceRoll(int[] arrayDmg, Double damageDifficulty, Double life) {
        Double randomDamage;
        Map<String, String> damageMessage = new HashMap<>();

        int randomNum = rand.nextInt((arrayDmg[1] - arrayDmg[0]) + 1) + arrayDmg[0];
        randomDamage = (randomNum * damageDifficulty) / 10;
        life = life - randomDamage;

        if (randomDamage > 0) {
            damageMessage.put("message", MessageDamage(randomDamage));
        } else {
            damageMessage.put("message", MessageNotDamage());
        }
        damageMessage.put("life", String.valueOf(life));

        return damageMessage;

    }


}
