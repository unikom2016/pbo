/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author mochadwi
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner in = new Scanner(System.in);
        
        int a0 = 5;
        int a1 = 6;
        int a2 = 7;
        
        int b0 = 3;
        int b1 = 6;
        int b2 = 10;
        
        int[] results = solve(a0, a1, a2, b0, b1, b2);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
    
    private static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] res = new int[2];
        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};
        
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                ++res[0];
            } else if (a[i] < b[i]) {
                ++res[1];
            }
        }
        
        
        return res;
    }
    
}
