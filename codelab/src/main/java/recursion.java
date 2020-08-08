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
}
