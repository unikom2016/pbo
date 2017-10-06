/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik43;

/**
 *
 * @author Mahasiswa
 */
class kotak {

    double panjang;
    double lebar;
    double tinggi;

    //mendefinisikan method void(tidak mengembalikan nilai)
    void cetak_volume() {
        System.out.println("Volume Kotak = " + (panjang * lebar * tinggi));
    }
}

public class Praktikum03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // instance objek
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
        k1.cetak_volume();
        k2.cetak_volume();
        k3.cetak_volume();
    }

}
