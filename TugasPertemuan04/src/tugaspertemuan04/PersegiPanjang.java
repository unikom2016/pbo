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
public class PersegiPanjang {
    private int panjang;
    private int lebar;

    /**
     * Default constructor
     */
    public PersegiPanjang() {
    }

    /**
     * Isi panjang dan lebar melalui constructor
     * @param panjang
     * @param lebar
     */
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        return getPanjang() * getLebar();
    }
}
