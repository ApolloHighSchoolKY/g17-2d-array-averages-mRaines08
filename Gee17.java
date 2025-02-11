public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    //populate the array with sequential numbers
    int n = 1;
    for(int r = 0; r < ray.length; r++)
      for(int c = 0; c < ray[r].length; c++, n++)
        ray[r][c] = n;

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
