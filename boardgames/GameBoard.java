package boardgames;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.paint.Color;

public class GameBoard implements Observable {
	private GameSquare[][] squares;
	private List<InvalidationListener> Listeners;

	public GameBoard(int size, Color dark, Color light) {
		this.squares = new GameSquare[size][size];
		Listeners = new ArrayList<InvalidationListener>();

		for (int rank = 0; rank < size; rank++) {
			for (int file = 0; file < size; file++) {
				if (rank % 2 == file % 2) {
					this.squares[rank][file] = new GameSquare(dark);
				} else {
					this.squares[rank][file] = new GameSquare(light);
				}
			}
		}
	}

	public GameSquare getSquare(GameCoordinate gameCoordinate) {
		return this.squares[gameCoordinate.getRankIndex()][gameCoordinate.getFileIndex()];
	}

	public int getSize() {
		return this.squares.length;
	}

	public boolean isEmpty(GameCoordinate gameCoordinate) {
		if (getSquare(gameCoordinate).getPiece() == null) {
			return true;
		} else {
			return false;
		}
	}

	public void placePiece(GameCoordinate gameCoordinate, GamePiece gamePiece) {
		this.squares[gameCoordinate.getRankIndex()][gameCoordinate.getFileIndex()].placePiece(gamePiece);
		notifyListeners();
	}

	public GamePiece getPiece(GameCoordinate gameCoordinate) {
		return getSquare(gameCoordinate).getPiece();
	}

	public void removePiece(GameCoordinate gameCoordinate) {
		getSquare(gameCoordinate).removePiece();
		notifyListeners();
	}

	@Override
	public void addListener(InvalidationListener aListener) {
		Listeners.add(aListener);
	}

	@Override
	public void removeListener(InvalidationListener aListener) {
		Listeners.remove(aListener);
	}
	
	private void notifyListeners() {
		for(InvalidationListener eachListener : Listeners) {
			eachListener.invalidated(this);
		}
	}
	
	public void clearBoard() {
		for (int rank = 0; rank < getSize(); rank++) {
			for (int file = 0; file < getSize(); file++) {
				if (rank % 2 == file % 2) {
					this.squares[rank][file].removePiece();
				}
				}
			notifyListeners();
			}
		}
	}

}
