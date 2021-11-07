package app;

import app.dialog.DialogText;

import java.io.IOException;

public class App extends DialogText {

    public static void main(String[] args) throws IOException, InterruptedException {
        App newGame = new App();
        newGame.initialConfig();
        newGame.GameSequence();
    }


}
