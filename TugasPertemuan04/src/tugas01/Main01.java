/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas01;

import shapes.PersegiPanjang;

/**
 *
 * @author Mahasiswa
 */
public class Main01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang p1 = new PersegiPanjang();
        p1.setLebar(4);
        p1.setPanjang(4);
        p1.hitungLuas(1);

        PersegiPanjang p2 = new PersegiPanjang();
        p2.setLebar(3);
        p2.setPanjang(3);
        p2.hitungLuas(2);
    }
    
}
