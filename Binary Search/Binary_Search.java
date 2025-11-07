public class Binary_Search {
    static int peakelement(int arr[]){
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if((mid == 0 || arr[mid-1] < arr[mid]) && (mid == arr.length-1 || arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                st = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int mountainarraypeak(int arr[]){
        int st = 0, end = arr.length-1;
        int ans = 0;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] < arr[mid+1]){
                st = mid+1;
                ans = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    static boolean search2Dmatrix2(int arr[][] , int target){
        int r = arr.length;
        int c = arr[1].length;
        int i = 0, j = c-1;
        while(i<r && j>=0){
            if(arr[i][j] == target){
                return true;
            }
            else if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    static boolean search2Dmatrix(int arr[][] , int target){
        int r = arr.length;
        int c = arr[1].length;
        int st = 0, end = r*c-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            int mr = mid/c;
            int mc = mid%c;
            if(arr[mr][mc] == target){
                return true;
            }
            else if(arr[mr][mc] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    static int targetindexrepeatedelements(int arr[] , int target){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end -st)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[st] == arr[end] && arr[mid] == arr[end]){
                st++;
                end--;
            }
            else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    st = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    static int targetindex(int arr[] , int target){
        int var = 0;
        if(target < arr[arr.length-1]){
            var = -1;
        }
        if(target > arr[arr.length-1]){
            var = 1;
        }

        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end -st)/2;
            if(arr[st] == target) return st;
            if(arr[end] == target) return end;
            if(arr[mid] == target){
                return mid;
            }
            if(var == -1){
                st = mid + 1;
            }
            if(var == 1){
                end = mid - 1;
            }
        }
        return -1;
    }

    static int leastelementinrotatedarray(int arr[]){
        int st = 0, end = arr.length-1;
        int ans = -1;
        while( st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] > arr[arr.length-1]){
                st = mid + 1;
            }
            else{
                ans = mid;
                end = mid -1;
            }
        }
        return ans;
    }

    static double squarerootwithprecision(int x, int precision){
        if(x< 0){
            System.out.println("Invalid Input.");
            return -1;
        }
        double ans = 0.0;
        int st = 0, end = x;
        while(st <= end){
            int mid = st + (end - st)/2;
            int value = mid * mid;
            if(value == x){
                return mid;
            }
            else if(value > x){
                end = mid -1;
            }
            else{
                st = mid + 1;
                ans = mid;
            }
        }
         double inc = 0.1;
        for(int i = 0; i<precision; i++){
            while(ans * ans <= x){
                ans = ans + inc;
            }
            ans = ans - inc;
            inc = inc/10;
        }
        return ans;
    }
    static int squareroot(int x){
        if(x< 0){
            System.out.println("Invalid Input.");
            return -1;
        }
        int ans = 0;
        int st = 0, end = x;
        while(st <= end){
            int mid = st + (end - st)/2;
            int value = mid * mid;
            if(value == x){
                return mid;
            }
            else if(value > x){
                end = mid -1;
            }
            else{
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    static int firstoccurance(int arr[] , int target){
        int fo = -1;
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                fo = mid;
                end = mid -1;
                // st = mid + 1;
            }
           else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                st = mid + 1;
            }
        }
        return fo;
     }
    public static void main(String[] args) {
        // Find the first occurance of given element in an sorted array
        // int arr[] = {2,2,5,5,5,6,6,8,9,9,9};
        // System.out.println(firstoccurance(arr,5));


        // Find the square root of given non negitive value of x to nearest floor integer
        // System.out.println(squareroot(79));


        // Calculate square root with precision
        // System.out.println(squarerootwithprecision(11,5));


        // Find the index of minimum element in rotated sorted array
        // int arr[] = {5,6,7,8,9,10,11,1,2,3,4};
        // System.out.println(leastelementinrotatedarray(arr));


        // return the index of target element in the rotated sorted array
        // int arr[] = {5,6,7,8,9,10,11,1,2,3,4};
        // System.out.println(targetindex(arr , 12));


        // return the index of target element in the rotated sorted array where elements can be repeated
        // int arr[] = {1,1,1,2,3,3,1,1,1};
        // System.out.println(targetindexrepeatedelements(arr,2));


        // You are given an m x n integer matrix matrix with the following two properties:
        // Each row is sorted in non-decreasing order.
        // The first integer of each row is greater than the last integer of the previous row.
        // Given an integer target, return true if target is in matrix or false otherwise.

        // int arr[][] = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}};
        // System.out.println(search2Dmatrix(arr,60));


        //Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
        // Integers in each row are sorted in ascending from left to right.
        // Integers in each column are sorted in ascending from top to bottom.

        // int arr[][] = {{1,4,7,11,15} , {2,5,8,12,20} , {3,6,9,16,22}};
        // System.out.println(search2Dmatrix2(arr,19));


        // Given a mountain array, find it's peak
        // int arr[] = {2,4,6,8,7,5,3,1};
        // System.out.println(mountainarraypeak(arr));


//         A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array

        // int arr[] = {1,2,3,1};
        // System.out.println(peakelement(arr));


        //
    }
}
