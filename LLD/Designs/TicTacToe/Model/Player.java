package Designs.TicTacToe.Model;

public class Player {
    String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public PlayingPiece getPlayingPiece() {
        return this.playingPiece;
    }

    public String getPlayerName() {
        return name;
    }
}
