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
            merge(arrayA, 5, arrayB, 5, arrayC);
            System.out.println("");
            System.out.println("");
            display(arrayC, 10);
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
            while(aDex <sizeA && bDex < sizeB){
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
            //display the final array
        public static void display(int[] theArray, int size){
            System.out.println("Here is arrayC :");
            for( int i = 0; i < size; i++){
                System.out.print( theArray[i] + " ");
            }
            System.out.println(" ");
        }
    
    
    
    
 
    
}
