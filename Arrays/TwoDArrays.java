import java.util.Scanner;
public class TwoDArrays {
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
        print2DArray(mul);

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
        print2DArray(sum);
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
    static void print2DArray(int arr[][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
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
        // int arr[][] = {{1,1,1} , {2,2,2} , {3,3,3}};
        // int arr2[][] ={{4,4,4} , {5,5,5} , {6,6,6}};
        // multiply2matrices(arr, arr2);

        
    }
}
