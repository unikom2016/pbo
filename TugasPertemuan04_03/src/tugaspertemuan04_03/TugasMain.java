/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan04_03;

import java.util.Scanner;

/**
 *
 * @author Mahasiswa
 */
public class TugasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelanggan p1 = new Pelanggan();
        
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        p1.isi_sisi(baca.nextInt());

        System.out.println("Luas Persegi = " + p1.hitungluas());
    }

}
