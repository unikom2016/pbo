/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik47;

/**
 *
 * @author Mahasiswa
 */
class kotak {

    double panjang;
    double lebar;
    double tinggi;

    kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    //mendifinisikan method void yang mengembalikkan tipe double
    double hitung_volume() {
        double vol = panjang * lebar * tinggi;
        // mengembalikkan nilai
        return vol;

    }
}

public class Praktikum07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instance objek
        //input k1
        kotak k1 = new kotak(4, 3, 2);

        //memanggil method cetak volume
        System.out.println("Volume K1= " + k1.hitung_volume());
    }

}
