import java.util.Scanner;
class Main{
  public static int power_num(int base,int exponent){
    int power = 1;
    while(exponent>=1){
      power = power* base;
      exponent--;
    }
          return power;
  }
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int i = in.nextInt();
      int j = in.nextInt();
      int result=power_num(i,j);
      System.out.println(result);
    }
          }
          
          