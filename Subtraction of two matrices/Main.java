import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r= in.nextInt();
    int c = in.nextInt();
    int mat_1[][]=new int[r][c];
    int mat_2[][]=new int [r][c];
    int sub[][]=new int[r][c]; 
    for(int i =0;i<mat_1.length;i++)
    {
      for(int j=0;j<mat_1.length;j++)
      {
        mat_1[i][j]=in.nextInt();
      }
    }
     for(int i =0;i<mat_1.length;i++)
    {
      for(int j=0;j<mat_1.length;j++)
      {
        mat_2[i][j]=in.nextInt();
      }
    }
    for(int i =0;i<mat_1.length;i++)
    {
      for(int j=0;j<mat_1.length;j++)
      {
        sub[i][j]=mat_1[i][j]-mat_2[i][j];
      }
    }
    for(int i =0;i<mat_1.length;i++)
    {
      for(int j=0;j<mat_1.length;j++)
      {
        System.out.print(sub[i][j]+" ");
      }
      System.out.println();
    }
    }
}