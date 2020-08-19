
import java.util.ArrayList;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class recursion {
    public static void main(String arg[]){
        recursive(3);
        
        DecendingCount(5);
        
        System.out.println("factorial is: " +  fact(10));
        
        System.out.println(fingers(2));
        
        System.out.println(power(56,3));
        
        
        System.out.println(fibonacci(8));
        
        
        System.out.println(sum(823));
        
        
        int [] arr = {4,6,8,9,61,64,78};
        System.out.println("found number at index: " + binarysearch(arr, 61, 0, arr.length-1 ));
        
        
            int[] arrayA = {23,47,83,98,958};
            int[] arrayB = {54,58,65,71,81};
            int[] arrayC = new int[10];
            
            System.out.println("This is arrayA: ");
            for(int i = 0; i < arrayA.length; i++){
                System.out.print(arrayA[i] + " ");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("This is arrayB: ");
            for(int i = 0; i < arrayB.length; i++){
                System.out.print(arrayB[i] + " ");
            }
            //calling merge method
            merge(arrayA, 5, arrayB, 5, arrayC);
            System.out.println("");
            System.out.println("");
            display(arrayC, 10);
            
            // calling palindrom method
            
            String[] palindrome = {"b","a","n","a","n","a"};
            System.out.println("check palindrome: " + isPalindrom(palindrome));
            
            
            //coin change algorith:
//            int [] coins ={50,25,10,5};
//            System.out.println("number of coins for " + chanz(20, coins));
            
            
            String[] act = {"w","f"};
            
            String[] test = {"b", "k", "l"};
            
            merger(act, test);
            
            //testing string unik checking
            System.out.println("is this unik: " + isCharUniq("insp_elmt"));
            
            //testing permutation:
            System.out.println("Permutation is: " + arePermutated("Abdoul", "luodbA"));
            
            
            //filling spaces:
//            String[] trial = {"I love Google"};
//            char[] text = trial.toCharArray();
//            int siz = trial.length;
//            System.out.println(replacesSpaces(text, siz));

            int [] balance ={1,1,0,2};
            System.out.println(equilibrium(balance));
            
            ///isRotation:
            System.out.println("Test if it is rotation: " + isRotation("Coffee", "eeffoC"));
    }
    
    //Here ends the main method
    ///////////////////////////////////////////////////
    //////////////////////////////////////////////////
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////
    
    
    //simple recursive printing algo
    public static void recursive(int n){
        
        if( n == 0){
            System.out.println("Dome iterating");
        }else{
                System.out.println("Hello World");
                n--;
                recursive(n);
                }
        
    }
    
    //counting using recursion
    public static void DecendingCount(int n){
        
        if( n == 0){
            System.out.println("Done counting");
        }else{
             System.out.println(n);
             n--;
             DecendingCount(n);
         }    
    }
    
    
    //factorial using recursion
    public static int fact(int n){
        if(n==1){
            System.out.println("factorial(" + n + ") = 1");
           return 1; 
        }else{
            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n-1) + ")");
            return n*fact(n-1);
        }
    }
    
    
    //count number of fingers people have
    public static int fingers(int people){
        if(people == 1){
            return 10;
        }else{
            System.out.println(people+(people-1));
            return 10 + fingers(people-1);
        }
    }
    
    //return change
    public static int chanz(int money, int[] coins){
        int size = coins.length;
        for(int i = size; i>0; i--){
            if(money == coins[i]){
                return i;
            }else{
                return money%coins[i] + chanz(money%coins[i-1], coins);
            }
        }
        return -1;
    }
    
    //return power of a number using recursion 
    public static int power(int base, int num){
        if(num == 1 || num == 0){
            return base;
        }else{
            return base * power(base, num - 1);
        }
    }
    
    //fibonacci: This return the index at which a fibonacci number is located counting from 0.
    // each number is equal to the sum of the last two previous in the series
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return fibonacci(num-1) + fibonacci(num - 2);
        }
    }
    

    
    // add the values of given set
    public static int sum(int num){
        if(num <=9){
            return num;
        }else{
            return num % 10 + sum(num /10);
        }
    }
    
    
    public static int binarysearch(int[] arr, int val, int start, int end){
        if(start <= end){
            int mid = (start + end) /2;
            
            if(arr[mid] > val){
                return binarysearch(arr, val, start, mid-1);
            }else if( arr[mid] < val){
                return binarysearch(arr, val, mid+1, end);
            }else{
                return mid;
            }
        }else{
            return -1;
        }
    }
    
    // Merging two arrays using recursion
        public static void merge( int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC){
            int aDex = 0;
            int bDex = 0;
            int cDex = 0;           
//            int sizeA = arrayA.length;
//            int sizeB = arrayB.length;
            while(aDex <sizeA && bDex < sizeB){         //all arrays not empty
                if( arrayA[aDex] < arrayB[bDex]){
                    arrayC[cDex++] = arrayA[aDex++];
                }else{
                    arrayC[cDex++] = arrayB[bDex++];
                }
                
            }
            while( aDex < sizeA){
                arrayC[cDex++] = arrayA[aDex++];
            }
            while( aDex < sizeB){
                arrayC[cDex++] = arrayB[bDex++];
            }
        }
        
        public static void merger(String[] words, String[] mots){
            ArrayList<String> wordCloud = new ArrayList<>();
            for( String a: words){
                wordCloud.add(a);  
            }
            for(String b: mots){
                wordCloud.add(b);
            }
            System.out.println(wordCloud);
        }
            //display the final array
        public static void display(int[] theArray, int size){
            System.out.println("Here is arrayC :");
            for( int i = 0; i < size; i++){
                System.out.print( theArray[i] + " ");
            }
            System.out.println(" ");
        }
        
        
        //check if string is palindrome:
        public static boolean isPalindrom(String[] s){
            int size = s.length;
            for( int i = 0; i <= size; i++){
                if( s[i] != s[size-1-i]){
                    return false;
                }
                
            }
            return true;
        }
        

        //coins number of coins:
        public static int change(int val, int[] coins){  
            int variables = coins.length;
             int change = 0;
            
            for(int i = variables; i >= 0 ; i--){
                while( val > coins[i]){
                    if( val % coins[i] == 0){
                        change = val/coins[i];
                        System.out.println("number of coins needed is: " + change);
                     }else if( val % coins[i] != 0){
                            val = val % coins[i];
                            change = val/coins[i] + val/coins[i-1];
                     }      
                   return change;     
                }  //end while
                return -1;               
            }       //end for
            return change;
        }       // end method
        
        
        //check if string has repeating character. NB: without using additional data structures
        public static boolean isCharUniq(String s){
            int size = s.length();
            String space = "";
            if( size > 256){
                return false;
            }
            boolean[] setOfChar = new boolean[128];
            for( int i = 0; i < size; i++){
                int val = s.charAt(i);
                if( setOfChar[val]){    //means detected a repetition. this include an empty space
                    return false;
                }
                setOfChar[val] = true;
            }    
            return true;
        }
        
        
        //Check if two strings are permutation of one another:
        public static String sort(String s){
            char[] content = s.toCharArray();
            java.util.Arrays.sort(content);
            return new String(content);
            }
        public static boolean arePermutated(String s, String c){

            if( s.length() != c.length()){
                return false;
            }
            return sort(s).equals(sort(c));     
        }
        
        //replaces space in given string with something:
        public static void replacesSpaces(char[] string, int length){
            int spaces = charCount(string, 0, length, ' ');
            int newIndex = length-1+spaces*2;
            
            if( newIndex+1 < string.length){
                string[newIndex+1] = '\0';
            }
            for( int oldIndex = length-1; oldIndex >= 0; oldIndex -= 1){
                if( string[oldIndex] == ' '){
                    string[newIndex] = '\0';
                    string[newIndex-1] = '2';
                    string [newIndex-2] = '%';
                    newIndex -= 3;
                }else{
                    string[newIndex] = string[oldIndex];
                    newIndex -= 1;
                }
            }
        }
        public static int charCount( char[] string, int start, int end, int target){
            int count = 0;
            for( int i = start; i < end; i++){
                if( string[i] == target ){
                    count ++;
                }
            }
            return count;
        }
    
    
        //this algorithm find the equilibruim index of a given array of integers.(SPS mock interview)
        //Time complexity is O(n)
        public static int equilibrium(int[] arr) {
            int left = arr[0], right = 0;
            for (int i = 2; i < arr.length; i++) {
                right += arr[i];
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if (left == right)
                        return i;
                left += arr[i];
                right -= arr[i+1];
            }
            return -1;
        }
  
        
        ///this algorithm check for permutated palindrome
//        public static boolean isPalindromePermutated(String phrase) {
//            int countOdd = 0;
//            int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
//            for (char c : phrase.toCharArray()) {
//                int x = getCharNumber(c);
//                if (x != -1) {
//                    table[x]++;
//                    if (table[x] % 2 == 1){
//                        countOdd++;
//                    } else {
//                        countOdd--;
//                    }
//                }
//            }
//            
//            return countOdd <= 1;
//        }
        
        
        // String rotation:
        public static boolean isRotation(String s1, String s2) {
            int size = s1.length();
            
            if (size == s2.length() && size > 0) {
                String s1s1 = s1 + s1;
                return isSubstring(s1s1, s2);
            }
            return false;
        }
        public static boolean isSubstring(String s1, String s2){
            if(s1.length()<s2.length()) return false;
            if(s1.length()==s2.length()) return s1.equals(s2);
            for(int i=0;i<=s1.length()-s2.length();i++){
                if(s1.charAt(i)==s2.charAt(0)){
                    int matchLength=1;
                    for(int j=1;j<s2.length();j++){
                        if(s1.charAt(i+j)!=s2.charAt(j)){
                            break;
                        }
                        matchLength++;
                    }
                    if(matchLength==s2.length()) return true;
                }
            }
            return false;
        }
//
//        private static boolean isSubstring(String s1s1, String s2) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
      

    
}
