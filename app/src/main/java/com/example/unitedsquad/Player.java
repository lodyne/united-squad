package com.example.unitedsquad;

public class Player {
    private int playerImage;
    private String playerName;
    private String playerNumber;


    public Player(int playerImage, String playerName, String playerNumber) {
        this.playerImage = playerImage;
        this.playerName = playerName;
        this.playerNumber = playerNumber;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(int playerImage) {
        this.playerImage = playerImage;
    }
}
