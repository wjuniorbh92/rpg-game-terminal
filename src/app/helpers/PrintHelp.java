package app.helpers;

import app.dialog.DialogText;

import java.util.Scanner;

public class PrintHelp {

    public static String printOptions(Enum<?>[] enums, String text) {
        System.out.println(text);
        String values = "";
        for (Enum<?> enum1 : enums) {
            System.out.println(enum1.ordinal() + " - " + enum1);
        }
        try {
            values = enums[inputUser()].name();
        } catch (Exception e) {
            DialogText.invalidOption();
            values = printOptions(enums, text);
        }
        return values;
    }


    private static int inputUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione uma opcao valida:");
        int opcao = scan.nextInt();
        return opcao;
    }

}
