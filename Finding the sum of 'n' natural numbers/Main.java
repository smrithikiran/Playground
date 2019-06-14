import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int val = sum(num);
    System.out.print(val);
  }
    public static int sum(int num)
    {
      if(num == 0)
        return 0;
      else
        return num = num+sum(num-1);
    }
  }