/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik41;

/**
 *
 * @author Mahasiswa
 */
class kotak {   //attribute

    double panjang;
    double lebar;
    double tinggi;
    double volume;
}

public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //membuat objek dari kotak
        kotak k = new kotak();

        //mengisi objek kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;

        //rumus mencari volume
        k.volume = k.panjang * k.lebar * k.tinggi;

        //output
        System.out.println("Volume kotak= " + k.volume);
    }

}
