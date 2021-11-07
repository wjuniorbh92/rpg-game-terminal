package app.dialog;

import app.enums.*;
import app.helpers.Damage;
import app.helpers.FightLoop;
import app.helpers.PrintHelp;

import java.util.Map;
import java.util.Scanner;

public class DialogText {

    Scanner input = new Scanner(System.in);
    String name;
    Classes classGen;
    Gender genderPlayer;
    DifficultyChose difficulty;
    Weapons weapon;
    Damage damage = new Damage();
    Map<String, String> diceResult;

    Doors door;

    public static void invalidOption() {
        System.out.println("Opcao invalida, presta a atençao!!!!");
    }

    public static void clearScreen() {
        System.out.print("\033\143");
        System.out.flush();
    }

    public void initialConfig() {
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!!!!!");
        difficultyChoose();
        genderChoose();
        //nameChoose();
        classChoose();
        weaponChoose();
        clearScreen();
    }

    public void difficultyChoose() {
        difficulty = DifficultyChose.valueOf(PrintHelp.printOptions(DifficultyChose.values(), "Escola o nivel de dificuldade"));
        System.out.println(difficulty.getLevel());
    }

    public void genderChoose() {
        genderPlayer = Gender.valueOf(PrintHelp.printOptions(Gender.values(), "Selecione o Genero!!!"));
    }

    public void nameChoose() {
        System.out.println("Qual o seu nome, aventureiro(a)?");
        name = input.next();
        Boolean confirmChose = confirm(name, "Você confirma seu nome como,");
        if (confirmChose) {
            System.out.println("Wow que belo nome," + name);
        } else {
            System.out.println("AhhHhhh! você digitou seu nome errado");
            nameChoose();
        }
    }

    public Boolean confirm(String text, String motive) {
        System.out.println(motive + text);
        int chose = 0;
        while (true) {
            System.out.println("1- Confirma \n2- Cancela");
            chose = input.nextInt();
            if (chose == 1 || chose == 2) {
                break;
            } else {
                invalidOption();
            }
        }
        return chose == 1;
    }

    public void classChoose() {
        classGen = Classes.valueOf(PrintHelp.printOptions(Classes.values(), "Selecione a classe"));
    }

    public void weaponChoose() {
        weapon = Weapons.valueOf(PrintHelp.printOptions(Weapons.values(), "Escolha a sua arma"));
    }

    public void deathPlayer(Gender gender, Motivation motivation) {
        System.out.println("\nVocê não estava preparado para a força do inimigo.");
        if (genderPlayer.getGender() == "Feminino") {
            System.out.println("\n\n");
            System.out.println(motivation.getFemaleDeath());
        } else {
            System.out.println("\n\n");
            System.out.println(motivation.getMaleDeath());
        }
        System.exit(0);
    }

    public void GameSequence() {
//        RoadMap.Ato1();
        Motivation motivation = Motivation.valueOf(PrintHelp.printOptions(Motivation.values(), "Escolha a motivação que te trouxe até aqui"));
//        clearScreen();
//        if (motivation.getMotivation() == 0) {
//            RoadMap.Vinganca();
//        }
//        if (motivation.getMotivation() == 1) {
//            RoadMap.Gloria();
//        }
//        RoadMap.sequenceAto1();
//        PathChoose path = PathChoose.valueOf(PrintHelp.printOptions(PathChoose.values(), "Escolha Aventureiro!!!!"));
//        if (path.getValue() == 1 )
//        {
//            clearScreen();
//            System.out.println(path.getText());
//            System.exit(0);
//        }
//        clearScreen();
//        System.out.println(path.getText());
//        RoadMap.sequecePathChose();
        //Locomote chooseLocomote = Locomote.valueOf(PrintHelp.printOptions(Locomote.values(), "Escolha de que forma você quer avancçar!!"));
        //System.out.println(chooseLocomote.getText());

        /*  Sistema de dano, da para melhorar!!!!! */
        //diceResult = damage.diceRoll(chooseLocomote.getDamage(), difficulty.getDamage(), life);
        //life = Double.valueOf(diceResult.get("life"));
        //System.out.println(diceResult.get(("message")));
        //System.out.println("\nSEU LIFE AGORA ESTA EM "+life+"%");

        //RoadMap.squareRoom();

        door = Doors.valueOf(PrintHelp.printOptions(Doors.values(), "Selecione qual porta seguir aventureiro!!!!"));
        door.getFollowPathInitial();

        RoadMap.enemyRoom();

//        switch (String.valueOf(door)){
//            case "Direita":
//                clearScreen();
//                FightLoop.Fight(weapon, difficulty.getDamage(), Enemy.Armeiro, classGen);
//                if ((classGen.getLife() <= 0)) {
//                    deathPlayer(genderPlayer, motivation);
//                }
//                door.getWinBattle();
//                ArmChoose armChoose = ArmChoose.valueOf(PrintHelp.printOptions(ArmChoose.values() , "Escolha se você deseja se armar ou não"));
//                armChoose.getArmChoose();
//                if(armChoose.getValue()){
//                    classGen.setDefense();
//                }
//                door.finalPath();
//                break;
//
//            case "Esquerda":
//                clearScreen();
//                FightLoop.Fight(weapon, difficulty.getDamage(), Enemy.Alquimista, classGen);
//                if ((classGen.getLife() <= 0)) {
//                    deathPlayer(genderPlayer, motivation);
//                }
//                door.getWinBattle();
//                DrinkChoose drinkChoose = DrinkChoose.valueOf(PrintHelp.printOptions(DrinkChoose.values() , "Escolha se você deseja beber ou não:"));
//                drinkChoose.getDrinkChoose();
//                if(drinkChoose.getValue()){
//                    classGen.setLife(10.0);
//                }
//                door.finalPath();
//                break;
//
//            default:
//                System.exit(0);
//        }

        clearScreen();
        RoadMap.enemyRoomPart2();

        AttackChoose attackChoose = AttackChoose.valueOf(PrintHelp.printOptions(AttackChoose.values(),"Decida-se se você vai enfrentar esse desafio:"));
        attackChoose.getText();
        if(attackChoose.getValue()){
            System.exit(0);
        }
        FightLoop.Fight(weapon, difficulty.getDamage(), Enemy.SenaiStudent, classGen);
        if ((classGen.getLife() <= 0)) {
            deathPlayer(genderPlayer, motivation);
        }

        motivation.getFinalText();
        RoadMap.finalText();
    }

}
