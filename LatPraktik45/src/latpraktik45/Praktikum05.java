/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik45;

/**
 *
 * @author Mahasiswa
 */
class kotak {

    double panjang;
    double lebar;
    double tinggi;
    
    void isi_data(double p, double l, double t) {
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

public class Praktikum05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instance objek
        kotak k1 = new kotak();

        //input data
        k1.isi_data(4, 3, 2);

        //memanggil method cetak volume
        System.out.println("Volume Kotak = " + k1.hitung_volume());
    }

}
