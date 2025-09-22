import java.util.Scanner;
public class Arrays {
    static int[] makePrefixSumArray(int arr[]){
        
        return arr;
    }
    static int [] returnSquaresOfElements(int arr[]){
        int ans[] = new int[arr.length];
        int i = 0 , j = arr.length - 1 , k= 0;

        while(i<=j){
            if(arr[i]*arr[i] >= arr[j]*arr[j]){
                ans[k] = arr[i]*arr[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr[j]*arr[j];
                j--;
                k++;
            }
        }
        reverseAnArray(ans);
        return ans;
    }
    static int [] returnFrequencyArray(int arr[]){
        int ans [] = new int[100000];
        for(int i = 0; i<arr.length; i++){
            ans[arr[i]]++;
        }
        return ans;
    }
    static void reverseAnArrayWithIndices(int arr[] , int i, int j){
      while(i<j){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    
    static void rotateAnArrayInPlace(int arr[] , int k){
        k = k % arr.length;
        reverseAnArrayWithIndices(arr, 0, arr.length-k-1);
        reverseAnArrayWithIndices(arr, arr.length-k, arr.length-1);
        reverseAnArrayWithIndices(arr, 0, arr.length-1);
    }

    static int[] rotateAnArray(int arr[], int k){
        k = k % arr.length;
        int ans[] = new int[arr.length];
        int x = 0;

        for(int i = arr.length-k; i<arr.length; i++){
            ans[x] = arr[i];
            x++;
        }
        for(int i = 0; i<arr.length-k; i++){
            ans[x] = arr[i];
            x++;
        }

        return ans;
    }

    static void reverseAnArray(int arr[]){
        int x = arr.length/2;
        for(int i = 0; i<x; i++){
          swap(arr, i, arr.length-i-1);
        }
      
        
    }

    static void swap(int arr[] , int i ,int j){
         int c = 0;
         c = arr[i];
         arr[i] = arr[j];
         arr[j] = c;
    }
    static void swapTwoNumbers(int a , int b){
        int c = 0;
        //  System.out.println("Before swapping: a= " + a + " b= "+ b);
         c=a;
         a=b;
         b=c;
        //  System.out.println("After swapping: a= " + a + " b= "+ b);
    }

    static int findUniqueElement(int arr[]){
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i]= -1;
                    arr[j] = -1;
                }
                else{
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    static int tripleSum(int arr[], int x){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int pairSum(int arr[], int x){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] == x-arr[i]){
                    ans++;
                }
            }
        }
        return ans;
    }

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


    // Find the total number of pairs in array whose total sum is equal to the given value x
//     int arr[] = takeArrayInput();
//     System.out.println("Enter the value of x:");
//     int x = s.nextInt();
//   int ans =  targetSum(arr, x);
//   System.out.println(ans);



    // Find the total number of triplets in array whose total sum is equal to the given value x
//     int arr[] = takeArrayInput();
//     System.out.println("Enter the value of x:");
//     int x = s.nextInt();
//   int ans =  tripleSum(arr, x);
//   System.out.println(ans);

    // Find the unique number in an array where all numbers are repeated twice expect for the unique number
    //   int arr[] = takeArrayInput();
    //   int ans = findUniqueElement(arr);
    //   System.out.println("unique element is: " + ans);

    
    // Swap two numbers using temperory variable
    // int a = 7;
    // int b = 17;
    // swapTwoNumbers(a, b);


    // Reverse an array
    // int arr[] = {1,2,3,4,5,6,7};
    // reverseAnArray(arr);
    //   printArray(arr);


    // Rotate an array by k steps, k might be greater than n
//     int arr[] = {1,2,3,4,5};
//   int ans[] =rotateAnArray(arr, 102);
//         printArray(ans);


    // Rotate an array by k steps in place
    //  int arr[] = {1,2,3,4,5};
    //  rotateAnArrayInPlace(arr, 3);
    //  printArray(arr);


    // given Q queries, check if the given numbers are persent in array or not. Max element is 10^5
    // int arr[] = {1,12,4,5,67,88,44,3,50,5};
    //  int frearr[] = returnFrequencyArray(arr);
    //  System.out.println("Enter number of queries: ");
    //  int q = s.nextInt();
    //  System.out.println("Enter the numbers to be checked: ");
    //  for(int i = 0; i<q; i++){
    //     int x = s.nextInt();
    //     if(frearr[x] != 0){
    //         System.out.println("yes");
    //     }
    //     else{
    //         System.out.println("No");
    //     }
    //  }


    // Sort an array consisting of only 0s and 1s
    // int arr[] = {1,0,0,1,1,0,1,0,1,1,0};
    // int i = 0 , j= arr.length-1;
    // while(i<j){
    //    if(arr[i] == 1 && arr[j] == 0){
    //     swap(arr, i, j);
    //     i++;
    //     j--;
    //    }
    //    if(arr[i] == 0){
    //     i++;
    //    }
    //    if(arr[j] == 1){
    //     j--;
    //    }
    // }

    // printArray(arr);


    // Given an array in increasing order return an array with squares of each number in increasing order
    // int arr[] = {-10,-6,-5,-3,-2,-1};
    // int ans [] = returnSquaresOfElements(arr);
    // printArray(ans);


    // Return the prefix sum array of a given array in place
    int arr[] = {1,4,2,5,7,66,3};
    printArray(makePrefixSumArray(arr));
    }
}
