public class Life implements ILife {

  int [][] matrix;

	public static void main(String[] args) {
		Life l = new Life(new String[] { "     ", "     ", " *** ", "     ",	"     " });
		l = (Life) l.nextGeneration();
	}

	// Konstruktor
	public Life() {
		this.matrix = new int[5][5];
	}

	/*
	 * public Life(String[] setup) { for (int y = 0; y < setup.length; y++) for
	 * (int x = 0; x < setup[y].length(); x++) if (setup[y].charAt(x) != ' ')
	 * setAlive(x, y); }
	 */

	@Override
	public void nukeAll() {
		// TODO Auto-generated method stub
		for (int y = 0; y < matrix.length; y++) {
			for (int x = 0; x < matrix.length; x++) {
				this.matrix[x][y] = 0;
			}
		}

	}

	@Override
	public void setAlive(int x, int y) {
		// TODO Auto-generated method stub
		if (!checkAlive(x, y)) {
			matrix[x][y] = 1;
		}

	}

	@Override
	public void setDead(int x, int y) {
		// TODO Auto-generated method stub
		if (!checkAlive(x, y)) {
			matrix[x][y] = 0;
		}
	}

	@Override
	public boolean checkAlive(int x, int y) {
		if (x < 0 || x >= 5) {
			return false;
		}

		if (y < 0 || y >= 5) {
			return false;
		}

		if (matrix[x][y] != 0) {
			return true;
		}

		return false;
	}

	@Override
	public ILife nextGeneration() {
		// TODO Auto-generated method stub
		int[][] tempBoard = new int[5][5];
		for (int y = 0; y < matrix.length; y++) {
			for (int x = 0; x < matrix.length; x++) {
				if (checkAlive(x, y) == false && CellCount(x, y) == 3) {
					tempBoard[x][y] = 1;
				} else if (checkAlive(x, y) == true && CellCount(x, y) < 3
						|| CellCount(x, y) > 3) {
					tempBoard[x][y] = 0;
				} else if (checkAlive(x, y) == true && CellCount(x, y) == 2
						|| CellCount(x, y) == 3) {
					tempBoard[x][y] = 1;
				}
			}
		}
		return null;
	}

	public int CellCount(int x, int y) {
		int counter = 0;
		if (checkAlive(x - 1, y - 1))
			counter++;
		if (checkAlive(x, y - 1))
			counter++;
		if (checkAlive(x + 1, y - 1))
			counter++;
		if (checkAlive(x + 1, y))
			counter++;
		if (checkAlive(x - 1, y + 1))
			counter++;
		if (checkAlive(x, y - 1))
			counter++;
		if (checkAlive(x - 1, y + 1))
			counter++;
		if (checkAlive(x + 1, y + 1))
			counter++;
		return counter;
	}
}