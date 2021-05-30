package manager;

public class Main {

	public static UI ui;

	public void main(String[] args) {
		setup();
		ui = new UI();
		ui.BoardPrint();
	}

	void setup() {
		boolean en = false;
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (y < 2)
					en = true;
				else
					en = false;

				if ((y == 1) || (y == 6))
					DataBase.map[x][y] = new Pieces(1, x, y, en);

				if (((y == 0) || (y == 7)) && ((x == 1) || (x == 6)))

					DataBase.map[x][y] = new Pieces(2, x, y, en);

				if (((y == 0) || (y == 7)) && ((x == 2) || (x == 5)))
					DataBase.map[x][y] = new Pieces(3, x, y, en);

				if (((x == 0) || (x == 7)) && ((y == 0) || (y == 7)))
					DataBase.map[x][y] = new Pieces(4, x, y, en);

				if (((y == 0) || (y == 7)) && (x == 3))
					DataBase.map[x][y] = new Pieces(5, x, y, en);

				if (((y == 0) || (y == 7)) && (x == 4))
					DataBase.map[x][y] = new Pieces(6, x, y, en);

			}
		}
	}
}
