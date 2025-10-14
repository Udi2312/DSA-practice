import java.util.Scanner;
public class TwoDArrays {
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
        int arr[][] = {{1,1,1} , {2,2,2} , {3,3,3}};
        // transposeofmatrix(arr,2,3);
        transposeInPlace(arr, 3,3);
    }
}
