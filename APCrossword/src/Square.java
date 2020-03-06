/**
 * Fully implemented version of the Square class. Nothing to change here.
 * @author Evan Sayles, MArch 2020
 */
public class Square
{
  private boolean isBlack;
  private int num;

  /**
   * Constructs one square of a crossword puzzle grid. 
   * Postcondition: 
   *    - The square is black if and only if isBlack is true. 
   *    - The square has number num. If num = 0 then the square is not labeled.
   */
  public Square(boolean isBlack, int num)
  {
    this.isBlack = isBlack;
    this.num = num;
  }
  
  /** 
   * @return true if the square is black, false if white
   */
  public boolean isBlack()
  {
    return isBlack;
  }
  
  /**
   * generate a two-character string representing the number of 
   * the square. If the square is not numbered, return empty spaces.
   * precondition: 0 <= num < 100
   * @return a two-character String representing the square's text
   */
  public String getLabel()
  {
    if(isBlack) return "■■";
    if (num == 0) return "  ";
    if (num < 10) return num + " ";
    return num + "";
  }
}
