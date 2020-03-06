/**
 * As in the AP instructions, you are responsible for completing
 * the Crossword constructor and the toBeLabeled method. 
 * Everything else is done for you. 
 * @author Evan Sayles, March 2020
 */
public class Crossword
{
  /** Each element is a Square object with a color (black or white) and a number.
   *  puzzle[r][c] represents the square in row r, column c.
   *  There is at least one row in the puzzle.
   */
  private Square[][] puzzle;

  /** Constructs a crossword puzzle grid.
   *  Precondition: There is at least one row in blackSquares.
   *  Postcondition: 
   *    - The crossword puzzle grid has the same dimensions as blackSquares.
   *    - The Square object at row r, column c in the crossword puzzle grid is black if and only 
   *      if blackSquares[r][c] is true.
   *    - The squares in the puzzle are labeled according to the crossword labeling rule. The number is
   *      positive if the square is labeled and 0 if the square is not labeled.
   */
  public Crossword(boolean[][] blackSquares)
  {
    /* to be implemented in part (b) */
  }


  /** Returns true if the square at row r, column c should be labeled with a positive number; 
            false otherwise. 
   *  The square at row r, column c is black if and only if blackSquares[r][c] is true.
   *  Precondition: r and c are valid indexes in blackSquares.
   */
  private boolean toBeLabeled (int r, int c, boolean[][] blackSquares)
  { 
    /* to be implemented in part (b) */
    return false;
  }
  
  /***************************** EXTRA FUNCTIONS *****************************/
     
  /** Prints the grid of Square objects separated by lines.
   */
  public void printGrid()
  {
    String rowOfDashes = "—";
    for(; rowOfDashes.length() < puzzle[0].length * 3; rowOfDashes += "———");
    
    for(int r = 0; r < puzzle.length; r++)
    {
      System.out.println(rowOfDashes);
      System.out.print("|");
      for(int c = 0; c < puzzle[0].length; c++)
        System.out.print(puzzle[r][c].getLabel() + "|");
      System.out.println();
    }
    System.out.println(rowOfDashes);
  }
}
