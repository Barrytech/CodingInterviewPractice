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
        
        System.out.println(fact(5));
        
        System.out.println(fingers(2));
        
        System.out.println(power(56,3));
        
        
        System.out.println(fibonacci(8));
        
        
        System.out.println(sum(823));
        
        
        int [] arr = {4,67,6,64};
        System.out.println(binarysearch(arr, 6, 0, 4));
    }
    
    public static void recursive(int n){
        
        if( n == 0){
            System.out.println("Dome iterating");
        }else{
                System.out.println("Hello World");
                n--;
                recursive(n);
                }
        
    }
    public static void DecendingCount(int n){
        
        if( n == 0){
            System.out.println("Done counting");
        }else{
                System.out.println(n);
                n--;
                DecendingCount(n);
         }    
    }
    
 
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
    
    //return power
    
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
    
    
//    public static int sumArray(int[] arr, int size, int index){
//        if( index == 0){
//            return arr[0];
//        }else{
//            return sumArray(arr[index]) + sumArray(arr[index+1]);
//        }
//    }
    
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
    
    
    
    
 
    
}
