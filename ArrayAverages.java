import java.util.Arrays;

public class ArrayAverages
{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray)
  {
    ray = rayray;
  }

  public void rowAverages()
  {
    int sum;
    System.out.println("The average of each row is: ");

    for(int[] row : ray)
    {
      sum = 0;

      for(int c : row)
        sum += c;

      System.out.print(sum/ray[0].length + " ");
    }
    System.out.println("\n");
  }


  //colum major order
  //  take each col move thorugh all the rows
  //  top down and left to right
  //  condition for colum loop has to change to a zero
  public void columnAverages()
  {
    int sum;
    System.out.println("The average of each collunm is: ");

    for(int c = 0; c < ray[0].length; c++)
    {
      sum = 0;

      for(int r = 0; r < ray.length; r++)
        sum += ray[r][c];

      System.out.print( sum/ray.length + " ");
    }
  }

  public void arrayAverage()
  {
    int sum = 0;

    for(int[] row : ray)
      for(int c : row)
        sum += c;

    System.out.println("\n\nThe average of the entire array of values is " + sum/(ray.length * ray[0].length) + ".\n");
  }

  public String toString()
  {
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
