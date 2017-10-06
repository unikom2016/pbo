/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan04_02;

/**
 *
 * @author Mahasiswa
 */
public class Persegi_Panjang {

    public double sisi;
    
    public void isi_sisi(int sisi) {
        this.sisi = sisi;
    }

    public double hitungluas() {
        return sisi * sisi;
    }
}
