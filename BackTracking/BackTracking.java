

public class BackTracking{
    public static int maze(int sr , int sc, int er, int ec){
        if(sr > er || sc>ec) return 0;
        if(sr == er && sc==ec) return 1;
        int downways = maze(sr+1,sc,er,ec);
        int rightways = maze(sr,sc+1,er,ec);
        int totalways = downways + rightways;
        return totalways;
    }

    public static void print(int sr , int sc, int er, int ec , String s){
         if(sr > er || sc>ec) return ;
        if(sr == er && sc==ec){
            System.out.println(s);
            return;
        } 
         // go down
         print(sr+1,sc,er,ec,s+"D");   
         // go right
         print(sr,sc+1,er,ec,s+"R");   
    }

    public static void print2(int sr , int sc, int er, int ec , String s, boolean[][] isVisited ){
        if(sr<0 || sc<0) return;
         if(sr > er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr == er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go down
         print2(sr+1,sc,er,ec,s+"D", isVisited);   
         // go right
         print2(sr,sc+1,er,ec,s+"R", isVisited); 
        // go left
         print2(sr,sc-1,er,ec,s+"L", isVisited);
         // go up
         print2(sr-1,sc,er,ec,s+"U", isVisited);

         isVisited[sr][sc] = false;
    }

    public static void Ratinadeadmaze(int sr , int sc, int er, int ec, String s, int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0)return;
        if(maze[sr][sc] == -1) return;

        maze[sr][sc] = -1;
        // go down
         Ratinadeadmaze(sr+1,sc,er,ec,s+"D", maze);   
         // go right
         Ratinadeadmaze(sr,sc+1,er,ec,s+"R", maze); 
        // go left
         Ratinadeadmaze(sr,sc-1,er,ec,s+"L", maze);
         // go up
         Ratinadeadmaze(sr-1,sc,er,ec,s+"U", maze);

         maze[sr][sc] = 1;
    }

    public static void printpermutation(String s , String ans){
        if(s.length() == 0  ){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left + right;
            printpermutation(rem, ans+ch);
        }
    }public static boolean isSafe(char[][] board , int row , int col){
        int n = board.length;
        for(int j = 0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }
        for(int i = 0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }

        // check north east
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // check south east
         i = row;
         j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        // check south west
         i = row;
         j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        // check north west
         i = row;
         j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public static void nqueen(char[][] board , int row){
        int n = board.length;
        if(row == n){
             for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                 System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
            return;
        }

        for(int j = 0; j<n; j++){
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                nqueen(board, row+1);
                board[row][j] = '.';
            }
        }
    }
    public static void main(String[] args) {
        // MazePath
        // int rows = 3;
        // int cols = 3;
        // int count = maze(1,1,rows,cols);
        // System.out.println(count);


        // Printpath
        // int rows = 3;
        // int cols = 3;
        // print(0,0,rows-1,cols-1, "");


        // Printpath 2 (Going up and left is also allowed)
        // int rows = 3;
        // int cols = 3;
        // boolean[][] isVisited = new boolean[rows][cols];
        // print2(0,0,rows-1,cols-1, "" , isVisited);


        // Rat in a dead maze (Some blocks in the maze are blocked and cannot be entered)
        // int rows = 3;
        // int cols = 4;
        // int[][] maze = {{1,0,1,1} , {1,1,1,1} , {1,1,0,1}};
        // Ratinadeadmaze(0,0,rows-1,cols-1,"", maze);


        // Print Permutations
        // String s =  "abc";
        // printpermutation(s,"");


        // N Queens
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nqueen(board , 0);
    }
}