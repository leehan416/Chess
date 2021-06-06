package manager;

public class Pieces {
	int x = 0;
	int y = 0;
	public int pType;
	boolean en;// false = mine true = enermy

	public Pieces(int type, int x, int y, boolean en) {
		// 1 = Pawn 2 = Knight 3 = Bishop 4 = Rook 5 = Queen 6 = King
		pType = type;
		this.x = x;
		this.y = y;
		this.en = en;
	}

	public Pieces(int a) {

	}

	public void Move(int x, int y) {
		DataBase.map[this.x][this.y] = new Pieces(0, x, y, false);
		DataBase.map[x][y] = new Pieces(pType, x, y, this.en);
		this.x = x;
		this.y = y;
	}

	public void Kill(int x, int y) {

	}

	public void Die() {

	}

	public void Clicked() {
		switch (pType) {
		case 1: {
			for (int i = 0; i < 3; i++) {
				try {
					if (i != 1) {
						if (DataBase.map[x + i][y + 1].en) // 적 존재
							DataBase.moveMap[x + i][y + 1] = true;
					} else if (DataBase.map[x + i][y + 1].pType == 0)
						DataBase.moveMap[x + i][y + 1] = true;
				} catch (Exception E) {
				}
			}
			break;
		}
		case 2: {
			while (true) {
				try {
					if (DataBase.map[x - 2][y + 1].pType >= 0) {
						DataBase.moveMap[x - 2][y + 1] = true;
						break;
					} else if (DataBase.map[x - 2][y - 1].pType >= 0) {
						DataBase.moveMap[x - 2][y - 1] = true;
						break;
					} else if (DataBase.map[x + 1][y + 2].pType >= 0) {
						DataBase.moveMap[x + 1][y + 2] = true;
						break;
					} else if (DataBase.map[x - 1][y + 2].pType >= 0) {
						DataBase.moveMap[x - 1][y + 2] = true;
						break;
					} else if (DataBase.map[x + 2][y + 1].pType >= 0) {
						DataBase.moveMap[x + 2][y + 1] = true;
						break;
					} else if (DataBase.map[x + 2][y - 1].pType >= 0) {
						DataBase.moveMap[x + 2][y - 1] = true;
						break;
					} else if (DataBase.map[x + 1][y + 2].pType >= 0) {
						DataBase.moveMap[x + 1][y + 2] = true;
						break;
					} else if (DataBase.map[x - 1][y + 2].pType >= 0) {
						DataBase.moveMap[x - 1][y + 2] = true;
						break;
					}
				} catch (Exception E) {
				}
			}
			return;
		}
		case 3: {

			int moveX = x;
			int moveY = y;
			while (true) {
				try {
					moveX++;
					moveY++;
					if (DataBase.map[moveX][moveY].pType > 0) {
						break;
					}
					DataBase.moveMap[moveX][moveY] = true;

				} catch (Exception e) {
					break;
				}
				// ----------------------------------------------
				moveX = x;
				moveY = y;
				while (true) {
					try {
						moveX--;
						moveY--;
						if (DataBase.map[moveX][moveY].pType > 0) {
							break;
						}
						DataBase.moveMap[moveX][moveY] = true;
					} catch (Exception e) {
						break;
					}
				}
				// ----------------------------------------------
				moveX = x;
				moveY = y;
				while (true) {
					try {
						moveX++;
						moveY--;
						if (DataBase.map[moveX][moveY].pType > 0) {
							break;
						}
						DataBase.moveMap[moveX][moveY] = true;
					} catch (Exception e) {
						break;
					}
				}
				// ----------------------------------------------
				moveX = x;
				moveY = y;
				while (true) {
					try {
						moveX--;
						moveY++;
						if (DataBase.map[moveX][moveY].pType > 0) {
							break;
						}
						DataBase.moveMap[moveX][moveY] = true;
					} catch (Exception e) {
						break;
					}
				}
				break;
			}
			break;
		}
		case 4: {
			int moveX = x;
			int moveY = y;
			while (true) {
				moveX++;
				try {
					DataBase.moveMap[moveX][moveY] = true;
				} catch (Exception E) {
					break;
				}
			}

			moveY--;

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