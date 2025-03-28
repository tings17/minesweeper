## Installation/Set Up
```
git clone "https://github.com/tings17/minesweeper.git"
```

## Example Usage
To generate a new game of Minesweeper with a 5x5 grid size and 10 mines:
``` java
GameBoard board = new GameBoard(5, 5, 10);

// First cell clicked at position (2,3) and subsequently place the mines
List<Position> minePositions = board.placeMines(2, 3);
```
The positions of the mines are returned upon the `placeMines` method call as a list of `Position`s.
