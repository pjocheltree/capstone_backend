package Player;
import java.awt.Color;

//import Pieces.Bishop;
//import Pieces.Pawn;
//import Pieces.Piece;
//import Pieces.Rook;


public class Player {
	private String PlayerName;
	private Color PlayerColor;
	private int KillCount = 0;
	
	public Player(String PlayerName, Color PlayerColor) {
		this.PlayerName = PlayerName;
		this.PlayerColor = PlayerColor;
	}
	
	public Color getColor() {
		return this.PlayerColor;
	}
	
	public String getName() {
		return this.PlayerName;
	}
	
	public int getKill() {
		return this.KillCount;
	}
	
	public void setColor(Color PlayerColor) {
		this.PlayerColor = PlayerColor;
	}
	
	public void addKill() {
		this.KillCount += 1;
	}
	
	public void subKill() {
		if(this.KillCount > 0) {
			this.KillCount -= 1;
		}
	}
}
