package com.bootcamp.lab3.lab33;

public class VideoGame implements IPlayable {
    private String gameName;

    
    public VideoGame(String gameName) {
        this.gameName = gameName;
    }


    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println(gameName + ": Pew pew pew...");
    }
    
}
