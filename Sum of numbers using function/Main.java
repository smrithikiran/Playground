import java.util.Scanner;
class Main{
  public static int sum_number(int a){
    int sum=0;
    for(int i=1;i<=a;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
    
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      int result = sum_number(n);
	    System.out.print(result);
    
	}
}