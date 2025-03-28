public class BoardCell {
    private int row;
    private int col;
    private boolean isRevealed;
    private boolean isMine;
    // private int adjacentMineCount;

    public BoardCell(int row, int col) {
        this.row = row;
        this.col = col;
        this.isRevealed = false;
    }

    public void revealCell() {
        this.isRevealed = true;
    }

    public void placeMine() {
        this.isMine = true;
    }

    public boolean containsMine() {
        return this.isMine;
    }
}