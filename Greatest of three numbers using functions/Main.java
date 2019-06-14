import java.util.Scanner;
class Main{
  public static int sum(int m,int n,int p){
    int max ,temp = 0;
    if(m<n) {
      temp = n;
    }
    else{
      temp = m;
    }
    if (temp<p) {
      temp = p;
    }
    else
    {
      temp = temp;
    }
    return temp;
  }


  
	public static void main (String[] args){
      
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int i = in.nextInt();
      int j = in.nextInt();
      int k = in.nextInt();
     int result = sum(i,j,k);
      System.out.print(result);
      
	}
}