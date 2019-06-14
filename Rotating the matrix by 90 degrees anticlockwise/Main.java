import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
      for(int l=r-1;l>=0;l--)
      {
        for(int m=0;m<c;m++)
        {
          System.out.print(matrix[m][l]+" ");
          
        }
        System.out.println();
      }
    }
}