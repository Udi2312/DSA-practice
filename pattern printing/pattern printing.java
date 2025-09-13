import java.util.Scanner;
class abc{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int r = s.nextInt();
        // System.out.println("Enter no. of cols: ");
        // int c = s.nextInt();

        // Question 1
        // for(int i = 0; i<rows; i++){
        //     for(int j =0; j<cols; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Question 2
        // for(int i = 0; i<rows; i++){
        //     for(int j =0; j<cols; j++){
        //         if(i==0 || j==0 || i==rows-1 || j == cols-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Question 3
        // for(int i = 0; i<r; i++){
        //     for(int j =0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Question 4
        //  for(int i = 0; i<r; i++){
        //     for(int j =r-1; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Question 5
        // int n = 2*r -1;
        // for(int i = 0; i<r; i++){
        //     // for(int j =0 ; j<n ; j++){
        //         for(int k = 0; k<r-1-i; k++){
        //             System.out.print(" ");
        //         }
        //         for(int l = 0; l<2*i+1; l++){
        //             System.out.print("*");
        //         }
        //     // }
        //     System.out.println();
        // }


        // Question 6
        // for(int i = 0; i<7; i++){
        //     int k = i+1;
        //     for(int j = 0; j<7; j++){
        //         if(k<=7){
        //             System.out.print(k++ + " ");
        //         }
        //         else{
        //             System.out.print(k++ - 7 + " ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Question 7
        // for(int i = 1; i<=r ; i++){
        //     for(int j = 1; j<=c ; j++){
        //         if( (i+j) % 2 ==0){
        //             System.out.print(1);
        //         }
        //         else{
        //             System.out.print(2);
        //         }
        //     }
        //     System.out.println();
        // }

        
        // Question 8
        // for(int i = 1; i<=r; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // Question 9
        for(int i =1; i<=r; i++){
            for(int j =1; j<= r -i; j++){
                System.out.print(" ");
            }
                for(int l = 1; l<=i; l++){
                    System.out.print(l);
                }
                for(int m = i-1; m>=1; m--){
                    System.out.print(m);
                }
            
            System.out.println();
        }
}
}
