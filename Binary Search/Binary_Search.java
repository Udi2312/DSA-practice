public class Binary_Search {
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
        int arr[] = {5,6,7,8,9,10,11,1,2,3,4};
        System.out.println(targetindex(arr , 12));
    }
}
