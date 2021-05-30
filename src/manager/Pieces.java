package manager;

public class Pieces {
	int x = 0;
	int y = 0;
	int pType;
	boolean en;// false =mine true = enermy

	public Pieces(int type, int x, int y, boolean en) { 
		// 1 = Pawn 2 = Knight 3 = Bishop 4 = Rook 5 = Queen 6 = King
		pType = type;
		this.x = x ;
		this.y = y;
		this.en = en;	
	}

	public void Move(int x, int y) {
		DataBase.map [this.x][this.y] = new Pieces(0, x, y, false);
		DataBase.map[x][y] = new Pieces(pType, x, y, this.en);
		this.x = x;
		this.y = y;
	}

	public void Kill(int x, int y) {

	}

	public void Clicked() {
		switch (pType) {
		case 1: {
			/*if ((DataBase.map[x - 1][y + 1] == 2) || (DataBase.map[x + 1][y + 1] == 2)) {// kill
				DataBase.moveMap[x - 1][ y + 1 ] = 1; 
				
			} else if (DataBase.map[x][y + 1] == 0) { // move
				
			} else { // unable to move 
				
			}*/
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}
		case 5: {
			break;
		}
		case 6: {
			break;
		}
		}
	}
}