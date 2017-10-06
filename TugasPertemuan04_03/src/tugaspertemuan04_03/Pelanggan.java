/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan04_03;

/**
 *
 * @author Mahasiswa
 */
public class Pelanggan {
    private String namaDepan;
    private String namaBelakang;
    
    public Pelanggan() {
        
    }
    
    public Pelanggan(String namaDepan, String namaBelakang) {
        
    }
    
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }
    
    public String getNamaDepan() {
        return this.namaDepan;
    }
    
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    
    public String getNamaBelakang() {
        return this.namaBelakang;
    }
    
    public String getFullName() {
        return getNamaDepan() + " " + getNamaBelakang();
    }
}
