import java.util.Scanner;
public class Arrays {

    static boolean checkSortedArray(int arr[]){
        boolean flag = true;
        for(int i =0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int lastOccurrence(int[] arr, int x){
        int ans = -1;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        return ans;
    }

    static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

  static int[] takeArrayInput(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = s.nextInt();

    System.out.println("Enter " + n +" elements: ");
    int[] arr = new int[n];
    for(int i =0; i<n; i++){
         arr[i] = s.nextInt();
    }
    return arr;
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Count the number of occurances of a particular element x
    //     int arr [] = {5,6,5,1,5,6};
    //     int x = s.nextInt();
    //     int count = 0;
    //     for(int i =0; i<arr.length; i++){
    //         if(arr[i] == x){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);


    // Find the last occurance of an element x in a given array
//     int arr[] = takeArrayInput();
//     System.out.println("Enter the number whose last occurance is to be found: ");
//     int x = s.nextInt();
//    int ans =  lastOccurrence(arr, x);
//    System.out.print("last occurance of x is at index: "+ " "+ ans);


    // Check if the given array is sorted or not
    // int arr[] = takeArrayInput();
    // System.out.println(checkSortedArray(arr));

    }
}
