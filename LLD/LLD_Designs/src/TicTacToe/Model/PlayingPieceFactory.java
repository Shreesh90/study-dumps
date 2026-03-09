package TicTacToe.Model;

public class PlayingPieceFactory {

    public PlayingPiece getPlayingPiece(PieceType pieceType) throws Exception {
        switch (pieceType) {
            case X -> {
                return new PlayingPieceX();
            }
            case O -> {
                return new PlayingPieceO();
            }
            default -> {
                throw new Exception("Given Piece not supported");
            }
        }
    }
}
