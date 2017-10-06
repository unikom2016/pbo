/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik46;

/**
 *
 * @author Mahasiswa
 */
class kotak {

    double panjang;
    double lebar;
    double tinggi;

    // define constructor with static values
    kotak() {
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }

    //mendifinisikan method void yang mengembalikkan tipe double
    double hitung_volume() {
        // mengembalikkan nilai
        return panjang * lebar * tinggi;

    }
}

public class Praktikum06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instance objek
        kotak k1 = new kotak();
        System.out.println("Volume K1= " + k1.hitung_volume());
        
        kotak k2 = new kotak();
        System.out.println("Volume K2= " + k2.hitung_volume());
    }

}
