/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktik40;

/**
 *
 * @author Mahasiswa
 */
class mahasiswa {

    public String nim;
    public String nama;
    public double nilai;

    public String tampil_nim() {
        return nim;
    }

    public String tampil_nama() {
        return nama;
    }

    public double hasil_nilai() {
        double hasil_nilai = nilai * 0.5;
        return hasil_nilai;
    }
}

public class Praktikum0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();

        mhs.nim = "10116122";
        mhs.nama = "Mochamad Iqbal Dwi Cahyo";
        mhs.nilai = 70;

        System.out.println("Nim Mahasiswa   " + mhs.nim);
        System.out.println("Nama Mahasiswa  " + mhs.nama);
        System.out.println("Nilai Mahsiswa  " + mhs.hasil_nilai());

    }

}
