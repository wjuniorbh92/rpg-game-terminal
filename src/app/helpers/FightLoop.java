package app.helpers;

import app.enums.Classes;
import app.enums.Enemy;
import app.enums.TurnDecision;
import app.enums.Weapons;

import java.util.Random;

public class FightLoop {


    public static Integer RandomValue() {
        Random r = new Random();
        int randomNum = r.nextInt(20 - 1) + 1;
        return randomNum;
    }

    public static Double EnemyAttack(Integer enemy, Double defense, Double life, Double difficulty) {
        Integer random = RandomValue();
        double damage = Damage.mathDamage(random, enemy, enemy, difficulty);
        damage = damage * defense;
        if (random == 1) {
            System.out.println("\nO inimigo errou o ataque! Você não sofreu dano.");
            return life;
        }

        if (random == 20) {
            life = life - damage;
            System.out.println("\nO inimigo acertou um ataque crítico! Você sofreu " + damage + " de dano e agora possui " + life + " pontos de vida.");
            return life;
        }

        life = life - damage;
        System.out.println("\nO inimigo atacou! Você sofreu " + damage + " de dano e agora possui " + life + " pontos de vida.");

        return life;

    }

    public static Double playerAttack(Integer attack, Weapons weapon, Double defenseEnemy, Double lifeEnemy, Double difficulty) {
        Integer random = RandomValue();
        double damage = Damage.mathDamage(random, weapon.getDamage(), attack, difficulty);
        damage = damage * defenseEnemy;
        if (random == 1) {
            System.out.println("\nVocê errou seu ataque! O inimigo não sofreu dano algum.");
            return lifeEnemy;
        }

        if (random == 20) {
            System.out.println("\nVocê acertou um ataque crítico!");
            System.out.println("Você atacou com " + weapon.toString() + " e causou " + damage + " de dano no inimigo!");
            System.out.println("O Inimigo tem " + lifeEnemy + "pontos de vida");
            lifeEnemy = lifeEnemy - damage;

            return lifeEnemy;
        }

        System.out.println("\nVocê atacou com " + weapon.toString() + " e causou " + damage + " de dano no inimigo!");
        System.out.println("O Inimigo tem " + lifeEnemy + "pontos de vida");

        lifeEnemy = lifeEnemy - damage;
        return lifeEnemy;

    }

    public static void PrintInitial() {
        System.out.println(" \n ");
        System.out.println("   ____      ____    ___       ___________          _      __________ __________ \n" +
                "  6MMMMb/   6MMMMb   `MMb     dMM'`MMMMMMMb.       dM.     MMMMMMMMMM `MMMMMMMMM \n" +
                " 8P    YM  8P    Y8   MMM.   ,PMM  MM    `Mb      ,MMb     /   MM   \\  MM      \\ \n" +
                "6M      Y 6M      Mb  M`Mb   d'MM  MM     MM      d'YM.        MM      MM        \n" +
                "MM        MM      MM  M YM. ,P MM  MM    .M9     ,P `Mb        MM      MM    ,   \n" +
                "MM        MM      MM  M `Mb d' MM  MMMMMMM(      d'  YM.       MM      MMMMMMM   \n" +
                "MM        MM      MM  M  YM.P  MM  MM    `Mb    ,P   `Mb       MM      MM    `   \n" +
                "MM        MM      MM  M  `Mb'  MM  MM     MM    d'    YM.      MM      MM        \n" +
                "YM      6 YM      M9  M   YP   MM  MM     MM   ,MMMMMMMMb      MM      MM        \n" +
                " 8b    d9  8b    d8   M   `'   MM  MM    .M9   d'      YM.     MM      MM      / \n" +
                "  YMMMM9    YMMMM9   _M_      _MM__MMMMMMM9' _dM_     _dMM_   _MM_    _MMMMMMMMM \n"
        );

    }


    public static void Fight(Weapons weapon, Double difficulty, Enemy enemy, Classes classes) {
        Double lifeEnemy = enemy.getLife();
        Double life = classes.getLife();
        TurnDecision turnDecision;

        PrintInitial();
        life = EnemyAttack(enemy.getDamage(), classes.getDefense(), life, difficulty);


        while (true) {
            System.out.println("\n\n");
            turnDecision = TurnDecision.valueOf(PrintHelp.printOptions(TurnDecision.values(), "Você tem a opção, seja inteligente!!!"));
            if (!turnDecision.getDecision()) {
                System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
                System.exit(0);
            }

            lifeEnemy = playerAttack(classes.getAttack(), weapon, enemy.getDefense(), lifeEnemy, difficulty);
            System.out.println("------------------------*******---------------------");
            life = EnemyAttack(enemy.getDamage(), classes.getDefense(), life, difficulty);


            if (life <= 0) {
                classes.setLife(life);
                break;
            }
            if (lifeEnemy <= 0) {
                System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
                classes.setLife(life);
                break;
            }

        }


    }


}
