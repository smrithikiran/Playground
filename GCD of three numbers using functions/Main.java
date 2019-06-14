import java.util.Scanner;
public class Main{
   public static int gcd(int m,int n,int p){
    int min ,temp = 0;
    if(m<n) {
      min = n;
    }
    else{
      min = m;
    }
    if (min<p) {
      min = p;
    }
    else
    {
      min= min;
    }
     while(min!=0){
       if ((n%min==0)&&(m % min==0)&&(p%min==0))
       {
         temp=min;
         break;
       }
       min--;
     }
     return temp;
  }
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in =new Scanner(System.in);
      int i = in.nextInt();
      int j = in.nextInt();
      int k = in.nextInt();
     int result = gcd(i,j,k);
      System.out.print(result);
	}
}