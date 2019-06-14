import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in = new Scanner(System.in);
      int arr_count = in.nextInt();
      int arr[] = new int[arr_count];
     
      for(int ind = 0;ind< arr_count;ind++)
      {
        arr[ind] = in.nextInt();
        
    }
      int max = arr[0];
      for(int  ind = 1;ind< arr_count; ind++){
        if(arr[ind] > max){
          max = arr[ind];
        }
      }
      System.out.println(max);
    }
}