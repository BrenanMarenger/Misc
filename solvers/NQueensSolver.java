package solvers;

import java.util.ArrayList;
import java.util.List;

import boardgames.GameBoard;
import boardgames.GameCoordinate;
import boardgames.Queen;

public class NQueensSolver extends PuzzleSolver {
	
	public NQueensSolver(GameBoard aBoard) {
		super(aBoard);
	}

	@Override
	public boolean isSolved() {
		return moves.size() == board.getSize();
	}
	
	@Override
	public List<GameMove> nextLegalMoves() {
		List<GameMove>nextMoves = new ArrayList<GameMove>();
		for(int fileIndex = 0; fileIndex < board.getSize(); fileIndex++) {
			GameCoordinate eachCoordinate = new GameCoordinate(fileIndex, currentRankIndex());
			if(isSafe(eachCoordinate)) {
				GameMove aMove = new GameMove(eachCoordinate, new Queen());
				nextMoves.add(aMove);
//				make aMove for eachCoordinate
//				add aMove to nextMoves				
			}
		}
		
		return nextMoves;
	}
	
	int currentRankIndex() {
		return moves.size();
	}
	
	public boolean isThreatenedBy(GameCoordinate coord1, GameCoordinate coord2) {
		if(coord1.getFile() != coord2.getFile() && coord1.getRank() != coord2.getRank() 
				&& Math.abs(coord1.getFile() - coord2.getFile()) != Math.abs(coord1.getRank() - coord2.getRank())) {
			return false;
		}
		return true;	
	}
	
	public boolean isSafe(GameCoordinate aCoord) {
		for(GameMove eachMove : moves) {
			if(isThreatenedBy(aCoord ,eachMove.to())){
				return false;
			}
		}	
		return true;
	}

}
