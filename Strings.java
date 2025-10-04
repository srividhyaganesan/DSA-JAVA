import java.util.Scanner;

public class Strings {

    public static void printallsubstrings(String s){

        for(int i=0;i<s.length();i++){
            String substr="";
            substr+=s.charAt(i);
            System.out.println(substr);

            for(int j=i+1;j<s.length();j++){
                substr+=s.charAt(j);
                System.out.println(substr);
            }

        }
    }

    public static int findshortestpath(String s){
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                x--;
            }
            else if(s.charAt(i)=='E'){
                x++;
            }
            else if(s.charAt(i)=='S'){
                y--;
            }
            else{
                y++;
            }
        }
        int sqr=x*x + y*y;
        return (int) Math.sqrt(sqr);
    }

    public static boolean checkpalindrome(String s){

        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String [] args){

        // check if a string is palindrome
        /* 

        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        boolean output=checkpalindrome(name);
        System.out.println(output);
        */

        // find shortest path to reach destination

        /* 

        String s="WNEENESENNN";
        int a=findshortestpath(s);
        System.out.println(a);
        */

        // print substrings of the string

        /* 

        String s="HelloWorld";

        printallsubstrings(s);

        */

        // compare and ignorecase function

        String s[]={"apple","mango","banana"};

        String largest=s[0];

        for(int i=1;i<s.length;i++){
            /* 
            if(largest.compareTo(s[i])<0){
                largest=s[i];
            }
            */

            // compare to ignore 
            if(largest.compareToIgnoreCase(s[i])<0){
                largest=s[i];
            }
        }
        System.out.println(largest);



    }

}
