package boardgames;

import javafx.scene.canvas.Canvas;
import javafx.scene.draw.GraphicsContext;
import javafx.scene.image.Image;

public class GameBoardView extends Canvas {
	private GameBoard board;
	private double squareSize;

	public GameBoardView(GameBoard aBoard, double width, double height) {
		super(width, height);
		board = aBoard;
		squareSize = width / aBoard.getSize();
		aBoard.addListener((theBoard) -> reDraw());
		reDraw();
	}

	public void reDraw() {
		for (int rankIndex = 0; rankIndex < board.getSize(); ++rankIndex) {
			for (int fileIndex = 0; fileIndex < board.getSize(); ++fileIndex) {
				GameCoordinate coord = new GameCoordinate(fileIndex, rankIndex);
				drawSquare(coord);
			}
		}
	}

	public void drawSquare(GameCoordinate coord) {
		javafx.scene.canvas.GraphicsContext gc = getGraphicsContext2d();
		GameSquare square = board.getSquare(coord);
		gc.setFill(square.getColor());
		double x = coord.fileIndex * squareSize;
		double y = coord.rankIndex * squareSize;
		gc.fillRect(x, y, squareSize, squareSize);
		if(!square.isEmpty()) {
			Image image = square.getPiece().getImage();
			gc.drawImage(image,  x, y, squareSize, squareSize);
		}
	}
}
