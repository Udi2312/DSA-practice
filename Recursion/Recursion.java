import java.util.Scanner;
public class Recursion {
    static int euclidalgo(int x , int y){
        if(y == 0){
            return x;
        }
        return euclidalgo(y , x%y);
    }
    static int FindGCD(int x , int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    static int alternativesum(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return alternativesum(n-1) - n;
        }
        else{
            return alternativesum(n-1) + n;
        }
    }
    static void printmultiples(int nums, int k){
        if(k==1){
            System.out.print(nums + " ");
            return;
        }
        printmultiples(nums, k-1);
        System.out.print(nums * k + " ");
    }
    static int power2(int p, int q){
        if(q==0){
            return 1;
        }
        int smallpow = power2(p, q/2);
        if(q%2==0){
            return smallpow * smallpow;
        }
        else{
            return p*smallpow*smallpow;
        }
    }
    static int power(int p , int q){
        int ans = 1;
        if(q==1){
            ans *= p;
            return ans;
        }
        ans = power(p, q-1)*p;
        return ans;
    }
    static int sumofdigits(int n){
        int count = 0;
        if(n>=0 && n<=9){
            count += n;
            return count;
        }
        count = sumofdigits(n/10) + n%10;
        return count;
    }

    static int fibonaccinumber(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int ans = fibonaccinumber(n-1) + fibonaccinumber(n-2);
        return ans;
    }
    static int factorialofanumber(int n){
        if(n==0){
            return 1;
        }
        return n* factorialofanumber(n-1);
    }
    static void printnumbersreverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printnumbersreverse(n-1);
    }
    static void printnumbers(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printnumbers(n-1);
        System.out.print(" ");
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Print all natural numbers from 1 to n
        // System.out.println("Enter the value of n: ");
        // int n = s.nextInt();
        // printnumbers(n);
        
        
        // Print all natural numbers from n to 1
        // System.out.println("Enter the value of n: ");
        // int n = s.nextInt();
        // printnumbersreverse(n);


        // factorial of an number
    //     System.out.println("Enter the value of n: ");
    //     int n = s.nextInt();
    //    int ans =  factorialofanumber(n);
    //     System.out.println(ans);


        // Print nth fibonacci number and series
        // System.out.println("Enter the value of n: ");
        // int n = s.nextInt();
        // for(int i = 1; i<=n; i++){
        //     System.out.println(fibonaccinumber(i));
        // }


        // Find the sum of digits of a number using recursion
    //     System.out.println("Enter the value of n: ");
    //     int n = s.nextInt();
    //    System.out.println(sumofdigits(n));


       // Find p^q using recursion
    //    System.out.println("Enter p:");
    //    int p = s.nextInt();
    //    System.out.println("Enter q");
    //    int q = s.nextInt();
    //    System.out.println(power(p,q));


    // Find p^q using recursion method 2
    // System.out.println("Enter p:");
    //    int p = s.nextInt();
    //    System.out.println("Enter q");
    //    int q = s.nextInt();
    //    System.out.println(power2(p,q));


    // Given nums and k, print first k multiples of nums
    // System.out.println("Enter nums:");
    //    int nums = s.nextInt();
    //    System.out.println("Enter k");
    //    int k = s.nextInt();
    //   printmultiples(nums,k);


    // Given a number n, find the sum of natural numbers till n but with alternative signs
    // System.out.println("Enter n: ");
    // int n = s.nextInt();
    // System.out.println(alternativesum(n));


    // Find GCD of x and y using long division
    // System.out.println("Enter x: ");
    // int x = s.nextInt();
    // System.out.println("Enter y: ");
    // int y = s.nextInt();
    // System.out.println(FindGCD(x,y));


    // Find GCD using euclid's algorithm
    System.out.println("Enter x: ");
    int x = s.nextInt();
    System.out.println("Enter y: ");
    int y = s.nextInt();
    System.out.println(euclidalgo(x,y));
    }
}
