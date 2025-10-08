import java.util.Scanner;
public class TwoDArrays {
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
        int arr[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        // print2DArray(arr);
        int arr2[][] = take2DArrayInput();
        print2DArray(arr2);

    }
}
