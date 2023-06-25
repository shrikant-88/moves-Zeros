import java.util.Scanner;

public class moves_Zeros {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter size of array : ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      for(int j = 0 ; j<n-1 ; j++ ){
      for(int i = 0 ; i<n-1-j ; i++){
        if(arr[i] == 0){
            int tamp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tamp;
        }
      }
    }
      for(int ele:arr){
        System.out.print(ele);
      }
    }
    
}
