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
    double rowAvg = 0.0;
    System.out.println("The average of each row is: ");

    for(int[] row : ray)
    {
      sum = 0;

      for(int c : row)
        sum += c;

      rowAvg = sum/ray[0].length;
      System.out.print(rowAvg + " ");
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
    double colAvg = 0.0;
    System.out.println("The average of each collunm is: ");

    for(int c = 0; c < ray[0].length; c++)
    {
      sum = 0;

      for(int r = 0; r < ray.length; r++)
        sum += ray[r][c];

      colAvg = sum/ray.length;
      System.out.print(colAvg + " ");
    }
  }

  public void arrayAverage()
  {
    int sum = 0;
    double avg = 0.0;

    for(int[] row : ray)
      for(int c : row)
        sum += c;

    //    total / (    rows   *      cols    )
    avg = sum   / (ray.length * ray[0].length);

    System.out.println("\n\nThe average of the entire array of values is " + avg + ".\n");
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
