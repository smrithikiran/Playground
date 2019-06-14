import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = sc.nextInt();
        }
        int left = 0;
        int right = arr_size - 1;
        boolean is_palindrome = true;
      while (left<right)
      {
        if(arr[left]!=arr[right])
        {
          is_palindrome = false;
        }
      left++;
        right--;
      }
      if(is_palindrome==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}