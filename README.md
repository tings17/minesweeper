CLASSES

Game
- instantiate the board (later if needed, maybe a contoller panel with information about the game state)
- handles top level logic of the game
- handles game ending
Board
- models the minesweeper board (can think of it as a wrapper class for the board)
- handles most of the game logic (checks for valid moves, mine checking, placing and more)
Cell
- allow individual cell reveal
- flag placement

when the board is generated as a 2d array of Cells, all the cells are covered and empty. once the first cell is clicked, that first cell is revealed (revealed: boolean) and is guaranteed to be empty. and after the first click, the mines are placed and also the neighboring empty fileds are revealed (recursive reveal of each cell/queue-based flood fill). We want to return the positions of the mines (array of a new position class?).

RELIABILITY
- edge cases.. (grid size restriction, mine count restriction)
- mine distribution?