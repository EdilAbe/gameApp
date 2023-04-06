package com.edil.springProject;

import com.edil.springProject.game.GameRunner;
import com.edil.springProject.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args){
        var game = new MarioGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
