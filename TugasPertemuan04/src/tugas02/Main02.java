/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas02;

import shapes.*;

import java.util.Scanner;

/**
 *
 * @author Mahasiswa
 */
public class Main02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p1 = new Persegi();
        
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        p1.setSisi(baca.nextInt());
        p1.hitungLuas();
    }

}
