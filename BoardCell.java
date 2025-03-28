public class BoardCell {
    private int row;
    private int col;
    private boolean isRevealed;
    private boolean isMine;

    public BoardCell(int row, int col, boolean isRevealed) {
        this.row = row;
        this.col = col;
        this.isRevealed = isRevealed;
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