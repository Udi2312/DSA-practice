public class Strings {
    static boolean checkpallendrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        // Print all substrings of a given string
        // String s = "abcd";
        // for(int i = 0; i<s.length(); i++){
        //     for(int j = i+1; j<s.length()+1; j++){
        //         System.out.print(s.substring(i,j) + " ");
        //     }
        // }


        // Toggle all the characters of a string 
        // StringBuilder s = new StringBuilder("Hello World");
        // System.out.println(s);
        // for(int i = 0; i<s.length(); i++){
        //     int ascii = (int)s.charAt(i);
        //     if(s.charAt(i) == ' '){
        //         continue;
        //     }
        //     if(ascii < 97){
        //         ascii += 32;
        //         char dh = (char)ascii;
        //         s.setCharAt(i,dh);
        //     }
        //     else{
        //         ascii -= 32;
        //         char dh = (char)ascii;
        //         s.setCharAt(i,dh);
        //     }
        // }
        // System.out.println(s);


        // Toggle all the characters of a string without string builder
        // String s = "Hello";
        // System.out.println(s);
        //   for(int i = 0; i<s.length(); i++){
        //     int ascii = (int)s.charAt(i);
        //     if(s.charAt(i) == ' '){
        //         continue;
        //     }
        //     if(ascii < 97){
        //         ascii += 32;
        //         char dh = (char)ascii;
        //         s = s.substring(0,i) + dh + s.substring(i+1);            }
        //     else{
        //         ascii -= 32;
        //         char dh = (char)ascii;
        //         s = s.substring(0,i) + dh + s.substring(i+1);
        //     }
        // }
        // System.out.println(s);


        // Return the number of palllendrome substrings in a string
        // String s = "abbd";
        // int count = 0;
        // for(int i = 0; i<s.length(); i++){
        //     for(int j = i+1; j<s.length()+1; j++){
        //         if(checkpallendrome(s.substring(i,j))){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);


        // Reverse words in a sentence
        // String s = "I am Udit Bansal";
        // String ans = "";
        // StringBuilder sb = new StringBuilder("");
        // for(int i = 0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch != ' '){
        //         sb.append(ch);
        //     }
        //     else{
        //         sb.reverse();
        //         ans += sb;
        //         ans += " ";
        //         sb = new StringBuilder("");
        //     }
        // }
        // sb.reverse();
        //     ans += sb;
        // System.out.println(ans);


        // String Compression
        // String s = "aaabbcccdde";
        // String ans = "" + s.charAt(0);
        // int count = 1;
        // for(int i = 1; i<s.length(); i++){
        //     char curr = s.charAt(i);
        //     char prev = s.charAt(i-1);
        //     if(curr == prev){
        //         count++;
        //     }
        //     else{
        //         if(count > 1){
        //             ans += count;
        //         }
        //         count = 1;
        //         ans += curr;
        //     }
        // }
        // if(count > 1){
        //             ans += count;
        //         }
        // System.out.println(ans);
    }
}
