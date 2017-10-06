/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugaspertemuan04;

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
        PersegiPanjang p1 = new PersegiPanjang();
        p1.setLebar(4);
        p1.setPanjang(4);
        System.out.println("Luas Persegi Panjang 1 = " + p1.getLuas());

        PersegiPanjang p2 = new PersegiPanjang();
        p2.setLebar(3);
        p2.setPanjang(3);
        System.out.println("Luas Persegi Panjang 2 = " + p2.getLuas());
    }
    
}
