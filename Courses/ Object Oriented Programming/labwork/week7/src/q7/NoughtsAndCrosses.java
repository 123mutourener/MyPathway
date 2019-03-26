package q7;

public class NoughtsAndCrosses {
    private int[][] gameBoard;

    public NoughtsAndCrosses(int[][] board) {
        this.gameBoard = board;
    }

    public boolean isDraw() {
        int won = this.whoWon();
        if (won == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int whoWon() {
        int row = this.gameBoard.length;
        int column = this.gameBoard[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 2; j++) {
                if (this.gameBoard[i][j] == this.gameBoard[i][j + 1]
                        && this.gameBoard[i][j + 1] == this.gameBoard[i][j + 2]) {
                    if (this.gameBoard[i][j] != 0) {
                        return this.gameBoard[i][j];
                    }
                }
            }
        }

        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row - 2; i++) {
                if (this.gameBoard[i][j] == this.gameBoard[i + 1][j]
                        && this.gameBoard[i + 1][j] == this.gameBoard[i + 2][j]) {
                    if (this.gameBoard[i][j] != 0) {
                        return this.gameBoard[i][j];
                    }
                }
            }
        }

        if (row == column) {
            for (int i = 0; i < row - 2; i++) {
                if (this.gameBoard[i][i] == this.gameBoard[i + 1][i + 1]
                        && this.gameBoard[i + 1][i + 1] == this.gameBoard[i + 2][i + 2]) {
                    if (this.gameBoard[i][i] != 0) {
                        return this.gameBoard[i][i];
                    }
                }
            }

            for (int i = row - 1; i >= 2; i--) {
                if (this.gameBoard[row - 1 - i][i] == this.gameBoard[row - i][i - 1]
                        && this.gameBoard[row - i][i - 1] == this.gameBoard[row - i + 1][i - 2]) {
                    if (this.gameBoard[row - 1 - i][i] != 0) {
                        return this.gameBoard[row - 1 - i][i];
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        final int NONE = 0;
        final int NOUGHTS = 1;
        final int CROSS = 2;

        int[][] board = { { NONE, NONE, NOUGHTS }, { NONE, NOUGHTS, NONE }, { NOUGHTS, NONE, NONE }, };

        NoughtsAndCrosses nc = new NoughtsAndCrosses(board);

        System.out.println(nc.isDraw());
        System.out.println(nc.whoWon());
    }
}