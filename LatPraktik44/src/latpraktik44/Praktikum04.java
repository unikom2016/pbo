/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik44;

/**
 *
 * @author Mahasiswa
 */
class kotak {

    double panjang;
    double lebar;
    double tinggi;

    //mendifinisikan method void yang mengembalikkan tipe double
    double hitung_volume() {
        double vol = panjang * lebar * tinggi;
        // mengembalikkan nilai
        return vol;

    }
}

public class Praktikum04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instance objek
        kotak k1 = new kotak();
        kotak k2 = new kotak();
        kotak k3 = new kotak();

        //input k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;

        //input k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        //input k3
        k3.panjang = 6;
        k3.lebar = 2;
        k3.tinggi = 6;

        //memanggil method cetak volume
        System.out.println("Volume K1= " + k1.hitung_volume());
        System.out.println("Volume K2= " + k2.hitung_volume());
        System.out.println("Volume K3= " + k3.hitung_volume());
    }

}
