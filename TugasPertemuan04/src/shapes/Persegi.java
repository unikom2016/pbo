package shapes;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi() {
    }

    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Luas persegi: " + (sisi * sisi));
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Keliling persegi: " + (2 * sisi));
    }

    public void hitungKeliling(int order) {
        System.out.println("Keliling persegi " + order + " : " + (2 * sisi));
    }
}