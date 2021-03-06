package Pieces;

import Board.Board;

public class Bishop extends Piece {
	
	public Bishop(int x, int y, boolean isWhite, Board board, int value) {
		super();
	}
	
	public void initializeSide(int value) {
		super.initializeSide(value);
	}

	@Override
	public boolean canMove(int x, int y, Board board) {
		if(board.getPiece(x, y) != null && board.getPiece(x, y).isWhite() == isWhite()) {
			return false;
		}
		
		if(Math.abs(x - xCord) == Math.abs(y - yCord)) {
			return bishopMoves(x, y, board);
		}
		return false;
	}
	
	public boolean bishopMoves(int x, int y, Board board) {
		if(x > xCord && y > yCord) {
			int j = yCord + 1;
			for(int i = xCord + 1; i < x; i++) {
				if(board.getXY(i, j) != 0) {
					return false;
				}
				j++;
			}
		}
		else if(x < xCord && y < yCord) {
			int j = yCord - 1;
			for(int i = xCord - 1; i > x; i--) {
				if(board.getXY(i, j) != 0) {
					return false;
				}
				j--;
			}
		}
		else if(x > xCord && y < yCord) {
			int j = yCord - 1;
			for(int i = xCord + 1; i < x; i++) {
				if(board.getXY(i, j) != 0) {
					return false;
				}
				j--;
			}
		}
		else if(x < xCord && y > yCord) {
			int j = yCord + 1;
			for( int i = xCord - 1; i > x; i--) {
				if(board.getXY(i, j) != 0) {
					return false;
				}
			}
			j++;
		}
		return true;
	}
}
