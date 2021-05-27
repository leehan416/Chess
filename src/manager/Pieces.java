package manager;

public class Pieces {
	int x = 0;
	int y = 0;
	int pType;

	public Pieces(int type) { // 1 = Pawn 2 = Knight 3 = Bishop 4 = Rook 5 = Queen 6 = King
		pType = type;
	}

	public void Move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void Kill(int x, int y) {
		
	}

	public void Clicked(int x, int y) {

	}
}