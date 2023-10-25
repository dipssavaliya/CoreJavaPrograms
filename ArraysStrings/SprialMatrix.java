package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix
{
  public static void main(String[] args) {
    int[][] matrix={{1,2,3,4},
                    {5,6,7,8},
                     {9,10,11,12},
                    };
    List<Integer> ans= sprialMatrixPrint(matrix);
    System.out.println(ans.toString());
  }

  private static List<Integer> sprialMatrixPrint(int[][] matrix) {
    int startRow=0;
    int endRow = matrix.length-1;
    int startCol=0;
    int endColumn=matrix[0].length-1;
    List<Integer> lst = new ArrayList<>();
    while(startCol<=endColumn && startRow<=endRow)
    {
      //top boundry
      for(int j=0;j<=endColumn;j++)
      {
        lst.add(matrix[startRow][j]);
      }
      //right
      for(int i=startRow+1;i<=endRow;i++)
      {
        lst.add(matrix[i][endColumn]);
      }
      //bottom
      for(int j=endColumn-1;j>=startCol;j--)
      { 
        if(startRow==endRow)break;
        lst.add(matrix[endRow][j]);
      }
      //left col
      for(int i=endRow-1;i>startRow+1;i--)
      {if(startCol==endColumn)break;
        lst.add(matrix[i][startCol]);
      }
      startCol++;
      startRow++;
      endColumn--;
      endRow--;
    }
    return lst;
  }

}