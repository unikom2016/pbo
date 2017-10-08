/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas06.contohprotected;


class Persegi {
    protected double sisi;

    public Persegi() {
    }

    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
    }

    protected double getSisi() {
        return sisi;
    }

    protected void setSisi(double sisi) {
        this.sisi = sisi;
    }
}

public class Main06Protected extends Persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi pp = new Persegi();
        pp.sisi = 5;
        System.out.println(pp.getSisi());
    }
    
}
