/**
 * Creates a new crossword grid and prints it, assuming your code in 
 * the Crossword class works right!
 * @author Evan Sayles, March 2020
 *
 */
public class Main
{

  public static void main(String[] args)
  {
    int numRows = (int) (Math.random() * 10 + 5);
    int numCols = (int) (Math.random() * 10 + 5);
    boolean [][] grid = genNewBlackSquares(numRows, numCols);
    Crossword game = new Crossword(grid);
    game.printGrid();

  }
  
  /**
   * generates a boolean grid of white and black squares
   * TODO: Better spacing rules for more realistic crossword layouts
   * @param rows the number of rows in the grid
   * @param cols the number of columns in the grid
   * @return a grid of booleans representing whether or not a square is black
   */
  public static boolean[][] genNewBlackSquares(int rows, int cols)
  {
    boolean[][] squares = new boolean[rows][cols];
    
    for(int r = 0; r < rows; r++)
    {
      for(int c = 0; c < cols; c++)
      {
        if(Math.random() < 0.125) // less than 1/8 of squares are black
          squares[r][c]=true;
      }
    }
    return squares;
  }


}
