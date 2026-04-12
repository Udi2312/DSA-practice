import java.util.*;
public class stack3 {
    public static void main(String[] args) {
        // Infix Evaluation
        // String str = "9-(5+3)*4/6";
        // Stack<Integer> val = new Stack<>();
        // Stack<Character> op = new Stack<>();
        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     int ascii = (int)ch;
        //     if(ascii >= 48 && ascii<= 57){
        //         val.push(ascii-48);
        //     }
        //     else if(op.size() == 0 || ch == '(' || op.peek() == '('){
        //         op.push(ch);
        //     }
        //     else if(ch == ')'){
        //         while(op.peek() != '('){
        //              int v2 = val.pop();
        //             int v1 = val.pop();
        //             if(op.peek() == '+') val.push(v1 + v2);
        //             else if(op.peek() == '-') val.push(v1 - v2);
        //            else if(op.peek() == '*') val.push(v1 * v2);
        //             else val.push(v1 / v2);
        //             op.pop();
        //         }
        //         op.pop();
        //     }
        //     else{
        //         if(ch == '+' || ch == '-'){
        //             int v2 = val.pop();
        //             int v1 = val.pop();
        //             if(op.peek() == '+') val.push(v1 + v2);
        //             else if(op.peek() == '-') val.push(v1 - v2);
        //            else if(op.peek() == '*') val.push(v1 * v2);
        //             else val.push(v1 / v2);
        //             op.pop();
        //             op.push(ch);
        //         }

        //         if(ch == '*' || ch == '/'){
        //             if(op.peek() == '*' || op.peek() == '/'){
        //                 int v2 = val.pop();
        //             int v1 = val.pop();
        //             if(op.peek() == '*') val.push(v1 * v2);
        //             else val.push(v1 / v2);
        //             op.pop();
        //             op.push(ch);
        //             }
        //             else op.push(ch);
        //         }
        //     }
        // }
        // while(val.size() > 1){
        //     int v2  = val.pop();
        //     int v1  = val.pop();
        //      if(op.peek() == '+') val.push(v1 + v2);
        //     else if(op.peek() == '-') val.push(v1 - v2);
        //     else if(op.peek() == '*') val.push(v1 * v2);
        //     else val.push(v1 / v2);
        //     op.pop();
        // }
        // System.out.println(val.peek());

        
        // Infix to prefix

        //  String infix = "9-(5+3)*4/6";
        //  System.out.println("Infix expression: " + infix);
        // Stack<String> val = new Stack<>();
        // Stack<Character> op = new Stack<>();
        // for(int i = 0; i<infix.length(); i++){
        //     char ch = infix.charAt(i);
        //     int ascii = (int)ch;
        //     if(ascii >= 48 && ascii<= 57){
        //         String s = "" + ch;
        //         val.push(s);
        //     }
        //     else if(op.size() == 0 || ch == '(' || op.peek() == '('){
        //         op.push(ch);
        //     }
        //     else if(ch == ')'){
        //         while(op.peek() != '('){
        //              String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = o + v1  + v2;
        //             val.push(t);
        //         }
        //         op.pop();
        //     }   
        //     else{
        //         if(ch == '+' || ch == '-'){
        //             String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = o + v1  + v2;
        //             val.push(t);
        //             op.push(ch);
        //         }

        //         if(ch == '*' || ch == '/'){
        //             if(op.peek() == '*' || op.peek() == '/'){
        //                String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = o + v1  + v2;
        //             val.push(t);
        //             op.push(ch);
        //             }
        //             else op.push(ch);
        //         }
        //     }
        // }
        // while(val.size() > 1){
        //     String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = o + v1  + v2;
        //             val.push(t);
            
        // }
        // String prefix = val.pop();
        // System.out.println("Prefix expression: " +prefix);


        // Infix to Postfix

        //  String infix = "9-(5+3)*4/6";
        //  System.out.println("Infix expression: " + infix);
        // Stack<String> val = new Stack<>();
        // Stack<Character> op = new Stack<>();
        // for(int i = 0; i<infix.length(); i++){
        //     char ch = infix.charAt(i);
        //     int ascii = (int)ch;
        //     if(ascii >= 48 && ascii<= 57){
        //         String s = "" + ch;
        //         val.push(s);
        //     }
        //     else if(op.size() == 0 || ch == '(' || op.peek() == '('){
        //         op.push(ch);
        //     }
        //     else if(ch == ')'){
        //         while(op.peek() != '('){
        //              String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = v1  + v2 + o;
        //             val.push(t);
        //         }
        //         op.pop();
        //     }   
        //     else{
        //         if(ch == '+' || ch == '-'){
        //             String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = v1  + v2 + o;
        //             val.push(t);
        //             op.push(ch);
        //         }

        //         if(ch == '*' || ch == '/'){
        //             if(op.peek() == '*' || op.peek() == '/'){
        //                String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = v1  + v2 + o;
        //             val.push(t);
        //             op.push(ch);
        //             }
        //             else op.push(ch);
        //         }
        //     }
        // }
        // while(val.size() > 1){
        //     String v2 = val.pop();
        //             String v1 = val.pop();
        //             char o = op.pop();
        //             String t = v1  + v2 + o;
        //             val.push(t);
            
        // }
        // String prefix = val.pop();
        // System.out.println("Postfix expression: " +prefix);


        // Evaluation of Postfix expressions

    //     String str = "953+4*6/-";
    //     Stack<Integer> val = new Stack<>();
    //     for(int i = 0; i<str.length(); i++){
    //         char ch = str.charAt(i);
    //         int ascii = (int)ch;
    //         if(ascii >= 48 && ascii<= 57){
    //             val.push(ascii-48);
    //         }
    //          else{
    //             int v2 = val.pop();
    //             int v1 = val.pop();
    //             if(ch == '+') val.push(v1 + v2);
    //             if(ch == '-') val.push(v1 - v2);
    //             if(ch == '*') val.push(v1 * v2);
    //             if(ch == '/') val.push(v1 / v2);
    //          }
    // }
    // System.out.println(val.peek());


    // Evaluation of Prefix expressions

    //  String str = "-9/*+5346";
    //     Stack<Integer> val = new Stack<>();
    //     for(int i = str.length() -1; i>=0 ; i--){
    //         char ch = str.charAt(i);
    //         int ascii = (int)ch;
    //         if(ascii >= 48 && ascii<= 57){
    //             val.push(ascii-48);
    //         }
    //          else{
    //             int v1 = val.pop();
    //             int v2 = val.pop();
    //             if(ch == '+') val.push(v1 + v2);
    //             if(ch == '-') val.push(v1 - v2);
    //             if(ch == '*') val.push(v1 * v2);
    //             if(ch == '/') val.push(v1 / v2);
    //          }
    // }
    // System.out.println(val.peek());


    // Prefix to Postfix

    //     String str = "-9/*+5346";
    //     Stack<String> val = new Stack<>();
    //     for(int i = str.length() -1; i>=0 ; i--){
    //         char ch = str.charAt(i);
    //         int ascii = (int)ch;
    //         if(ascii >= 48 && ascii<= 57){
    //             val.push(ch + "");
    //         }
    //          else{
    //             String v1 = val.pop();
    //             String v2 = val.pop();
    //             char op = ch;
    //             String t = v1+v2+op;
    //             val.push(t); 
    //          }
    // }
    // System.out.println(val.peek());


    // Postfix to Infix

        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<= 57){
                val.push(ch+"");
            }
             else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
             }
    }
    System.out.println(val.peek());
}
}
