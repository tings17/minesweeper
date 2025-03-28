import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoard {
    private BoardCell[][] board;
    private int gridWidth;
    private int gridHeight;
    private int mineCount;
    private boolean minesPlaced;

    public GameBoard(int width, int height, int mines) {
        this.board = new BoardCell[height][width];
        this.gridWidth = width;
        this.gridHeight = height;
        this.mineCount = mines;
        this.minesPlaced = false;

        this.setUpBoard();
    }

    public void setUpBoard() {
        for (int row = 0; row < this.gridHeight; row++) {
            for (int col = 0; col < this.gridWidth; col++) {
                this.board[row][col] = new BoardCell(row, col, false);
            }
        }
    }

    public void clickCell(int row, int col) {
        this.board[row][col].revealCell();
        if (!minesPlaced) {
            // if no mines are placed yet, it means this cell is the first clicked cell
            // so we must place the mines after revealing this cell
            this.placeMines(row, col);
        }
    }
    
    public List<Position> placeMines(int firstRow, int firstCol) {
        List<Position> availableMinePositions = new ArrayList<>();
        List<Position> minePlacements = new ArrayList<>();

        for (int row = 0; row < this.gridHeight; row++) {
            for (int col = 0; col < this.gridWidth; col++) {
                if (!(row == firstRow && col == firstCol)) {
                    availableMinePositions.add(new Position(row, col));
                }
            }
        }

        Random rand = new Random();
        for (int i = 0; i < this.mineCount; i++) {
            Position randomPosition = availableMinePositions.get(rand.nextInt(availableMinePositions.size()));
            this.board[randomPosition.getRow()][randomPosition.getCol()].placeMine();
            minePlacements.add(randomPosition);
            availableMinePositions.remove(randomPosition);
        }
        this.minesPlaced = true;

        return minePlacements;
    }
}