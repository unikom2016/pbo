package shapes;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Mahasiswa
 */
public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Keliling Persegi Panjang: " + 2 * (panjang + lebar));
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Luas Persegi Panjang : " + panjang * lebar);
    }

    public void hitungLuas(int order) {
        System.out.println("Luas Persegi Panjang " + order + " : " + panjang * lebar);
    }

}
