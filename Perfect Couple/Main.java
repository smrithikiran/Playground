import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int ind = 0;ind<=arr_size-1;ind++)
      {
        arr[ind] = in.nextInt();
      }
      int value = in.nextInt();
      perfect_couple(arr_size,arr,value);
    }
  public static void perfect_couple(int arr_size,int arr[],int value)
    
  {
    for(int ind_1 = 0;ind_1<=arr_size-1;ind_1++)
    {
      for(int ind_2 = ind_1+1;ind_2<=arr_size-1;ind_2++)
      {
        int sum = arr[ind_1]+arr[ind_2];
        if(sum == value)
    {
      System.out.println(arr[ind_1]+", "+arr[ind_2]);
    }
      }
    }
        
}
}