import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix_1 = new int[r][c];
      int[][] matrix_2 = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix_1[i][j] = sc.nextInt();
            }
        }
       for(int h = 0; h < r; h++)
        {
            for(int y = 0; y < c; y++)
            {
                matrix_2[h][y] = sc.nextInt();
            }
        }
      int is_flag=0;
      for(int l=0;l<r;l++)
      {
        for(int m=0;m<c;m++)
        {
          if(matrix_1[l][m]!=matrix_2[l][m])
          {
          is_flag=1;
          }
           }
      }
      if(is_flag==0)
      {
        System.out.println("Yes");
       }
      else
      {
        System.out.println("No");
      }
    }
}

      