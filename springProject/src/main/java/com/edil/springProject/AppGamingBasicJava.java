package com.edil.springProject;

import com.edil.springProject.game.GameRunner;
import com.edil.springProject.game.MarioGame;
import com.edil.springProject.game.PacmanGame;

public class AppGamingBasicJava {
    public static void main(String[] args){
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
