package Designs.TicTacToe.Model;

public class PlayingPieceFactory {

    public PlayingPiece getPlayingPiece(PieceType pieceType) throws Exception {
        switch (pieceType) {
            case PieceType.X -> {
                return new PlayingPieceX();
            }
            case PieceType.O -> {
                return new PlayingPieceO();
            }
            default -> {
                throw new Exception("Given Piece not supported");
            }
        }
    }
}
