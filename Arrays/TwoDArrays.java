import java.util.Scanner;
public class TwoDArrays {
    static void makePrefixSumArray(int arr[]){
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    static int findsumprefixsummethod(int [][] a, int l1, int r1, int l2, int r2){
        for(int i = 0; i<a.length; i++){
            makePrefixSumArray(a[i]);
        }
        int ans = 0;
        for(int i = l1; i<=l2; i++){
            ans += a[i][r2];
        }
        for(int i = l1; i<=l2; i++){
            if(r1 > 0){
                ans -= a[i][r1-1];
            }
        }
        return ans;
    }
    static int findsum(int [][] a, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i<=l2; i++){
            for(int j = r1; j<=r2; j++){
                sum = sum + a[i][j];
            }
        }
        return sum;
    }
    static void fillmatrix(int n){
        int a[][] = new int[n][n];
        int curr = 1;
         int toprow= 0, bottomrow = n-1, rightcol=n-1, leftcol = 0;
        int totalelements = 0;
        while (totalelements < n*n) { 
            for(int j = leftcol; j<=rightcol && totalelements < n*n; j++){
                a[toprow][j] = curr++;
                totalelements++;
            }
            toprow++;
            for(int i = toprow; i<=bottomrow && totalelements < n*n; i++){
                a[i][rightcol] = curr++;
                totalelements++;
            }
            rightcol--;
            for(int j = rightcol; j>=leftcol && totalelements < n*n; j--){
                a[bottomrow][j] = curr++;
                totalelements++;
            }
            bottomrow--;
            for(int i = bottomrow; i>=toprow && totalelements < n*n; i--){
                a[i][leftcol] = curr++;
                totalelements++;
            }
            leftcol++;
        }
        printMatrix(a);
    }
    static void printspiralorder(int[][] a, int r, int c){
        int toprow= 0, bottomrow = r-1, rightcol=c-1, leftcol = 0;
        int totalelements = 0;
        while (totalelements < r*c) { 
            for(int j = leftcol; j<=rightcol && totalelements < r*c; j++){
                System.out.print(a[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            for(int i = toprow; i<=bottomrow && totalelements < r*c; i++){
                System.out.print(a[i][rightcol] + " ");
                totalelements++;
            }
            rightcol--;
            for(int j = rightcol; j>=leftcol && totalelements < r*c; j--){
                System.out.print(a[bottomrow][j] + " ");
                totalelements++;
            }
            bottomrow--;
            for(int i = bottomrow; i>=toprow && totalelements < r*c; i--){
                System.out.print(a[i][leftcol] + " ");
                totalelements++;
            }
            leftcol++;
        }
    }
    static void printMatrix(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascaltriangle(int n){
        int ans[][] = new int[n][];
        for(int i =0; i<ans.length; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for(int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void reverse(int[] a){
        int i = 0;
        int j = a.length-1;
        while(i<j){
            int c = 0;
            c = a[i];
            a[i] = a[j];
            a[j] = c;
            i++;
            j--;
        }
    }
    static void rotate2Darrray(int[][] a, int n){
        System.out.println("Initial Array: ");
        print2DArray(a, n, n);
        transposeInPlace(a, n, n);
        for(int i = 0; i<a.length; i++){
            reverse(a[i]);
            }
            System.out.println("Rotated Array: ");
            print2DArray(a, n, n);
        }
    static void transposeInPlace(int a[][] , int r, int c){
        if(r!=c){
            System.out.println("Wrong Input");
            return;
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j<c; j++){
                if(i<j){
              int c1 = 0;
              c1 = a[i][j];
              a[i][j] = a[j][i];
              a[j][i] = c1;
                }
            }
        }
        System.out.println("Transposed Array: ");
        print2DArray(a, r, c);
    }
    static void swapin2Darray(int a[][] , int i1, int j1, int i2, int j2){
          int c = 0;
          c = a[i1][j1];
          a[i1][j1] = a[i2][j2];
          a[i2][j2] = c;
        }
        static void transposeofmatrix(int[][] a, int r , int c ){
            System.out.println("Input Array");
            print2DArray(a,r,c);
            // int r = a.length;
            // int c = a[0].length;
            int[][] ans = new int[c][r];
            for(int i = 0; i<c; i++){
                for(int j = 0; j<r; j++){
                    ans[i][j] = a[j][i];
                }
            }
            System.out.println("Transpose Array");
            print2DArray(ans, c, r);
    }
    static void multiply2matrices(int[][] a, int[][] b){
        if(a[0].length != b.length){
            System.out.println("Wrong input: ");
            return;
        }
        int[][] mul = new int[a.length][b[0].length];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b[0].length; j++){
                for(int k = 0; k<b.length; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print2DArray(mul,a.length,b[0].length);

    }
    static void add2matrices(int a[][] , int b[][]){
        if(a.length != b.length || a[0].length != b[0].length){
            System.out.println("Wrong Input");
            return;
        }
        int[][] sum = new int[a.length][a[0].length];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        print2DArray(sum,a.length,a[0].length);
    }
    static int[][] take2DArrayInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many rows: ");
        int r = s.nextInt();
        System.out.println("How many columns: ");
        int c = s.nextInt();
        System.out.println("Enter Numbers: ");
        int arr[][] = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = s.nextInt();
            }
            System.out.println("Next Row");
        }
        return arr;
    }
    static void print2DArray(int arr[][] , int r, int c){
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // print2DArray(arr);
        // add2matrices(arr, arr2);
        // print2DArray(arr2);
        
        // Multiply 2 matrices
        // int arr2[][] ={{4,4,4} , {5,5,5} , {6,6,6}};
        // multiply2matrices(arr, arr2);
        
        
        // Transpose of a matrix
        // transposeofmatrix(arr,2,3);
        // transposeInPlace(arr, 3,3);
        
        
        // Rotate a square matrix 90 degrees in place
        // rotate2Darrray(arr, arr.length);
        
        
        // Print the nth row of pascal's triangle
        // int ans[][] =  pascaltriangle(7);
        // printMatrix(ans);
        
        
        // Print numbers of matrix in spiral order
        // int arr[][] = {{1,1,1} , {2,2,2} , {3,3,3} , {4,4,4}};
        // System.out.println("Initial matrix");
        // // print2DArray(arr, 4,4);
        // printMatrix(arr);
        // System.out.println();
        // printspiralorder(arr,4,3);


        // Generate a n*n matrix and fill it from 1 to n^2
        // fillmatrix(3);


        // Find sum of submatrix within a matrix with given coordinates
        //     int arr[][] = take2DArrayInput();
        //    int ans =  findsum(arr, 0,0,2,2);
        //    System.out.println("The sum of submatrix is: " + ans);
        
        
        
        // Find sum of submatrix within a matrix with given coordinates( Method - 2)
           int arr[][] = take2DArrayInput();
           int ans =  findsumprefixsummethod(arr, 3,1,5,4);
           System.out.println("The sum of submatrix is: " + ans);
    

}
}