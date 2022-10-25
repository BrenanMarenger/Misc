package boardgames;

import javafx.scene.paint.Color;

public class GameSquare {
	private Color color;
	private GamePiece piece;

	public GameSquare(Color color) {
		this.color = color;
		this.piece = null;
	}

	public Color getColor() {
		return this.color;
	}

	public GamePiece getPiece() {
		return this.piece;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void placePiece(GamePiece gamePiece) {
		this.piece = gamePiece;
	}

	public boolean isEmpty() {
		if (piece == null) {
			return true;
		} else {
			return false;
		}
	}

	public void removePiece() {
		this.piece = null;
	}
}
