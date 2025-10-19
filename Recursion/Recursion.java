import java.util.Scanner;
public class Recursion {
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
    }
}
